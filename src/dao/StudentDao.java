package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import jdbc.JdbcUtil;

public class StudentDao {
	JdbcUtil jdbc = new JdbcUtil();
	
	public boolean haveStu(String sno){
		//获取连接
		jdbc.getConnection();
		String sql = "  select s_no, s_name from student where s_no=? ";
		 //设置参数
		 List<String> params = new ArrayList<String>();
		 params.add(sno);
		 //执行sql语句
		 ResultSet rs = jdbc.queryByPreparedStatement(sql, params);
		 boolean flag=false;
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
	
	public boolean insertStu(String sno,String sname){
		//获取连接
		jdbc.getConnection();
		String sql = "  insert into student (s_no, s_name)values (?, ?) ";
		 //设置参数
		 List<String> params = new ArrayList<String>();
		 params.add(sno);
		 params.add(sname);
		 //执行sql语句
		 ResultSet rs = jdbc.queryByPreparedStatement(sql, params);
		 boolean flag=false;
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
