package com.example.rest.greeting.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

import com.example.rest.greeting.entity.Users;

@Repository
public interface UsersRepository extends JpaRepository<Users, Long> {
    
    @Query(value = "SELECT p.slug, p.title, p.body, p.created_at, u.name "
                + "FROM Users u INNER JOIN Posts p ON u.id=p.userid", nativeQuery = true)
    List<Object[]> getAllUserPosts();

    @Query(value = "SELECT * FROM Users u WHERE UPPER(u.name)=UPPER(?1)", nativeQuery = true)
	Optional<Users> getUserByName(String name);

    Optional<Users> findByEmail(String email);
}
