package com.webflux.demo;

public class UserDetails {
	private String userId;
	private String username;
	private String emailId;
	public UserDetails(String userId, String username, String emailId) {
		super();
		this.userId = userId;
		this.username = username;
		this.emailId = emailId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	

}
