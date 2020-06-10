package com.bhavesh.test.repositories;


import com.bhavesh.test.models.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Session, Long> {
}
