package io.samiul.com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.samiul.com.model.UserModel;

@Repository
public interface UserRepo extends JpaRepository<UserModel, Integer>{

}
