package com.javainuse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.javainuse.InputSOATest;
import com.javainuse.OutputSOATest;
import com.javainuse.WebServiceDetails;
import com.javainuse.WebServiceRepository;

@Endpoint
public class WebServiceEndpoint {
	@Autowired
	private WebServiceRepository wsr;
	
	private static final String NAMESPACE_URI = "http://javainuse.com/WebServiceDetails";

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "inputSOATest")
	@ResponsePayload
	public OutputSOATest getUserRequest (@RequestPayload InputSOATest request) throws MyException {
		OutputSOATest response =new OutputSOATest();
		if (!request.getEmpId().equals("")) {
			WebServiceDetails url= null;
			url= wsr.getEmpId(request.getEmpId());
			response.setWebServiceDetails(url);
		}
		else
			throw new MyException("Please Enter EmpId,ID Should Not Be Null");
		return response;
}
	
}

