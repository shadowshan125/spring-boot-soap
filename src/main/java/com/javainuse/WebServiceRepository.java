package com.javainuse;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.javainuse.Webservice;
import com.javainuse.WebDoa;

@Service
public class WebServiceRepository {
	
	@Autowired
	private WebDoa wdo;
	public WebServiceDetails getWebserviceByID(long id) {
		Webservice ws= null;
		Optional<Webservice> optionalWebservice = Optional.of(wdo.findOne(id));
		ws= optionalWebservice.get();

		WebServiceDetails wd=new WebServiceDetails();
		wd.setId(ws.getId());
		wd.setEmpId(ws.getEmpId());
		wd.setName(ws.getName());
		wd.setSalary(ws.getSalary());
		return (wd);
	}
	public WebServiceDetails getEmpId(String string) {
		// TODO Auto-generated method stub
		return null;
	}
}
