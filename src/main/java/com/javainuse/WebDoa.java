package com.javainuse;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface WebDoa extends CrudRepository <Webservice,Serializable> {	

}

