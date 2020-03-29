package com.example.todo.presentation.controller

import com.example.todo.application.service.TodoQueryService
import com.example.todo.presentation.reaponse.TodoResponder
import com.example.todo.presentation.reaponse.TodoResponse
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class TodoShowController(val todoQueryService: TodoQueryService, val todoResponder: TodoResponder) {

    @GetMapping("/todo/{id}")
    fun invoke(@PathVariable id: String) : TodoResponse {
        return todoResponder.respond(todoQueryService.findById(id))
    }
}