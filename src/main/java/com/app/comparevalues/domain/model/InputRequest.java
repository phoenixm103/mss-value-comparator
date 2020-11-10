package com.app.comparevalues.domain.model;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;
@Document
public class InputRequest {
	private String requestId;
	private String merchantId;
	private String apikey;
	private String requestTime;
	
	private List<Request> request;

	

}
