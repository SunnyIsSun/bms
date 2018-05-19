package dao;

import java.util.ArrayList;
import java.util.List;

import jdbc.JdbcUtil;

public class BackDao {
	JdbcUtil jdbc = new JdbcUtil();
	public boolean backBook(String bno){
		
		jdbc.getConnection();
		String sql=" update book set b_lent = 'Î´½èÔÄ' where b_no = ? ";
		List<String> params = new ArrayList<String>();
		params.add(bno);
		jdbc.updateByPrearedStatement(sql, params);
				
		//jdbc.getConnection();
		String sql2=" delete lent where b_no = ? ";
		List<String> params2 = new ArrayList<String>();
		params2.add(bno);
		boolean b = jdbc.updateByPrearedStatement(sql2, params2);
		return b;			
	}
}