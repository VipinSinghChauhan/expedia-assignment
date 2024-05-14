package com.expedia.demo.repository

import com.expedia.demo.dto.CustomerOrderDto
import com.expedia.demo.entity.Orders
import jakarta.persistence.Tuple
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.stereotype.Repository

@Repository
interface OrderRepository : JpaRepository<Orders, Long> {
    @Query(nativeQuery = true, value = "select customer_id as customerId , count(*) as orderCount from orders group by customer_id order by orderCount desc")
    fun getOrders(): MutableList<Tuple>
}