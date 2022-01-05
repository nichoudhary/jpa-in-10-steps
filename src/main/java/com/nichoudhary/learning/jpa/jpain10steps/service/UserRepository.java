package com.nichoudhary.learning.jpa.jpain10steps.service;

import com.nichoudhary.learning.jpa.jpain10steps.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
