package com.expedia.demo.repository

import com.expedia.demo.entity.Product
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param
import org.springframework.stereotype.Repository

@Repository
interface ProductRepository : JpaRepository<Product, Long> {
    @Query(nativeQuery = true, value = "select * from product where price>:price")
    fun findProduct(@Param("price") price: Int): MutableList<Product>
}