package com.app.comparevalues.adapter.in.model;

public class Request {
	private String value1;
	private String value2;
	private double threshold;
	private String code;

	public String getValue1() {
		return value1;
	}

	public void setValue1(String value1) {
		this.value1 = value1;
	}

	public String getValue2() {
		return value2;
	}

	public void setValue2(String value2) {
		this.value2 = value2;
	}

	public double getThreshold() {
		return threshold;
	}

	public void setThreshold(double threshold) {
		this.threshold = threshold;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Request(String value1, String value2, double threshold, String code) {
		super();
		this.value1 = value1;
		this.value2 = value2;
		this.threshold = threshold;
		this.code = code;
	}

	public Request() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Request [value1=" + value1 + ", value2=" + value2 + ", threshold=" + threshold + ", code=" + code + "]";
	}

}
