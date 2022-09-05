package com.todolist.todolist.repository

import org.hibernate.annotations.ColumnDefault
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
class Todo (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //auto increment하게 지정해주는 거임
    var id : Long? = null,

    @Column(nullable = false)
    @ColumnDefault("false")
    var completed : Boolean = false,

    @Column(nullable = false)
    var todoName : String

    )