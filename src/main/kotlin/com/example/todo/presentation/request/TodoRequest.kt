package com.example.todo.presentation.request

import java.time.LocalDateTime
import java.util.*

class TodoRequest(val id: UUID?, val content: String, val isDone: Boolean,
                  val createdAt: LocalDateTime?, val updatedAt: LocalDateTime?)
