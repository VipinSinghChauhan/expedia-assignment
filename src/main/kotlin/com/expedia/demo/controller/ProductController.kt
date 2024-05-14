package com.expedia.demo.controller

import com.expedia.demo.entity.Product
import com.expedia.demo.service.ProductService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/product")
class ProductController(val service: ProductService) {
    @GetMapping("/find")
    fun findProducts(@RequestParam("price") price: Int): MutableList<Product> {
        return service.findProducts(price)
    }

    @PostMapping("/")
    fun insertProduct(@RequestBody product: Product) {
        service.insertProduct(product);
    }
}