package com.todolist.persistence;

import org.springframework.data.repository.CrudRepository;

import com.todolist.doamin.TodolistVO;

public interface TodolistRepository extends CrudRepository<TodolistVO,Long>{

}
