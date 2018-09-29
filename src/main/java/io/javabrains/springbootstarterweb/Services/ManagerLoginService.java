package io.javabrains.springbootstarterweb.Services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.javabrains.springbootstarterweb.Repository.ManagerLoginRepository;

@Service
@Transactional
public class ManagerLoginService {
	
	@Autowired
	private ManagerLoginRepository manLogRep;

	public ManagerLoginService(ManagerLoginRepository manLogRep) {
		this.manLogRep = manLogRep;
	}
	
	

}
