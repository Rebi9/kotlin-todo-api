package com.example.todo.presentation.controller

import com.example.todo.application.service.TodoRecordService
import com.example.todo.presentation.reaponse.TodoResponder
import com.example.todo.presentation.reaponse.TodoResponse
import com.example.todo.presentation.request.TodoRequest
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class TodoUpdateController(val todoRecordService: TodoRecordService, val todoResponder: TodoResponder) {

    @PutMapping("todo/{id}")
    fun invoke(@PathVariable id: String, @RequestBody @Validated request: TodoRequest) : TodoResponse {
        return todoResponder.respond(todoRecordService.update(request, id))
    }
}