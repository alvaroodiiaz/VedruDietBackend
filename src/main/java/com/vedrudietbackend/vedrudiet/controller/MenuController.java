package com.vedrudietbackend.vedrudiet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vedrudietbackend.vedrudiet.model.Menu;
import com.vedrudietbackend.vedrudiet.services.MenuService;

@RestController
@RequestMapping(path = "/menu")
@CrossOrigin(origins = "*")
public class MenuController {
	
	@Autowired
	private MenuService menuService;
	
	@PostMapping
	public ResponseEntity<?> createMenu(@RequestBody Menu m) {
		return ResponseEntity.status(HttpStatus.CREATED).body(menuService.createMenu(m));
	}
	
	@GetMapping
	public ResponseEntity<?> getMenus(){
		return ResponseEntity.status(HttpStatus.OK).body(menuService.getMenus());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> getMenuById(@PathVariable("id") Integer id){
		return ResponseEntity.status(HttpStatus.OK).body(menuService.getMenuById(id));
	}
	
	@GetMapping("/filter/{name}")
	public ResponseEntity<?> getMenuByPacientName(@PathVariable("name") String name){
		System.out.println(name);
		return ResponseEntity.status(HttpStatus.OK).body(menuService.getMenuByPacientName(name));
		
	}

}
