package com.example.jpademo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserClassSpringBoot,Long> {
}
