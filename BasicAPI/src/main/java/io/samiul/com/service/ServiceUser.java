package io.samiul.com.service;

import java.util.List;

import io.samiul.com.model.UserModel;

public interface ServiceUser {
	public List<UserModel> showAll();
	public String create(UserModel Um);
	public UserModel update(UserModel um);
	public String delete(int id);	
	public UserModel search(int id);
	
}
