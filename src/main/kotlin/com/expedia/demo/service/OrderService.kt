package com.expedia.demo.service

import com.expedia.demo.dto.CustomerOrderDto
import com.expedia.demo.entity.Orders
import com.expedia.demo.repository.OrderRepository
import org.springframework.stereotype.Service

@Service
class OrderService(val orderRepository: OrderRepository) {
    fun addOrder(order: Orders): Orders {
        return orderRepository.save(order);
    }

    fun getOrderCount(): MutableList<CustomerOrderDto> {
        val list = orderRepository.getOrders();
        val customerOrderDtoList: MutableList<CustomerOrderDto> =
            list.stream().map { t -> CustomerOrderDto(t.get("CUSTOMERID"), t.get("ORDERCOUNT")) }.toList()
        return customerOrderDtoList;
    }
}