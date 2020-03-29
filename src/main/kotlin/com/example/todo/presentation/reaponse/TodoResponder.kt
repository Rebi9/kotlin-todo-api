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

    fun response(todoList: List<Todo>) : MutableList<TodoResponse> {
        val todoResponseList : MutableList<TodoResponse> = mutableListOf()
        todoList.stream().forEach{ todo -> todoResponseList.add(respond(todo))}

        return todoResponseList
    }
}