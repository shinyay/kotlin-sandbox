package com.google.shinyay.model

data class Employee(val firstName: String,
                    val lastName: String,
                    val id: Int) {
    var age: Int = 0
    var gender: Gender = Gender.MALE }