package com.expedia.demo.service

import com.expedia.demo.entity.Product
import com.expedia.demo.repository.ProductRepository
import org.springframework.stereotype.Service

@Service
class ProductService(val productRepository: ProductRepository) {

    fun findProducts(price: Int): MutableList<Product> {
        return productRepository.findProduct(price);
    }

    fun insertProduct(product: Product) {
        productRepository.save(product);
    }
}