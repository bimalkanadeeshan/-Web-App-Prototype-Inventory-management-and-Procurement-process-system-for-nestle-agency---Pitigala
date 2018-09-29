package io.javabrains.springbootstarterweb.Repository;

import org.springframework.data.repository.CrudRepository;

import io.javabrains.springbootstarterweb.Model.ShopDetails;

public interface ShopDetailsRepository extends CrudRepository<ShopDetails, Integer> {

}
