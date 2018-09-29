package io.javabrains.springbootstarterweb.Repository;

import org.springframework.data.repository.CrudRepository;

import io.javabrains.springbootstarterweb.Model.MainStockDetails;

public interface MainStockDetailsRepository extends CrudRepository<MainStockDetails, Integer> {

}
