package io.samiul.com.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_UserModel_sa")
public class UserModel {
	
	@Id
	private int userid;
	private String username;
	private String userpassword;
	
	public UserModel() {}
	
	public UserModel(int userid, String username, String userpassword) {
		super();
		this.userid = userid;
		this.username = username;
		this.userpassword = userpassword;
	}
	
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUserpassword() {
		return userpassword;
	}
	public void setUserpassword(String userpassword) {
		this.userpassword = userpassword;
	}
	
	
	
}
