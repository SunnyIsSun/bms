package dao;

import java.util.ArrayList;
import java.util.List;

import jdbc.JdbcUtil;
import model.BookModel;

public class LentDao {

	JdbcUtil jdbc = new JdbcUtil();
	public boolean lentBook(BookModel book,String sno){
		
		jdbc.getConnection();
		String sql=" update book set b_lent = 'ÒÑ½èÔÄ' where b_no = ? ";
		List<String> params = new ArrayList<String>();
		params.add(book.getBno());
		jdbc.updateByPrearedStatement(sql, params);
				
		//jdbc.getConnection();
		String sql2=" insert into lent(s_no, b_no) values (?, ?) ";
		List<String> params2 = new ArrayList<String>();
		params2.add(sno);
		params2.add(book.getBno());
		boolean b = jdbc.updateByPrearedStatement(sql2, params2);
		return b;			
	}
}
