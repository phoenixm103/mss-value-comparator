package com.app.comparevalues.adapter.in.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.comparevalues.adapter.in.model.InputRequest;
import com.app.comparevalues.adapter.in.model.Request;
import com.app.comparevalues.adapter.out.model.view.OutPutResponseVM;
import com.app.comparevalues.application.port.in.CompareValue;
import com.app.comparevalues.application.port.out.LogService;
import com.app.comparevalues.application.service.CompareValueService;

@RestController
public class CompareValueController {



	@Autowired
	private CompareValue compareValue;

	@Autowired
	private LogService logService;

	@Autowired
	private CompareValueService compareValueService;
	
	@Autowired
	public CompareValueController(CompareValue compareValue, LogService logService,
			CompareValueService compareValueService) {
		super();
		this.compareValue = compareValue;
		this.logService = logService;
		this.compareValueService = compareValueService;
	}
	

	public CompareValueController() {
		super();
		// TODO Auto-generated constructor stub
	}


	@GetMapping("/comparetest")
	public String sayHello() {
		return "Ready to do";
	}

	@PostMapping("/valuecomparison")
	public Object compareValue(@RequestBody InputRequest inputRequest) throws Exception, IllegalArgumentException {

		try {
			if (inputRequest.getApikey().isEmpty() || inputRequest.getApikey()=="" ) {
				return null;
			} else if (inputRequest.getMerchantId().isEmpty()||inputRequest.getMerchantId()=="") {
				return null;
			} else if (inputRequest.getRequestId().isEmpty()||inputRequest.getRequestId()=="") {
				return null;
			} else if (inputRequest.getRequestTime().isEmpty()||inputRequest.getRequestTime()=="") {
				return null;
			} else if (inputRequest.getRequest().isEmpty()||inputRequest.getRequest()==null) {
				return null;
			}

			else if (inputRequest.getRequest().isEmpty()) {
				return null;
			} else {

//				List<Request> requestList = inputRequest.getRequest();
//				String InputValidationCheck = "";
//				for (int i = 0; i < inputRequest.getRequest().size(); i++) {
//					Request rvm = new Request();
//					rvm.setCode(requestList.get(i).getCode());
//					rvm.setValue1(requestList.get(i).getValue1());
//					rvm.setValue2(requestList.get(i).getValue2());
//					rvm.setThreshold(requestList.get(i).getThreshold());
//
//					if (rvm.getValue1().isEmpty() || rvm.getValue2().isEmpty()) {
//
//						if (rvm.getValue1().isEmpty() && rvm.getValue2().isEmpty()) {
//							InputValidationCheck = InputValidationCheck
//									+ "INVALID INPUT : VALUE1 & VALUE2 OF LIST ITEM NO. " + (i + 1) + " IS INVALID"
//									+ "\n";
//						}
//						if (rvm.getValue1().isEmpty() && !rvm.getValue2().isEmpty()) {
//							InputValidationCheck = InputValidationCheck + "INVALID INPUT : VALUE1 OF LIST ITEM NO. "
//									+ (i + 1) + " IS INVALID" + "\n";
//						}
//						if (rvm.getValue2().isEmpty() && !rvm.getValue1().isEmpty()) {
//							InputValidationCheck = InputValidationCheck + "INVALID INPUT : VALUE2 OF LIST ITEM NO. "
//									+ (i + 1) + " IS INVALID" + "\n";
//						}
//						if (rvm.getThreshold() > 100.00) {
//							InputValidationCheck = InputValidationCheck + "INVALID INPUT : WRONG THRESHOLD VALUE"
//									+ "\n";
//						}
//					}
//
//				}

//				if (InputValidationCheck != "") {
//					return InputValidationCheck;
//				} 
//				else if (InputValidationCheck == "") {
				
//				public void saveInput(InputRequest inputRequest);
//
//				public void saveOutput(OutPutResponseVM inputRequestVM);
				
				logService.saveInputRequest(inputRequest);
				compareValueService.saveInput(inputRequest);
				//logService.saveInput(inputRequest);
				OutPutResponseVM outPutResponseVM = compareValue.compareValue(inputRequest);
				compareValueService.saveOutput(outPutResponseVM);
				logService.saveOutput(outPutResponseVM);
				return outPutResponseVM;
//				}
			}

		} catch (NullPointerException e) {
			return "INVALID REQUEST : NO INPUT OR NULL INPUT";
		}

		catch (IllegalArgumentException e) {
			return "INVALID REQUEST : ENTITY MUST NOT BE NULL";
		}

//		return null;

	}
	
}
