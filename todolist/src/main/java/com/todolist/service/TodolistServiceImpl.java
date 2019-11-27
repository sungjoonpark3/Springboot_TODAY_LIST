package com.todolist.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.todolist.doamin.TodolistVO;
import com.todolist.persistence.TodolistRepository;

@Service
public class TodolistServiceImpl implements TodolistService {

	@Autowired
	private TodolistRepository todolistRepo;

	@Override
	public void insertTodolist(TodolistVO todolistVO) {
		todolistRepo.save(todolistVO);
		
	}

	@Override
	public void updateTodolist(TodolistVO todolistVO) {
		TodolistVO findTodolistVO =todolistRepo.findById(todolistVO.getSeq()).get();
		findTodolistVO.setContent(todolistVO.getContent());
		todolistRepo.save(findTodolistVO);
	}

	@Override
	public void deleteTodolist(TodolistVO todolistVO) {
		todolistRepo.deleteById(todolistVO.getSeq());
		
	}

	@Override
	public List<TodolistVO> getTodolist(TodolistVO todolistVO) {
		// TODO Auto-generated method stub
		return (List<TodolistVO>) todolistRepo.findAll();
	}

	@Override
	public TodolistVO getupdateTodolist(TodolistVO todolistVO) {
		return todolistRepo.findById(todolistVO.getSeq()).get();
		
	}


	
	
}
