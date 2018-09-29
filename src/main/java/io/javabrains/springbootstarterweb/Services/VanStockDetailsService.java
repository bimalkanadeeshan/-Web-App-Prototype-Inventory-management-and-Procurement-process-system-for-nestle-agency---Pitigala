package io.javabrains.springbootstarterweb.Services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.javabrains.springbootstarterweb.Repository.VanStockDetailsRepository;

@Service
@Transactional
public class VanStockDetailsService {
	
	@Autowired
	private VanStockDetailsRepository vanStoDetRep;

	public VanStockDetailsService(VanStockDetailsRepository vanStoDetRep) {
		this.vanStoDetRep = vanStoDetRep;
	}
	
	
	
	
	

}
