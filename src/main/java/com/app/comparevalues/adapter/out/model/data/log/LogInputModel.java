package com.app.comparevalues.adapter.out.model.data.log;

import java.time.LocalDate;

import org.springframework.stereotype.Component;
@Component
public class LogInputModel {
	private String correlationId;
	private LocalDate time;
	private SenderService senderService;
	private Business business;
	private OtherInformation otherInformation;
	private Request request;

	private Scope scope;
	private Object data;
	private Object oldData;

	public String getCorrelationId() {
		return correlationId;
	}

	public void setCorrelationId(String correlationId) {
		this.correlationId = correlationId;
	}

	public LocalDate getTime() {
		return time;
	}

	public void setTime(LocalDate time) {
		this.time = time;
	}

	public SenderService getSenderService() {
		return senderService;
	}

	public void setSenderService(SenderService senderService) {
		this.senderService = senderService;
	}

	public Business getBusiness() {
		return business;
	}

	public void setBusiness(Business business) {
		this.business = business;
	}

	public OtherInformation getOtherInformation() {
		return otherInformation;
	}

	public void setOtherInformation(OtherInformation otherInformation) {
		this.otherInformation = otherInformation;
	}

	public Request getRequest() {
		return request;
	}

	public void setRequest(Request request) {
		this.request = request;
	}

	public Scope getScope() {
		return scope;
	}

	public void setScope(Scope scope) {
		this.scope = scope;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public Object getOldData() {
		return oldData;
	}

	public void setOldData(Object oldData) {
		this.oldData = oldData;
	}

	public LogInputModel(String correlationId, LocalDate time, SenderService senderService, Business business,
			OtherInformation otherInformation, Request request, Scope scope, Object data, Object oldData) {
		super();
		this.correlationId = correlationId;
		this.time = time;
		this.senderService = senderService;
		this.business = business;
		this.otherInformation = otherInformation;
		this.request = request;
		this.scope = scope;
		this.data = data;
		this.oldData = oldData;
	}

	@Override
	public String toString() {
		return "LogInputModel [correlationId=" + correlationId + ", time=" + time + ", senderService=" + senderService
				+ ", business=" + business + ", otherInformation=" + otherInformation + ", request=" + request
				+ ", scope=" + scope + ", data=" + data + ", oldData=" + oldData + "]";
	}

	public LogInputModel() {
		super();
		// TODO Auto-generated constructor stub
	}
}
