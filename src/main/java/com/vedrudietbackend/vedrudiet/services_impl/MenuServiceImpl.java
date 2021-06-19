package com.vedrudietbackend.vedrudiet.services_impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vedrudietbackend.vedrudiet.model.Menu;
import com.vedrudietbackend.vedrudiet.repository.MenuRepository;
import com.vedrudietbackend.vedrudiet.services.MenuService;

@Service
public class MenuServiceImpl implements MenuService{

	@Autowired
	private MenuRepository menuRepository;
	
	@Override
	public Menu createMenu(Menu menu) {
		menuRepository.save(menu);
		return menu;
	}

	@Override
	public List<Menu> getMenus() {
		return (List<Menu>)menuRepository.findAll();
	}

	@Override
	public Menu getMenuById(Integer id) {
		return menuRepository.findById(id).get();
	}

	@Override
	public Menu getMenuByPacientName(String name) {
		return menuRepository.getMenuByPacientName(name);
	}

}
