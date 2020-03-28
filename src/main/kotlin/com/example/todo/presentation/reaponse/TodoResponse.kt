package com.example.todo.presentation.reaponse

import com.fasterxml.jackson.annotation.JsonProperty
import java.time.LocalDateTime

class TodoResponse(
        val id: String?,
        val content: String,

        @JsonProperty("is_done")
        val isDone: Boolean,

        @JsonProperty("crated_At")
        val createdAt: LocalDateTime?,

        @JsonProperty("updated_At")
        val updatedAt: LocalDateTime?
)