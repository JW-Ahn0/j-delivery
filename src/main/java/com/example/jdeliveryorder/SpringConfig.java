package com.example.jdeliveryorder;

import com.example.jdeliveryorder.Repository.MenuRepository;
import com.example.jdeliveryorder.Repository.OrderMenuRepository;
import com.example.jdeliveryorder.Repository.OrderRepository;
import com.example.jdeliveryorder.Service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {
    private final MenuRepository menuRepository;
    private final OrderMenuRepository orderMenuRepository;
    private final OrderRepository orderRepository;

    @Autowired
    public SpringConfig(MenuRepository menuRepository, OrderMenuRepository orderMenuRepository, OrderRepository orderRepository) {
        this.menuRepository = menuRepository;
        this.orderMenuRepository = orderMenuRepository;
        this.orderRepository = orderRepository;
    }
}
