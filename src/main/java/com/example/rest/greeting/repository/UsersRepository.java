package com.example.rest.greeting.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.rest.greeting.entity.Users;

@Repository
public interface UsersRepository extends JpaRepository<Users, Long> {

}
