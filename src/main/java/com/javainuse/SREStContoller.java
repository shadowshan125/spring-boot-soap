package com.javainuse;

import com.javainuse.SoapClient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.javainuse.InputSOATest;
import com.javainuse.OutputSOATest;

@RestController
public class SREStContoller {
	
	@Autowired
	SoapClient soapClient;
	
	@PostMapping("/output")
	public OutputSOATest output(@RequestBody InputSOATest inputSOATest) {
		return soapClient.getItemInfo(inputSOATest);
		
	}

}
