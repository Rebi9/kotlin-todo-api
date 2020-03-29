package com.example.todo.infrastructure.repository

import com.example.todo.infrastructure.entity.Todo
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface TodoRepository : JpaRepository<Todo, String> {
}