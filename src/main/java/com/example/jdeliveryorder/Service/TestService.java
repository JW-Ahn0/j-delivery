package com.example.jdeliveryorder.Service;

import com.example.jdeliveryorder.Domain.Menu;
import com.example.jdeliveryorder.Domain.Order;
import com.example.jdeliveryorder.Domain.OrderMenu;
import com.example.jdeliveryorder.Repository.MenuRepository;
import com.example.jdeliveryorder.Repository.OrderMenuRepository;
import com.example.jdeliveryorder.Repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

@Service
public class TestService {
    private final MenuRepository menuRepository ;
    private final OrderMenuRepository orderMenuRepository;
    private final OrderRepository orderRepository;

    @Autowired
    public TestService(MenuRepository menuRepository, OrderMenuRepository orderMenuRepository, OrderRepository orderRepository) {
        this.menuRepository = menuRepository;
        this.orderMenuRepository = orderMenuRepository;
        this.orderRepository = orderRepository;
    }

    @Transactional
    public Order test(){
        Order testOrder2 = new Order();
        //Order 생성
        Order testOrder = new Order();
        testOrder.setOrderStatus("주문접수");
        testOrder.setAddress("서울특별시");
        testOrder.setUserId("ajw");
        testOrder.setStoreId(15L);
        testOrder.setTotalPrice(1000L);
        //Menu 생성
        Menu testMenu = new Menu();
        testMenu.setMenuId(12);
        testMenu.setMenuName("파스타");
        testMenu.setMenuPrice(7000);
        testMenu.setMenuPicture("url");
        testMenu.setMenuDescription("매콤한 맛과 느끼한 맛의 조화");
        testMenu.setStoreId(15L);

        //OrderMenu 생성
        OrderMenu testOrderMenu = new OrderMenu();
        testOrderMenu.setOrderMenuCount(2);
        testOrder.getOrderMenus().add(testOrderMenu);
        testMenu.getOrderMenus().add(testOrderMenu);
        orderRepository.save(testOrder);
        menuRepository.save(testMenu);
        //Order와 Menu를 OrderMenu와 양방향 설정.
        testOrderMenu.setOrder(testOrder);
        testOrderMenu.setMenu(testMenu);
        orderMenuRepository.save(testOrderMenu);

        return testOrder;
    }
}
