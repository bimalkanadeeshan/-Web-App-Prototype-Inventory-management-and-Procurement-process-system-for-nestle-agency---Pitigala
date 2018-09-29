package io.javabrains.springbootstarterweb.Repository;

import org.springframework.data.repository.CrudRepository;
import io.javabrains.springbootstarterweb.Model.User;

public interface UserRepository extends CrudRepository<User,Integer>{

}
