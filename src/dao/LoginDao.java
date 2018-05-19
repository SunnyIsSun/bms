package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import jdbc.JdbcUtil;

public class LoginDao {
	JdbcUtil jdbc = new JdbcUtil();
	
	public boolean validate(String username,String password){
		//获取连接
		jdbc.getConnection();
		String sql = "  select m_no, m_password, m_username from manager where  m_username=? and m_password=?";
		 //设置参数
		 List<String> params = new ArrayList<String>();
		 params.add(username);
		 params.add(password);
		 //执行sql语句
		 ResultSet rs = jdbc.queryByPreparedStatement(sql, params);
		 boolean flag=false;//标识用户名密码是否正确  默认false
		try {
			if(rs.next()){
				 flag=true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			jdbc.close();
		}
		return flag;
	}
}
