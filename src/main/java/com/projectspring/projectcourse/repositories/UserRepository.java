package com.projectspring.projectcourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projectspring.projectcourse.entities.User;

public interface UserRepository extends JpaRepository <User, Long> {

}
