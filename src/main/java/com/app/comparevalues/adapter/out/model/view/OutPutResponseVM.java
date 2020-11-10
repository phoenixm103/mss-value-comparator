package com.app.comparevalues.adapter.out.model.view;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;
@Document
public class OutPutResponseVM {
	private String code;
	private String requestId;
	private String result;
	private List<RequestVM> requestVM;
	

	@Override
	public String toString() {
		return "OutPutResponseVM [code=" + code + ", requestId=" + requestId + ", result=" + result + ", requestVM="
				+ requestVM + "]";
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getRequestId() {
		return requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}




	public List<RequestVM> getRequestVM() {
		return requestVM;
	}

	public void setRequestVM(List<RequestVM> requestVM) {
		this.requestVM = requestVM;
	}
	

	public OutPutResponseVM(String code, String requestId, String result, List<RequestVM> requestVM) {
		super();
		this.code = code;
		this.requestId = requestId;
		this.result = result;
		this.requestVM = requestVM;
	}

	public OutPutResponseVM() {
		super();
		// TODO Auto-generated constructor stub
	}

}
