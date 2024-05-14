package com.expedia.demo.entity

import com.fasterxml.jackson.annotation.JsonIgnore
import jakarta.persistence.*

@Entity
data class Employee(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val employeeId: Long,
    val name: String,
    @ManyToOne()
    @JoinColumn(name = "project_id")
    @JsonIgnore
    var project: Project?
)