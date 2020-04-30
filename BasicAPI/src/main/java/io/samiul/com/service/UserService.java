package io.samiul.com.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.samiul.com.model.UserModel;
import io.samiul.com.repository.UserRepo;

@Service
public class UserService implements ServiceUser {
	@Autowired
	UserRepo repo ;

	@Override
	public List<UserModel> showAll() {
		return repo.findAll();
	}

	@Override
	public String create(UserModel Um) {
		if (Um.equals(null)) {
			return "Your value is null";
		} else {
			repo.save(Um);
			return "Your id : " + Um.getUserid();
		}

	}

	@Override
	public UserModel update(UserModel um) {

		Optional<UserModel> fum = repo.findById(um.getUserid());

		if (fum.isEmpty()) {
			return null;
		} else {
			UserModel getentity = fum.get();
			getentity.setUsername(um.getUsername());
			getentity.setUserpassword(um.getUserpassword());
			return repo.save(getentity);
		}
	}

	@Override
	public String delete(int id) {
		Optional<UserModel> fum = repo.findById(id);
		if (fum.isPresent()) {
			repo.deleteById(id);			
			return "Successfully delete user whitch id : "+id;
		}else {
			return id+" is not found!!!";
		}

	}

	@Override
	public UserModel search(int id) {
		Optional<UserModel> fum = repo.findById(id);
		if(fum.isEmpty()) {
			return null;
		}else {
			UserModel  data = fum.get();
			return data;
		}
	}

}
