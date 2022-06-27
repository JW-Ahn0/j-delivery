package com.example.jdeliveryorder.Controller;

import com.example.jdeliveryorder.Domain.Order;
import com.example.jdeliveryorder.Repository.MenuRepository;
import com.example.jdeliveryorder.Repository.OrderMenuRepository;
import com.example.jdeliveryorder.Repository.OrderRepository;
import com.example.jdeliveryorder.Service.OrderService;
import com.example.jdeliveryorder.Service.TestService;
import lombok.RequiredArgsConstructor;
import org.aspectj.weaver.ast.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class OrderController {

    private final TestService testService;

    @Autowired
    public OrderController(TestService testService) {
        this.testService = testService;
    }

    @GetMapping("/")
    public String home(){
        return "home";
    }

    @PostMapping("/order")
    public Order makeOrder(){
        //
        return new Order();
    }
    @PostMapping("/test")
    public Order testOrder(){
        return testService.test();
    }
}
