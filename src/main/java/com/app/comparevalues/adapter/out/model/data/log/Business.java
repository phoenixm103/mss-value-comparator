package com.app.comparevalues.adapter.out.model.data.log;

public class Business {
	private String businessEvent;
	private String work;
	public String getBusinessEvent() {
		return businessEvent;
	}
	public void setBusinessEvent(String businessEvent) {
		this.businessEvent = businessEvent;
	}
	public String getWork() {
		return work;
	}
	public void setWork(String work) {
		this.work = work;
	}
	public Business(String businessEvent, String work) {
		super();
		this.businessEvent = businessEvent;
		this.work = work;
	}
	public Business() {
		super();
		// TODO Auto-generated constructor stub
	}
}
