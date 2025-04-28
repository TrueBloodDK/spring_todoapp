package com.deniskrasilnikow.todoapp;

import com.deniskrasilnikow.todoapp.model.TodoItem;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodoApplication {

	public static void main(String[] args) {
		SpringApplication.run(TodoApplication.class, args);
	}

	TodoItem todoItem = new TodoItem();
	//this is test commit
}

