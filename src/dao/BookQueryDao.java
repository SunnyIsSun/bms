package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import jdbc.JdbcUtil;

public class BookQueryDao {
	JdbcUtil jdbc = new JdbcUtil();
	public List<Object[]> queryBook(String bno,String bname,String bauthor, String btype){
		String sql=" select b_no, b_name, b_author, t_name, b_lent from book b,t_types t where b.t_no=t.t_no(+)  ";
		List<String> params = new ArrayList<String>();
		if(!bno.equals("") && bno!=null){
			sql += " and b_no=?  ";
			params.add(bno);
		}
		if(!bname.equals("") && bname!=null){
			sql += " and b_name like '%"+bname+"%' ";
			//params.add(bname);
		}
		if(!bauthor.equals("") && bauthor!=null){
			sql += " and b_author=? ";
			params.add(bauthor);
		}
		if(!btype.equals("«Î—°‘Ò")){
			sql += " and t_name=? ";
			params.add(btype);
		}
		sql += " order by b_no desc ";
		System.out.println(sql);
		jdbc.getConnection();
		ResultSet  rs = jdbc.queryByPreparedStatement(sql, params);
		List<Object[]> result = new ArrayList<Object[]>();
		try {
				while(rs.next()){
					Object[] obj =  new Object[]{rs.getObject(1),rs.getObject(2),rs.getObject(3),rs.getObject(4),rs.getObject(5)};
					result.add(obj);
				}	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			jdbc.close();
		}
		return result;
	} 
	public List<Object[]> queryAllBook(){
		jdbc.getConnection();
		String sql=" select b_no, b_name, b_author, t_name, b_lent from book b,t_types t where b.t_no=t.t_no(+) order by b_no desc ";
		List<String> params = new ArrayList<String>();
		ResultSet  rs = jdbc.queryByPreparedStatement(sql, params);
		List<Object[]> result = new ArrayList<Object[]>();
		try {
			while(rs.next()){
				Object[] obj =  new Object[]{rs.getObject(1),rs.getObject(2),rs.getObject(3),rs.getObject(4),rs.getObject(5)};
				result.add(obj);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			jdbc.close();
		}
		return result;
		
	} 
	public List<Object[]> queryB(String bno){
		jdbc.getConnection();
		String sql=" select b_no from book b where b_no=? ";
		List<String> params = new ArrayList<String>();
		params.add(bno);
		ResultSet  rs = jdbc.queryByPreparedStatement(sql, params);
		List<Object[]> result = new ArrayList<Object[]>();
		try {
			while(rs.next()){
				Object[] obj =  new Object[]{rs.getObject(1)};
				result.add(obj);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			jdbc.close();
		}
		return result;
		
	} 
}
