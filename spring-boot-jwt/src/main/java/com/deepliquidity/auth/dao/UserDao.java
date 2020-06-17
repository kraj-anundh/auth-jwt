package com.deepliquidity.auth.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.deepliquidity.auth.model.DAOUser;

@Repository
public interface UserDao extends JpaRepository<DAOUser, Integer> {
	DAOUser findByUsername(String username);
}