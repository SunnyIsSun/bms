package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import jdbc.JdbcUtil;
import model.BookModel;

public class BookAddDao {
	JdbcUtil jdbc = new JdbcUtil();
	public String[] queryBookType(){
		try {
			//查询所有记录
			String sql="select * from t_types";
			jdbc.getConnection();
			ResultSet rs = jdbc.queryByPreparedStatement(sql, null);
			
			//统计记录数
			String countSql="select count(*) typecount from t_types";
			ResultSet rs2 = jdbc.queryByPreparedStatement(countSql, null);
			rs2.next();
			int count = rs2.getInt(1);
			String[] str = new String[count];
			
			while(rs.next()){
				str[rs.getRow()-1]=rs.getString(1);
			}
			return str;
			
//			String sql=" select t_no from t_types where t_name= ? "
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public void insertBook(BookModel book){
		try {
		String s=null;
		jdbc.getConnection();
		String sql2="select  t_no from t_types where t_name=?";
		List<String> params2=new ArrayList<String>();
		params2.add(book.getTname());
		ResultSet rs =jdbc.queryByPreparedStatement(sql2, params2);
		while (rs.next()) {
				// obj =  new Object[]{rs.getObject(1)};
			s =rs.getObject(1).toString();
			
		}
		
		String sql="insert into book(b_no, b_name, b_author, t_no, b_lent)values(?, ?, ?, ?, ?)";
		jdbc.getConnection();
		List<String> params=new ArrayList<String>();
		params.add(book.getBno());
		params.add(book.getName());
		params.add(book.getAuthor());
		params.add(s);
		params.add(book.getLent());
		jdbc.updateByPrearedStatement(sql, params);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
