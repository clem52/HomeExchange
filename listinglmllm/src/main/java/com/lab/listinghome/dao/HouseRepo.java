package com.lab.listinghome.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.lab.listinghome.model.House;



public interface HouseRepo extends CrudRepository<House, Integer>
{

	   List<House> findByCityLike(String city);
	
}
