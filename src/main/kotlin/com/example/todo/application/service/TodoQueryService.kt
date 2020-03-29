package com.example.todo.application.service

import com.example.todo.infrastructure.entity.Todo
import com.example.todo.infrastructure.repository.TodoRepository
import org.springframework.stereotype.Service

@Service
class TodoQueryService(private val todoRepository: TodoRepository) {

    fun findById(id: String): Todo {
        return todoRepository.findById(id).orElseThrow()
    }
}