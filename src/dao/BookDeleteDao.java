package dao;

import java.util.ArrayList;
import java.util.List;

import jdbc.JdbcUtil;

public class BookDeleteDao {
	JdbcUtil jdbc = new JdbcUtil();
		public boolean deleteBook(String bno){
			String sql=" delete book where b_no = ? ";
			List<String> params = new ArrayList<String>();
			params.add(bno);
			jdbc.getConnection();
			boolean b = jdbc.updateByPrearedStatement(sql, params);
			return b;
		}
}
