package org.generation.SpringBootAssessment.service;

import org.generation.SpringBootAssessment.repository.Entity.Todo;

import java.util.Date;

import java.util.List;
import java.util.Optional;


    public interface ITodoService {

        List<todo> getTodosByUser(String user);

        Optional<todo> getTodoById(long id);

        void updateTodo(Todo todo);

        void addTodo(String name, String desc, Date targetDate, boolean isDone);

        void deleteTodo(long id);

        void saveTodo(Todo todo);
    }

