package com.deniskrasilnikow.todoapp.controllers;

import com.deniskrasilnikow.todoapp.model.TodoItem;
import com.deniskrasilnikow.todoapp.repositories.TodoItemRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class TodoController {

    private final TodoItemRepository todoItemRepository;

    public TodoController(TodoItemRepository todoItemRepository) {
        this.todoItemRepository = todoItemRepository;
    }

    @GetMapping
    public String index(Model model){
        todoItemRepository.save(new TodoItem("Bebra1"));
        todoItemRepository.save(new TodoItem("Bebra2"));

        List<TodoItem> allTodos = todoItemRepository.findAll();

        model.addAttribute("AllTodos", allTodos);

        return "index";
    }
}
