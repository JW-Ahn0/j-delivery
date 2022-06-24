package com.example.jdeliveryorder.Controller;

import com.example.jdeliveryorder.Domain.Order;
import com.example.jdeliveryorder.Repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequiredArgsConstructor
public class OrderController {
    private final OrderRepository orderRepository;

    @GetMapping("/")
    public String home(){
        return "home";
    }

    @PostMapping("/order")
    public Order makeOrder(){
        final Order order = Order.builder()
                .orderDate(LocalDateTime.now())
                .userId("ajw")
                .storeId(1L)
                .orderStatus("jaa")
                .address("seoul")
                .totalPrice(10000L)
                .build();
        return orderRepository.save(order);
    }
    @PostMapping("/test")
    public Order testOrder(){
        final Order order = Order.builder()
                .orderDate(LocalDateTime.now())
                .userId("ajw")
                .storeId(1L)
                .orderStatus("jaa")
                .address("seoul")
                .totalPrice(10000L)
                .build();
        return orderRepository.save(order);
    }
}
