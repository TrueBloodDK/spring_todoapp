package com.deniskrasilnikow.todoapp.repositories;

import com.deniskrasilnikow.todoapp.model.TodoItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoItemRepository extends JpaRepository<TodoItem, Long> {
}
