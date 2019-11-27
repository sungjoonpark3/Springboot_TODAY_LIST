package com.todolist.service;

import java.util.List;



import com.todolist.doamin.TodolistVO;

public interface TodolistService {

	void insertTodolist(TodolistVO todolistVO);
	
	void updateTodolist(TodolistVO todolistVO);
	
	void deleteTodolist(TodolistVO todolistVO);
	
	List<TodolistVO> getTodolist(TodolistVO todolistVO);
	
	TodolistVO getupdateTodolist(TodolistVO todolistVO);
	
}
