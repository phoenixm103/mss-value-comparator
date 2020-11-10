package com.app.comparevalues.unittest.application.service;

import static org.junit.jupiter.api.Assertions.fail;

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
import com.app.comparevalues.application.port.in.CompareValue;
import com.app.comparevalues.application.service.CompareInputValue;

@ExtendWith(MockitoExtension.class)
class CompareValueServiceTest {
	


	@Test
	@Description("TESTING METHOD : compareValue(InputRequest inputRequest)")
	public void compareValue() throws Exception {

		//compareValue(InputRequest inputRequest)
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

}
