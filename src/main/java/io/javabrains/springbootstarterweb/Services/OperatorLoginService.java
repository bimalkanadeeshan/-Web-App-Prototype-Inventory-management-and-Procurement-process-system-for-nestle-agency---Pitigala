package io.javabrains.springbootstarterweb.Services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.javabrains.springbootstarterweb.Repository.OperatorLoginRepository;

@Service
@Transactional
public class OperatorLoginService {
	
	@Autowired
	private OperatorLoginRepository opLogRep;

	public OperatorLoginService(OperatorLoginRepository opLogRep) {
		this.opLogRep = opLogRep;
	}
	
	

}
