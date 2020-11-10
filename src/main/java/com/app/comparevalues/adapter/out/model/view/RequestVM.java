package com.app.comparevalues.adapter.out.model.view;

public class RequestVM {
	private String code;
	private String value1;
	private String value2;
	private double threshold;
	private double resultValue;
	private String resultDecision;

	@Override
	public String toString() {
		return "RequestVM [code=" + code + ", value1=" + value1 + ", value2=" + value2 + ", threshold=" + threshold
				+ ", resultValue=" + resultValue + ", resultDecision=" + resultDecision + "]";
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

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

	public double getResultValue() {
		return resultValue;
	}

	public void setResultValue(double resultValue) {
		this.resultValue = resultValue;
	}

	public String getResultDecision() {
		return resultDecision;
	}

	public void setResultDecision(String resultDecision) {
		this.resultDecision = resultDecision;
	}

	public RequestVM(String code, String value1, String value2, double threshold, double resultValue,
			String resultDecision) {
		super();
		this.code = code;
		this.value1 = value1;
		this.value2 = value2;
		this.threshold = threshold;
		this.resultValue = resultValue;
		this.resultDecision = resultDecision;
	}

	public RequestVM() {
		super();
		// TODO Auto-generated constructor stub
	}
	public RequestVM(
			String resultDecision) {
		super();

		this.resultDecision = resultDecision;
	}
}
