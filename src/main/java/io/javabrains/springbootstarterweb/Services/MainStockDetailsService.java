package io.javabrains.springbootstarterweb.Services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.javabrains.springbootstarterweb.Repository.MainStockDetailsRepository;

@Service
@Transactional
public class MainStockDetailsService {
	
	@Autowired
	private MainStockDetailsRepository mainStoDetRep;

	public MainStockDetailsService(MainStockDetailsRepository mainStoDetRep) {
		this.mainStoDetRep = mainStoDetRep;
	}
	
	

}
