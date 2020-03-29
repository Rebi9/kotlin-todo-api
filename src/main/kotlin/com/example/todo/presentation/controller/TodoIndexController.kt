package com.example.todo.presentation.controller

import com.example.todo.application.service.TodoQueryService
import com.example.todo.presentation.reaponse.TodoResponder
import com.example.todo.presentation.reaponse.TodoResponse
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class TodoIndexController(val todoQueryService: TodoQueryService, val todoResponder: TodoResponder) {

    @GetMapping("/todo")
    fun invoke() : MutableList<TodoResponse> {
        return todoResponder.response(todoQueryService.findAll())
    }
}