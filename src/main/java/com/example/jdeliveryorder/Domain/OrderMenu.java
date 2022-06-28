package com.example.jdeliveryorder.Domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import org.hibernate.engine.internal.Cascade;

import javax.persistence.*;

@Entity(name="order_menu")
public class OrderMenu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long  id;
    private int OrderMenuCount;
    @JsonBackReference
    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name="menu_id") //외래키, 여기가 연관관계 주인
    private Menu menu;
    @JsonBackReference
    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name ="order_id") //외래키, 여기가 연관관계 주인
    private Order order;

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getOrderMenuCount() {
        return OrderMenuCount;
    }

    public void setOrderMenuCount(int orderMenuCount) {
        OrderMenuCount = orderMenuCount;
    }
}
