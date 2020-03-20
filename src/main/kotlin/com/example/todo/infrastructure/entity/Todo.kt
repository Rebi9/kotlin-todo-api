package com.example.todo.infrastructure.entity

import lombok.Getter
import lombok.Setter
import org.hibernate.annotations.CreationTimestamp
import org.hibernate.annotations.UpdateTimestamp
import java.time.LocalDateTime
import java.util.*
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id

@Getter
@Setter
@Entity
class Todo(

        @Id
        val id: UUID,

        val content: String,

        @Column(name = "is_done")
        val isDone: Boolean,

        @Column(name = "created_at")
        @CreationTimestamp
        val createdAt: LocalDateTime,

        @Column(name = "updated_at")
        @UpdateTimestamp
        val updatedAt: LocalDateTime
)
