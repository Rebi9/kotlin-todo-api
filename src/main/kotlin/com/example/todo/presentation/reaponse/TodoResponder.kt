package com.example.todo.presentation.reaponse

import com.example.todo.infrastructure.entity.Todo
import org.springframework.stereotype.Component

@Component
class TodoResponder {
    fun respond(todo: Todo) : TodoResponse {
        return TodoResponse(
                todo.id,
                todo.content,
                todo.isDone,
                todo.createdAt,
                todo.updatedAt
        )
    }
}