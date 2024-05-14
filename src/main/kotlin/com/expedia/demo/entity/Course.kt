package com.expedia.demo.entity

import com.fasterxml.jackson.annotation.JsonIgnore
import jakarta.persistence.*

@Entity
data class Course(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val courseId: Long,
    val courseName: String,
    @JsonIgnore
    @ManyToMany(fetch = FetchType.LAZY, cascade = [CascadeType.PERSIST, CascadeType.MERGE], mappedBy = "courses")
    val students: MutableList<Student>?
)