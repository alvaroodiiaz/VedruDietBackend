package com.vedrudietbackend.vedrudiet.services;

import java.util.List;

import com.vedrudietbackend.vedrudiet.model.Menu;

public interface MenuService {
public Menu createMenu(Menu m);
	
	public List<Menu> getMenus();
	
	public Menu getMenuById(Integer id);
	
	public Menu getMenuByPacientName(String name);
}
