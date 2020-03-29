package com.example.todo.presentation.request

import org.hibernate.validator.constraints.Length

class TodoRequest(@field:Length(max = 100)val content: String, val isDone: Boolean)
