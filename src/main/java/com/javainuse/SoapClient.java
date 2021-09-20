package com.javainuse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;

import com.javainuse.InputSOATest;
import com.javainuse.OutputSOATest;


@Service
public class SoapClient {
	
	@Autowired
	private Jaxb2Marshaller jaxb2Marshaller;
	
	private WebServiceTemplate webServiceTemplate;
	
	public OutputSOATest getItemInfo(InputSOATest inputSOATest){
		webServiceTemplate =new WebServiceTemplate(jaxb2Marshaller);
		return (OutputSOATest) webServiceTemplate.marshalSendAndReceive("http://localhost:8080/javainuse/ws/helloworld",inputSOATest);

}
}
