package com.example.todo.application.service

import com.example.todo.infrastructure.entity.Todo
import com.example.todo.infrastructure.repository.TodoRepository
import com.example.todo.presentation.request.TodoRequest
import org.springframework.stereotype.Service
import java.util.*

@Service
class TodoRecordService (private val todoRepository: TodoRepository) {
    fun store(request: TodoRequest): Todo {
        val todoEntity = Todo(UUID.randomUUID().toString(), request.content, request.isDone, null, null)
        return todoRepository.save(todoEntity)
    }

    fun update(request: TodoRequest, id: String): Todo {
        val targetEntity = todoRepository.findById(id).orElseThrow()
        targetEntity.content = request.content
        targetEntity.isDone = request.isDone
        return todoRepository.save(targetEntity)
    }
}