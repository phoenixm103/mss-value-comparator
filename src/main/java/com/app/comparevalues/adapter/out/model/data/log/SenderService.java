package com.app.comparevalues.adapter.out.model.data.log;

public class SenderService {
	private String serviceName;
	private String serviceId;
	
	public SenderService() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public String getServiceId() {
		return serviceId;
	}

	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}

	public SenderService(String serviceName, String serviceId) {
		super();
		this.serviceName = serviceName;
		this.serviceId = serviceId;
	}
}
