package com.vedrudietbackend.vedrudiet.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.vedrudietbackend.vedrudiet.model.Menu;

public interface MenuRepository  extends CrudRepository <Menu, Integer>{
	
	@Query("SELECT m from Menu m where LOWER(m.name) = LOWER(:nombre)")
	Menu getMenuByPacientName(@Param("nombre") String name);

}
