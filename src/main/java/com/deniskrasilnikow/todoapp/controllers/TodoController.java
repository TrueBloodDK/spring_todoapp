package com.deniskrasilnikow.todoapp.controllers;

import com.deniskrasilnikow.todoapp.model.TodoItem;
import com.deniskrasilnikow.todoapp.repositories.TodoItemRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TodoController {

    private final TodoItemRepository todoItemRepository;

    public TodoController(TodoItemRepository todoItemRepository) {
        this.todoItemRepository = todoItemRepository;
    }

    @GetMapping
    public String index(Model model){
        model.addAttribute(
                "data",
                "Bebra"
        );
        TodoItem todoItem = new TodoItem();
        return "index";
    }
}
