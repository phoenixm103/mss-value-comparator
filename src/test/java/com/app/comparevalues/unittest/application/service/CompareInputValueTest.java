package com.app.comparevalues.unittest.application.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.context.annotation.Description;

import com.app.comparevalues.adapter.in.model.InputRequest;
import com.app.comparevalues.adapter.in.model.Request;
import com.app.comparevalues.adapter.out.model.view.OutPutResponseVM;
import com.app.comparevalues.adapter.out.model.view.RequestVM;
import com.app.comparevalues.application.service.CompareInputValue;

@ExtendWith(MockitoExtension.class)
class CompareInputValueTest {

	@Test
	@Description("resultDecision: SUCCESS")
	public void compareInputValueWhenAllTheInputsAreGivenProperly() throws Exception {

		InputRequest inputRequest = new InputRequest();
		List<Request> requestList = new ArrayList<>();
		Request request = new Request("mukit", "mukit", 100.00, "V1");

		OutPutResponseVM outPutResponseVM = new OutPutResponseVM();
		List<RequestVM> requestVMList = new ArrayList<>();
		RequestVM requestVM = new RequestVM("V1", "mukit", "mukit", 100.00, 100.00, "SUCCESS");

		inputRequest.setRequestId("210101010");
		inputRequest.setMerchantId("017777");
		inputRequest.setApikey("srth");
		inputRequest.setRequestTime("20201020121212");

		requestList.add(request);

		inputRequest.setRequest(requestList);

		outPutResponseVM.setCode("201");
		outPutResponseVM.setRequestId("210101010");
		outPutResponseVM.setResult("success");

		requestVMList.add(requestVM);

		outPutResponseVM.setRequestVM(requestVMList);

		Object expectedResult = new Object();
		expectedResult = outPutResponseVM;

		CompareInputValue compareInputValue = new CompareInputValue(inputRequest);

		Object actualResult = compareInputValue.compareInputValue(inputRequest);

//		System.out.println(actualResult.toString());
//		System.out.println(expectedResult.toString());

		Assert.assertTrue(EqualsBuilder.reflectionEquals(actualResult.toString(), expectedResult.toString()));

	}
	
	@Test
	@Description("resultDecision: FAILED, DUE TO THRESHOLD RESULT VALUE")
	public void compareInputValueWhenThresholdResultIsPoor() throws Exception {

		InputRequest inputRequest = new InputRequest();
		List<Request> requestList = new ArrayList<>();
		Request request = new Request("Moinuddin", "Moin   ", 100, "V1");

		OutPutResponseVM outPutResponseVM = new OutPutResponseVM();
		List<RequestVM> requestVMList = new ArrayList<>();
		RequestVM requestVM = new RequestVM("V1", "Moinuddin", "Moin   ", 100, 50, "FAILED, DUE TO THRESHOLD RESULT VALUE");

		inputRequest.setRequestId("210101010");
		inputRequest.setMerchantId("017777");
		inputRequest.setApikey("srth");
		inputRequest.setRequestTime("20201020121212");

		requestList.add(request);

		inputRequest.setRequest(requestList);

		outPutResponseVM.setCode("201");
		outPutResponseVM.setRequestId("210101010");
		outPutResponseVM.setResult("success");

		requestVMList.add(requestVM);

		outPutResponseVM.setRequestVM(requestVMList);

		Object expectedResult = new Object();
		expectedResult = outPutResponseVM;

		CompareInputValue compareInputValue = new CompareInputValue(inputRequest);

		Object actualResult = compareInputValue.compareInputValue(inputRequest);

//		System.out.println(actualResult.toString());
//		System.out.println(expectedResult.toString());

		Assert.assertTrue(EqualsBuilder.reflectionEquals(actualResult.toString(), expectedResult.toString()));

	}
	@Test
	@Description("resultDecision: FAILED, WRONG THRESHOLD VALUE")
	public void compareInputValueWhenGivenThresholdValueIsMoreThan100() throws Exception {

		InputRequest inputRequest = new InputRequest();
		List<Request> requestList = new ArrayList<>();
		Request request = new Request("Moinuddin", "Moin   ", 120, "V1");

		OutPutResponseVM outPutResponseVM = new OutPutResponseVM();
		List<RequestVM> requestVMList = new ArrayList<>();
		RequestVM requestVM = new RequestVM("V1", "Moinuddin", "Moin   ", 120, 50, "FAILED, WRONG THRESHOLD VALUE");

		inputRequest.setRequestId("210101010");
		inputRequest.setMerchantId("017777");
		inputRequest.setApikey("srth");
		inputRequest.setRequestTime("20201020121212");

		requestList.add(request);

		inputRequest.setRequest(requestList);

		outPutResponseVM.setCode("201");
		outPutResponseVM.setRequestId("210101010");
		outPutResponseVM.setResult("success");

		requestVMList.add(requestVM);

		outPutResponseVM.setRequestVM(requestVMList);

		Object expectedResult = new Object();
		expectedResult = outPutResponseVM;

		CompareInputValue compareInputValue = new CompareInputValue(inputRequest);

		Object actualResult = compareInputValue.compareInputValue(inputRequest);

//		System.out.println(actualResult.toString());
//		System.out.println(expectedResult.toString());

		Assert.assertTrue(EqualsBuilder.reflectionEquals(actualResult.toString(), expectedResult.toString()));

	}

	@Test
	@Description("resultDecision: FAILED, WRONG THRESHOLD VALUE")
	public void compareInputValueWhenOneOfTwoGivenValuesOrTwoGivenValuesAreInvalid() throws Exception {

		InputRequest inputRequest = new InputRequest();
		List<Request> requestList = new ArrayList<>();
		Request request1 = new Request("", "Moin", 120, "V1");
		Request request2 = new Request("mukit", "", 100, "V2");
		Request request3 = new Request("", "", 100, "V3");
		
		OutPutResponseVM outPutResponseVM = new OutPutResponseVM();
		List<RequestVM> requestVMList = new ArrayList<>();
		RequestVM requestVM1 = new RequestVM("V1", "", "Moin", 120, 0, "VALUE1 OF LIST ITEM NO. 1 IS INVALID");
		RequestVM requestVM2 = new RequestVM("V2", "mukit", "",100, 0, "VALUE2 OF LIST ITEM NO. 2 IS INVALID");
		RequestVM requestVM3 = new RequestVM("V3", "", "", 100, 0, "VALUE1 & VALUE2 OF LIST ITEM NO. 3 IS INVALID");
		
		inputRequest.setRequestId("210101010");
		inputRequest.setMerchantId("017777");
		inputRequest.setApikey("srth");
		inputRequest.setRequestTime("20201020121212");

		requestList.add(request1);
		requestList.add(request2);
		requestList.add(request3);

		inputRequest.setRequest(requestList);

		outPutResponseVM.setCode("201");
		outPutResponseVM.setRequestId("210101010");
		outPutResponseVM.setResult("success");

		requestVMList.add(requestVM1);
		requestVMList.add(requestVM2);
		requestVMList.add(requestVM3);

		outPutResponseVM.setRequestVM(requestVMList);

		Object expectedResult = new Object();
		expectedResult = outPutResponseVM;

		CompareInputValue compareInputValue = new CompareInputValue(inputRequest);

		Object actualResult = compareInputValue.compareInputValue(inputRequest);

		System.out.println(actualResult.toString());
		System.out.println(expectedResult.toString());

		Assert.assertTrue(EqualsBuilder.reflectionEquals(actualResult.toString(), expectedResult.toString()));

	}

}
