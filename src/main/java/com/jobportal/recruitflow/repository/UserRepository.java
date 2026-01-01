package com.jobportal.recruitflow.repository;

import com.jobportal.recruitflow.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
