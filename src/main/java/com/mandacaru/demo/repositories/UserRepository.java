package com.mandacaru.demo.repositories;

import com.mandacaru.demo.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
