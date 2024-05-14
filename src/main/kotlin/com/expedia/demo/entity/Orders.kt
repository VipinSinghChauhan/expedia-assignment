package com.expedia.demo.entity

import com.fasterxml.jackson.annotation.JsonFormat
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import java.util.Date

@Entity
data class Orders(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val orderId: Long,
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    val orderDate: Date,
    val customerId: Long
)