package org.generation.SpringBootAssessment.repository;

import java.util.List;

import org.generation.SpringBootAssessment.repository.Entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository<todo> extends JpaRepository <todo, Long > {
    List < todo > findByUserName(String user);
}