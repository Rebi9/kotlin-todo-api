package com.example.todo.presentation.controller

import com.example.todo.application.service.TodoRecordService
import com.example.todo.presentation.reaponse.TodoResponder
import com.example.todo.presentation.reaponse.TodoResponse
import com.example.todo.presentation.request.TodoRequest
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class TodoStoreController(val todoRecordService: TodoRecordService, val todoResponder: TodoResponder) {

    @PostMapping("/todo")
    fun invoke(request: TodoRequest) : TodoResponse {
        val storedResult = todoRecordService.store(request)

        return todoResponder.respond(storedResult)
    }
}