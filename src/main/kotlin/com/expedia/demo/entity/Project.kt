package com.expedia.demo.entity

import com.fasterxml.jackson.annotation.JsonIgnore
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.OneToMany

@Entity
class Project(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val projectId: Long,
    val projectName: String,
    val description: String?,
    @OneToMany(mappedBy = "project")
    val employees: MutableList<Employee>?
)