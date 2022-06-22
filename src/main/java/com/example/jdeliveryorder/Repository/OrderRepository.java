package com.example.jdeliveryorder.Repository;

import com.example.jdeliveryorder.Domain.Order;

import java.util.List;
import java.util.Optional;

public interface OrderRepository {
    Order makeOrder(Order order);

}
