package com.example.Auth.repository;

import org.springframework.stereotype.Repository;

import com.example.Auth.model.User;

import java.util.Optional;

import org.springframework.data.repository.ListCrudRepository;
import java.util.List;


@Repository
public interface UserRepository extends ListCrudRepository<User, Long> {

    Optional<User> findByEmail(String email);
    Optional<User> findByVerificationCode(String verificationCode);

}
