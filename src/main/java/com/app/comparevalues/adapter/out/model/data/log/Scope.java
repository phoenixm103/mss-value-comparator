package com.app.comparevalues.adapter.out.model.data.log;

public class Scope {
	private String type;
	private String method;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getMethod() {
		return method;
	}
	public void setMethod(String method) {
		this.method = method;
	}
	public Scope(String type, String method) {
		super();
		this.type = type;
		this.method = method;
	}
	public Scope() {
		super();
		// TODO Auto-generated constructor stub
	}
}
