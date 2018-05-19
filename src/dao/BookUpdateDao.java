package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.BookModel;

import jdbc.JdbcUtil;

public class BookUpdateDao {
	JdbcUtil jdbc = new JdbcUtil();
	public boolean updateBook(BookModel book){
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
		jdbc.getConnection();
		String sql=" update book set  b_name = ?,  b_author = ?,  t_no = ?  where b_no = ? ";
		List<String> params = new ArrayList<String>();
		params.add(book.getName());
		params.add(book.getAuthor());
		params.add(s);
		params.add(book.getBno());
		boolean b = jdbc.updateByPrearedStatement(sql, params);
		return b;	
		
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
}
