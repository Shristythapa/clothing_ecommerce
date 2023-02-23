package com.example.stuff.repo;

import com.example.stuff.Entity.User;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

@Transactional

public interface UserRepo extends JpaRepository<User, Integer> {
    @Query(value = "select * from users where email =?1", nativeQuery=true)
    Optional<User> findByEmail(String email);

    @Query(value = "select * from users where email =?1", nativeQuery=true)
    User findByEmail2(String email);

    @Modifying
    @Query(value = "insert into users_roles(user_id,role_id) values(?1,2)",nativeQuery = true)
    void insertUserRole(Integer u_id);

 }
