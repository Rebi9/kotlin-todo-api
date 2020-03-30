package com.example.todo.presentation.reaponse

import com.fasterxml.jackson.annotation.JsonFormat
import com.fasterxml.jackson.annotation.JsonProperty
import java.time.LocalDateTime

class TodoResponse(
        val id: String?,
        val content: String,

        @JsonProperty("is_done")
        val isDone: Boolean,

        @JsonProperty("created_at")
        @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
        val createdAt: LocalDateTime?,

        @JsonProperty("updated_at")
        @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
        val updatedAt: LocalDateTime?
)