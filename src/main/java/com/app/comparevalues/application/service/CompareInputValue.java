package com.app.comparevalues.application.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.app.comparevalues.adapter.in.model.InputRequest;
import com.app.comparevalues.adapter.in.model.Request;
import com.app.comparevalues.adapter.out.model.view.OutPutResponseVM;
import com.app.comparevalues.adapter.out.model.view.RequestVM;

@Component
public class CompareInputValue {
	
	@Autowired
	private InputRequest inputRequest;
	
	public CompareInputValue(InputRequest inputRequest) {
	this.inputRequest=inputRequest;	// TODO Auto-generated constructor stub
	}
	

	public OutPutResponseVM compareInputValue(InputRequest inputRequest) {
		
		OutPutResponseVM outPutResponseVM = new OutPutResponseVM();
		outPutResponseVM.setCode("201");
		outPutResponseVM.setRequestId(inputRequest.getRequestId());
		outPutResponseVM.setResult("success");
		outPutResponseVM.setRequestVM(getRequestVMList(inputRequest.getRequest()));

//		if (inputRequest.getApikey().isEmpty()) {
//			return null;
//		} 
//		else if (inputRequest.getMerchantId().isEmpty()) {
//			return null;
//		} 
//		else if (inputRequest.getRequestId().isEmpty()) {
//			return null;
//		} 
//		else if (inputRequest.getRequestTime().isEmpty()) {
//			return null;
//		}

		return outPutResponseVM;
	}
	
	private List<RequestVM> getRequestVMList(List<Request> requestList) {
		List<RequestVM> requestVMList = new ArrayList<RequestVM>();
//		if (requestList.isEmpty()) {
//			RequestVM rvm = new RequestVM();
//			rvm.setResultDecision("INVALID INPUT : NO INPUT REQUEST");
//			requestVMList.add(rvm);
//			return requestVMList;
//		}
		for (int i = 0; i < requestList.size(); i++) {
			RequestVM rvm = new RequestVM();
			rvm.setCode(requestList.get(i).getCode());
			rvm.setValue1(requestList.get(i).getValue1());
			rvm.setValue2(requestList.get(i).getValue2());
			rvm.setThreshold(requestList.get(i).getThreshold());
			rvm.setResultValue(getResultValue(requestList.get(i).getValue1(), requestList.get(i).getValue2()));

			if (rvm.getValue1().isEmpty() || rvm.getValue2().isEmpty()) {

				if (rvm.getValue1().isEmpty() && rvm.getValue2().isEmpty()) {
					rvm.setResultValue(0);
					rvm.setResultDecision("VALUE1 & VALUE2 OF LIST ITEM NO. " + (i + 1) + " IS INVALID");
				}
				if (rvm.getValue1().isEmpty() && !rvm.getValue2().isEmpty()) {
					rvm.setResultDecision("VALUE1 OF LIST ITEM NO. " + (i + 1) + " IS INVALID");
				}
				if (rvm.getValue2().isEmpty() && !rvm.getValue1().isEmpty()) {
					rvm.setResultDecision("VALUE2 OF LIST ITEM NO. " + (i + 1) + " IS INVALID");
				}
			} 
			else {
				if (rvm.getThreshold() > rvm.getResultValue()) {
					rvm.setResultDecision("FAILED, DUE TO THRESHOLD RESULT VALUE");
				} else {
					rvm.setResultDecision("SUCCESS");
				}
				if (rvm.getThreshold() > 100.00) {
					rvm.setResultDecision("FAILED, WRONG THRESHOLD VALUE");
				}
			}

			requestVMList.add(rvm);

		}

		return requestVMList;
	}

	private double getResultValue(String value1, String value2) {
		return subseq(value1, value2);

	}

	private static double subseq(String value1, String value2) {

		char[] charArrayOfvalue1 = value1.toCharArray();
		char[] charArrayOfvalue2 = value2.toCharArray();

		int lenthOfValue1 = charArrayOfvalue1.length;
		int lenthOfValue2 = charArrayOfvalue2.length;

		int my_arr[][] = new int[lenthOfValue1 + 1][lenthOfValue2 + 1];

		for (int i = 0; i <= lenthOfValue1; i++) {
			for (int j = 0; j <= lenthOfValue2; j++) {
				if (i == 0 || j == 0)
					my_arr[i][j] = 0;
				else if (charArrayOfvalue1[i - 1] == charArrayOfvalue2[j - 1])
					my_arr[i][j] = my_arr[i - 1][j - 1] + 1;
				else
					my_arr[i][j] = max_val(my_arr[i - 1][j], my_arr[i][j - 1]);
			}
		}

		double numberOfCharacterMatched = Double.valueOf((my_arr[lenthOfValue1][lenthOfValue2]));
		double doubleValueOfLengthOfValue1 = Double.valueOf(lenthOfValue1);
		double doubleValueOfLengthOfValue2 = Double.valueOf(lenthOfValue2);
		double result = (((2 * numberOfCharacterMatched) / (doubleValueOfLengthOfValue1 + doubleValueOfLengthOfValue2))
				* 100);
		return result;

	}

	private static int max_val(int val_1, int val_2) {
		return (val_1 > val_2) ? val_1 : val_2;
	}


}
