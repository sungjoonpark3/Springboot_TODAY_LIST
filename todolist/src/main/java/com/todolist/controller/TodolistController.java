package com.todolist.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.todolist.doamin.TodolistVO;
import com.todolist.service.TodolistService;
//
@Controller
@RequestMapping("/todolist/")
public class TodolistController {

	@Autowired
	private TodolistService todolistService;
	
	@GetMapping("/getTodolist")
	public String getTodolist(Model model,TodolistVO todolistVO) {
		List<TodolistVO> todolist = todolistService.getTodolist(todolistVO);
		model.addAttribute("todolist", todolist);
		return "todolist/getTodolist";
	}
	
	@GetMapping("/getupdateTodolist")
	public String getupdateTodolist(TodolistVO todolistVO,Model model) {
		model.addAttribute("todolistVO",todolistService.getupdateTodolist(todolistVO));
		return "todolist/updateTodolist";
	}
	
	@GetMapping("/insertTodolist")
	public String insertTodolistView() {
		return "todolist/insertTodolist";
	}
	
	@PostMapping("/insertTodolist")
	public String insertTodolist(TodolistVO todolistVO) {
		todolistService.insertTodolist(todolistVO);
		return "redirect:getTodolist";
	}
	
	@PostMapping("/updateTodolist")
	public String updateTodolist(TodolistVO todolistVO) {
		todolistService.updateTodolist(todolistVO);
		return "redirect:getTodolist";
	}
	
	@GetMapping("/deleteTodolist")
	public String deleteTodolist(TodolistVO todolistVO) {
		todolistService.deleteTodolist(todolistVO);
		return "forward:getTodolist";
	}
}

