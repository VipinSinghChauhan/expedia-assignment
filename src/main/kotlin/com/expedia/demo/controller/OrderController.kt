package com.expedia.demo.controller

import com.expedia.demo.dto.CustomerOrderDto
import com.expedia.demo.entity.Orders
import com.expedia.demo.service.OrderService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/order")
class OrderController(val orderService: OrderService) {
    @PostMapping("/")
    fun addOrder(@RequestBody order: Orders): Orders {
        return orderService.addOrder(order);
    }

    @GetMapping("/customer/")
    fun getOrderCount(): MutableList<CustomerOrderDto> {
        return orderService.getOrderCount();
    }
}