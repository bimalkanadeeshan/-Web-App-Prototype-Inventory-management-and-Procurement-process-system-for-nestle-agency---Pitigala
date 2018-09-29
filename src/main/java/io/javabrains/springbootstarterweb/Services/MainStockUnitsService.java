package io.javabrains.springbootstarterweb.Services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.javabrains.springbootstarterweb.Repository.MainStockUnitsRepository;

@Service
@Transactional
public class MainStockUnitsService {
	
	@Autowired
	private MainStockUnitsRepository mainStoUniRep;

	public MainStockUnitsService(MainStockUnitsRepository mainStoUniRep) {
		this.mainStoUniRep = mainStoUniRep;
	}
	
	

}
