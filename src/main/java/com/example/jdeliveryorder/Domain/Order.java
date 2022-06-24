package com.example.jdeliveryorder.Domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Builder
@Getter
@Entity(name="ORDER")
@AllArgsConstructor
@NoArgsConstructor
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderId;

    @Column(name="date")
    private LocalDateTime orderDate;

    @Column(name="status",length = 45,nullable = false)
    private String orderStatus;

    @Column(name="address",length = 45,nullable = false)
    private String address;

    @Column(name="USER_id",length = 20,nullable = false)
    private String userId;

    @Column(name="STORE_id",nullable = false)
    private Long storeId;

    @Column(name="total_price",nullable = false)
    private Long totalPrice;
}
