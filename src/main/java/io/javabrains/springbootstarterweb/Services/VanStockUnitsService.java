package io.javabrains.springbootstarterweb.Services;

import javax.transaction.Transactional;
import javax.xml.ws.ServiceMode;

import org.springframework.beans.factory.annotation.Autowired;

import io.javabrains.springbootstarterweb.Repository.VanStockUnitsRepository;

@ServiceMode
@Transactional
public class VanStockUnitsService {
	
	@Autowired
	private VanStockUnitsRepository vanStoUniRepo;

	public VanStockUnitsService(VanStockUnitsRepository vanStoUniRepo) {
		this.vanStoUniRepo = vanStoUniRepo;
	}
	
	

}
