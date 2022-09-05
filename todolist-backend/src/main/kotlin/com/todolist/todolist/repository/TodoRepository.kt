package com.todolist.todolist.repository

import org.springframework.data.repository.CrudRepository

// spring이 데이터를 조작할 수 있게. 여기서는 Todo라는 클래스의 entity에 CRUD를 할 수 있게 해주는 레파지토리임. 인터페이스.
// spring이 가지고 있는 CRUD를 상속받을 거임
interface TodoRepository : CrudRepository<Todo, Long>