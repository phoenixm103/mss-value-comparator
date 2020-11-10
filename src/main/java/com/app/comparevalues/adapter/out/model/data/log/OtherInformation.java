package com.app.comparevalues.adapter.out.model.data.log;

public class OtherInformation {
	private String userName;
	private String userId;
	
	
	public OtherInformation() {
		super();
		// TODO Auto-generated constructor stub
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getUserId() {
		return userId;
	}


	public void setUserId(String userId) {
		this.userId = userId;
	}


	public OtherInformation(String userName, String userId) {
		super();
		this.userName = userName;
		this.userId = userId;
	}
}
