package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import jdbc.JdbcUtil;

public class StudentBookDao {//b.b_no=l.b_no

	JdbcUtil jdbc = new JdbcUtil();
	public List<Object[]> studentBook(String bno,String bname,String sno){
		String sql=" select b.b_no, b.b_name, b.b_author, t.t_name, b.b_lent, l.s_no from book b,lent l,t_types t where b.b_no=l.b_no(+) and b.t_no=t.t_no  ";
		List<String> params = new ArrayList<String>();
		if(!bno.equals("") && bno!=null){
			sql += " and b.b_no=? ";
			params.add(bno);
		}
		if(!bname.equals("") && bname!=null){
			sql += " and b_name like '%"+bname+"%' ";
			//params.add(bname);
		}
		if(!sno.equals("") && sno!=null){
			sql += " and l.s_no=?  ";
			params.add(sno);
		}
		sql += " order by b_no desc ";
		System.out.println(sql);
		jdbc.getConnection();
		ResultSet  rs = jdbc.queryByPreparedStatement(sql, params);
		List<Object[]> result = new ArrayList<Object[]>();
		try {
			while(rs.next()){
				Object[] obj =  new Object[]{rs.getObject(1),rs.getObject(2),rs.getObject(3),rs.getObject(4),rs.getObject(5),rs.getObject(6)};
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
	public List<Object[]> allBook(){
		jdbc.getConnection();
		String sql=" select b.b_no, b.b_name, b.b_author, t.t_name, b.b_lent, l.s_no from book b,lent l,t_types t where b.b_no=l.b_no(+) and b.t_no=t.t_no  order by b_no desc ";
		List<String> params = new ArrayList<String>();
		ResultSet  rs = jdbc.queryByPreparedStatement(sql, params);
		List<Object[]> result = new ArrayList<Object[]>();
		try {
			while(rs.next()){
				Object[] obj =  new Object[]{rs.getObject(1),rs.getObject(2),rs.getObject(3),rs.getObject(4),rs.getObject(5),rs.getObject(6)};
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
	public List<Object[]> rank(){
		jdbc.getConnection();
		String sql=" select s.s_no,s.s_name,count(*) "+
					" from student s,lent l "+
					" where s.s_no=l.s_no "+
					" group by s.s_no,s.s_name"+
					" order by count(*) desc ";
		List<String> params = new ArrayList<String>();
		ResultSet  rs = jdbc.queryByPreparedStatement(sql, params);
		List<Object[]> result = new ArrayList<Object[]>();
		try {
			while(rs.next()){
				Object[] obj =  new Object[]{rs.getObject(1),rs.getObject(2),rs.getObject(3)+"±¾"};
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
