package com.nikhil.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nikhil.entity.User;

public interface UserRepository extends JpaRepository<User, Long>
{

}
