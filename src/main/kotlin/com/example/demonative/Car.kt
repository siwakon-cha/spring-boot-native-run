package com.example.demonative

import jakarta.persistence.*

@Entity
@Table(name = "Car")
data class Car(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id")
        val id: Int = 0,
        val name:String ,
)
