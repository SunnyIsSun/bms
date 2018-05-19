package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class JdbcUtil {

	private static String driver = "oracle.jdbc.driver.OracleDriver";
	private String url = "jdbc:oracle:thin:@localhost:1521:orcl";;
	private String username = "ba";
	private String password = "admin";
	private Connection connection;
	private PreparedStatement pstm;
	private ResultSet rs;
	
	//加载数据库驱动
	static{
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	
	//获取数据库连接对象
	public Connection getConnection(){
		try {
			connection=DriverManager.getConnection(url,username,password);
			//connection = ds.getConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return connection;
		
	}
	//对数据库增、删，改操作
	public boolean updateByPrearedStatement(String sql,List<?> params){
		boolean flag=false;
		try {
			pstm=connection.prepareStatement(sql);
			if(params!=null && params.size()>0){
					for(int i=0;i<params.size();i++){
						pstm.setObject(i+1, params.get(i));
					}
			}
			int rownum=pstm.executeUpdate();
			if(rownum > 0){
				flag=true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return flag;
		
	}
	
	//查询数据库
	public ResultSet queryByPreparedStatement(String sql,List<?> params){
		try {
			pstm=connection.prepareStatement(sql);
			if(params!=null && params.size()>0){
					for(int i=0;i<params.size();i++){
						pstm.setObject(i+1, params.get(i));
					}
			}
			rs=pstm.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rs;
	}
	//关闭数据库资源
	public void close(){
		if(connection!=null){
			try {
				if(rs!=null){
					rs.close();
				}
				if(pstm!=null){
					pstm.close();
				}
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		JdbcUtil jdbc = new JdbcUtil();
		jdbc.getConnection();
	}
}
