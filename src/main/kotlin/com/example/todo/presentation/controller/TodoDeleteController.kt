package com.example.todo.presentation.controller

import com.example.todo.application.service.TodoRecordService
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class TodoDeleteController(val todoRecordService: TodoRecordService) {

    @DeleteMapping("/todo/{id}")
    fun invoke(@PathVariable id: String) {
        todoRecordService.delete(id)
    }
}