package io.javabrains.springbootstarterweb.Services;

import io.javabrains.springbootstarterweb.Repository.ShopDetailsRepository;

public class ShopDetailsService {
	
	private ShopDetailsRepository shopDetRepo;

	public ShopDetailsService(ShopDetailsRepository shopDetRepo) {
		this.shopDetRepo = shopDetRepo;
	}
	
	

}
