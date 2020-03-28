package com.example.todo.infrastructure.entity

import org.hibernate.annotations.CreationTimestamp
import org.hibernate.annotations.UpdateTimestamp
import java.time.LocalDateTime
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id

@Entity
class Todo(

        @Id
        val id: String?,

        var content: String,

        @Column(name = "is_done")
        var isDone: Boolean,

        @Column(name = "created_at")
        @CreationTimestamp
        val createdAt: LocalDateTime?,

        @Column(name = "updated_at")
        @UpdateTimestamp
        val updatedAt: LocalDateTime?
)
