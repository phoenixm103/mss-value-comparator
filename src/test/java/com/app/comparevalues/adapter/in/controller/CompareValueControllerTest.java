package com.app.comparevalues.adapter.in.controller;

//import static org.junit.jupiter.api.Assertions.fail;
//import static org.mockito.Mockito.when;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.mockito.junit.jupiter.MockitoExtension;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.http.MediaType;
//import org.springframework.test.context.junit.jupiter.SpringExtension;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
//
//import com.app.comparevalues.adapter.in.model.InputRequest;
//import com.app.comparevalues.adapter.in.model.Request;
//import com.app.comparevalues.adapter.out.model.view.OutPutResponseVM;
//import com.app.comparevalues.adapter.out.model.view.RequestVM;
//import com.app.comparevalues.application.port.in.CompareValue;
//import com.app.comparevalues.application.service.CompareValueService;
//import com.fasterxml.jackson.databind.ObjectMapper;

//@ExtendWith(SpringExtension.class)
//@WebMvcTest(controllers = CompareValueController.class)
class CompareValueControllerTest {
//	@Autowired
//	private MockMvc mockMvc;
//
//	@Autowired
//	private ObjectMapper objectMapper;
//
//	@MockBean
//	CompareValueService compareValue;
//
//	//CompareValueController compareValueController;
//	
//	@Test
//	public void test_SendSms_with_ValidInputFormat() throws Exception {
//		
//		InputRequest inputRequest = new InputRequest();
//		List<Request> requestList = new ArrayList<>();
//		Request request = new Request("mukit", "mukit", 100.00, "V1");
//
//		OutPutResponseVM outPutResponseVM = new OutPutResponseVM();
//		List<RequestVM> requestVMList = new ArrayList<>();
//		RequestVM requestVM = new RequestVM("V1", "mukit", "mukit", 100.00, 100.00, "SUCCESS");
//
//		inputRequest.setRequestId("210101010");
//		inputRequest.setMerchantId("017777");
//		inputRequest.setApikey("srth");
//		inputRequest.setRequestTime("20201020121212");
//
//		requestList.add(request);
//
//		inputRequest.setRequest(requestList);
//
//		outPutResponseVM.setCode("201");
//		outPutResponseVM.setRequestId("210101010");
//		outPutResponseVM.setResult("success");
//
//		requestVMList.add(requestVM);
//
//		outPutResponseVM.setRequestVM(requestVMList);
//		
//		
//
//		Object expectedResult = outPutResponseVM;
//		
//		when(compareValue.compareValue(inputRequest)).thenReturn((OutPutResponseVM) expectedResult);
//		
//		mockMvc.perform(MockMvcRequestBuilders.post("/valuecomparison").content(objectMapper.writeValueAsString(inputRequest))
//			.contentType(MediaType.APPLICATION_JSON).accept(MediaType.APPLICATION_JSON)).andExpect(status().isOk());
//
//
//
//	}

}
