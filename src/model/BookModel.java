package model;

public class BookModel {
	private String bno;
	private String name;
	private String author;
	private String tname;
	private String lent;
	
	public BookModel() {
		
	}
	public BookModel(String bno, String name, String author, String tno,
			String lent, String tname) {
	
		this.bno = bno;
		this.name = name;
		this.author = author;
		this.tname = tname;
		this.lent = lent;
	}
	public String getBno() {
		return bno;
	}
	public void setBno(String bno) {
		this.bno = bno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		
		this.tname = tname;
	}
	public String getLent() {
		return lent;
	}
	public void setLent(String lent) {
		this.lent = lent;
	}
	

}
