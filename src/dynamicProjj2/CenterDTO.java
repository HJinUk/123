package dynamicProjj2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CenterDTO {
	
	String title, pname, content, cate,path,fname;
	
	Integer id;
	
	Date regdate;
	
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	
	public CenterDTO() {
		// TODO Auto-generated constructor stub
	}
	public String getCate() {
		return cate;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public void setCate(String cate) {
		this.cate = cate;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String name) {
		this.pname = name;
	}
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	public String getRegdateStr() {
		return sdf.format(regdate);
	}
	public void setRegdate(String regdate) {
		try {
			this.regdate = sdf.parse(regdate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
}
