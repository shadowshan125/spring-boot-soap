package com.javainuse;

import org.springframework.ws.soap.server.endpoint.annotation.FaultCode;
import org.springframework.ws.soap.server.endpoint.annotation.SoapFault;

@SoapFault(faultCode = FaultCode.CUSTOM,customFaultCode="{http://javainuse.com/WebServiceDetails}001_Detail_Not_Found")
//@SoapFault(faultCode = FaultCode.CLIENT)
public class MyException extends Exception {

	public MyException(String message) {
		super(message);
	}

}
