package com.isep.HomeExchange.model.repository;

import com.isep.HomeExchange.model.table.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<User, Long> {
    List<User> findByLastName(String lastName);
}

