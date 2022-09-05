package com.todolist.todolist.service

import com.todolist.todolist.repository.Todo
import com.todolist.todolist.repository.TodoRepository
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service

@Service
class TodoService (
    private val todoRepository: TodoRepository
    ){
    // 조회
    fun getTodos() = todoRepository.findAll()
    //추가
    fun insertTodo(todoName : String):Todo = todoRepository.save(Todo(todoName = todoName))
    //수정
    fun updateTodo(todoId : Long) : Todo{
        val todo = todoRepository.findByIdOrNull(todoId) ?: throw Exception()
        todo.completed = !todo.completed
        return todoRepository.save(todo)
    }
    //삭제
    fun deleteTodo(todoId: Long) = todoRepository.deleteById(todoId)
}