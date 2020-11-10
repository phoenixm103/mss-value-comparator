package com.app.comparevalues.adapter.out.model.data;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.app.comparevalues.adapter.in.model.Request;

@Document
public class InputRequest {

	@Id
	private String requestId;
	private String merchantId;
	private String apikey;
	private String requestTime;
	private List<Request> request;

	public String getRequestId() {
		return requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getMerchantId() {
		return merchantId;
	}

	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	public String getApikey() {
		return apikey;
	}

	public void setApikey(String apikey) {
		this.apikey = apikey;
	}

	public String getRequestTime() {
		return requestTime;
	}

	public void setRequestTime(String requestTime) {
		this.requestTime = requestTime;
	}

	public List<Request> getRequest() {
		return request;
	}

	public void setRequest(List<Request> request) {
		this.request = request;
	}

	public InputRequest(String requestId, String merchantId, String apikey, String requestTime,
			List<Request> request) {
		super();
		this.requestId = requestId;
		this.merchantId = merchantId;
		this.apikey = apikey;
		this.requestTime = requestTime;
		this.request = request;
	}

	public InputRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
}
