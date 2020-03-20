package com.example.todo.infrastructure.repository

import com.example.todo.infrastructure.entity.Todo
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface TodoRepository : JpaRepository<Todo, UUID> {
}