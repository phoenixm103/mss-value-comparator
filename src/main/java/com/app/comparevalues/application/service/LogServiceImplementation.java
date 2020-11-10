package com.app.comparevalues.application.service;

import java.time.LocalDate;
import java.util.Collections;



import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.app.comparevalues.adapter.in.model.InputRequest;
import com.app.comparevalues.adapter.out.model.data.log.Business;
import com.app.comparevalues.adapter.out.model.data.log.LogInputModel;
import com.app.comparevalues.adapter.out.model.data.log.OtherInformation;
import com.app.comparevalues.adapter.out.model.data.log.Request;
import com.app.comparevalues.adapter.out.model.data.log.Scope;
import com.app.comparevalues.adapter.out.model.data.log.SenderService;
import com.app.comparevalues.adapter.out.model.view.OutPutResponseVM;
import com.app.comparevalues.application.port.out.LogService;
import com.fasterxml.jackson.databind.ObjectMapper;
@Service
public class LogServiceImplementation implements LogService {
	
	
	public void saveInputRequest(InputRequest inputRequest) {
		
		LogInputModel log=new LogInputModel();
		log.setCorrelationId(inputRequest.getRequestId());
		log.setTime(LocalDate.now());
		
		SenderService senderService=new SenderService("MSS VALUE COMPARATOR", "MSSVC");
		log.setSenderService(senderService);
		
		Business business=new Business("COMPARE VALUE","COMPARING");
		log.setBusiness(business);
		
		OtherInformation otherInformation=new OtherInformation("HARDCODED USER NAME","HARDCODED USER ID");
		log.setOtherInformation(otherInformation);
		
		Request request=new Request();
		request.setUrl("/valueComparison");
		request.setPath("PATH");
		request.setMethod("saveInputRequest(InputRequest inputRequest)");
		request.setQueryParameter("QUERY PARAMETER");
		request.setProtocol("http");
		request.setHeader("HEADER");
		request.setBody(inputRequest);
		
		log.setRequest(request);
		
		RestTemplate restTemplate = new RestTemplate();
		
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
		 
	    
	    HttpEntity<Object> req =  new HttpEntity<Object>(log, headers);
	    
	    try{
	    	Object m=restTemplate.postForObject("http://localhost:6090/saveLog", req, Object.class);
	    	
	    }catch(Exception e) {
	    	System.out.println(e.getLocalizedMessage());
	    }
	

	}

	@Override
	public void saveInput(InputRequest inputRequest) {
		LogInputModel log=new LogInputModel();
		log.setCorrelationId(inputRequest.getRequestId());
		log.setTime(LocalDate.now());
		
		SenderService senderService=new SenderService("MSS VALUE COMPARATOR", "MSSVC");
		log.setSenderService(senderService);
		
		Business business=new Business("COMPARE VALUE","COMPARING");
		log.setBusiness(business);
		
		OtherInformation otherInformation=new OtherInformation("HARDCODED USER NAME","HARDCODED USER ID");
		log.setOtherInformation(otherInformation);
		
		Scope scope =new Scope();
		scope.setMethod("saveInput(InputRequest inputRequest)");
		scope.setType("save");
		log.setScope(scope);
		
		log.setData(inputRequest);
		log.setOldData(null);
		
		
		RestTemplate restTemplate = new RestTemplate();
		
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
		 
	    
	    HttpEntity<Object> req =  new HttpEntity<Object>(log, headers);
	    
	    try{
	    	Object m=restTemplate.postForObject("http://localhost:6090/saveLog", req, Object.class);
	    	
	    }catch(Exception e) {
	    	System.out.println(e.getLocalizedMessage());
	    }
	

	}

	@Override
	public void saveOutput(OutPutResponseVM inputRequestVM) {
		LogInputModel log=new LogInputModel();
		log.setCorrelationId(inputRequestVM.getRequestId());
		log.setTime(LocalDate.now());
		
		SenderService senderService=new SenderService("MSS VALUE COMPARATOR", "MSSVC");
		log.setSenderService(senderService);
		
		Business business=new Business("COMPARE VALUE","COMPARING");
		log.setBusiness(business);
		
		OtherInformation otherInformation=new OtherInformation("HARDCODED USER NAME","HARDCODED USER ID");
		log.setOtherInformation(otherInformation);
		
		Scope scope =new Scope();
		scope.setMethod("saveOutput(InputRequestVM inputRequestVM)");
		scope.setType("save");
		log.setScope(scope);
		
		log.setData(inputRequestVM);
		log.setOldData(null);
		
		
		RestTemplate restTemplate = new RestTemplate();
		
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
		 
	    
	    HttpEntity<Object> req =  new HttpEntity<Object>(log, headers);
	    
	    try{
	    	Object m=restTemplate.postForObject("http://localhost:6090/saveLog", req, Object.class);
	    	
	    }catch(Exception e) {
	    	System.out.println(e.getLocalizedMessage());
	    }
		
	}

		

}
