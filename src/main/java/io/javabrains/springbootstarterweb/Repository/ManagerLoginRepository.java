package io.javabrains.springbootstarterweb.Repository;

import org.springframework.data.repository.CrudRepository;

import io.javabrains.springbootstarterweb.Model.ManagerLogin;

public interface ManagerLoginRepository extends CrudRepository<ManagerLogin, Integer> {

}
