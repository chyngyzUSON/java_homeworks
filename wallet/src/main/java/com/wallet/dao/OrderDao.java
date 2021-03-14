package com.wallet.dao;

import com.wallet.model.Category;
import com.wallet.model.Order;
import com.wallet.model.Wallet;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class OrderDao {
    private static HashMap<Long, Order> orders = new HashMap<>();

    static {
        Order or1 = Order.builder()
                .id(1L)
                .category(Category.builder().build())
                .amount(1L)
                .description("Описание1 ...")
                .wallet(Wallet.builder().build())
                .isExpense(true)
                .createdDate(new Date())
                .build();
        Order or2 = Order.builder()
                .id(2L)
                .category(Category.builder().build())
                .amount(1L)
                .description("Описание2 ...")
                .wallet(Wallet.builder().build())
                .isExpense(false)
                .createdDate(new Date())
                .build();
        orders.put(1L, or1);
        orders.put(2L, or2);
    }

    public List<Order> getAllOrders(){
        return new ArrayList<>(orders.values());
    }

    public Order createOrder(Order order){
        orders.put(order.getId(), order);
        return orders.get(order.getId());
    }

    public List<Order> getAllOrdersByCategoryId(Category category){
        return new ArrayList<>(orders.values());
    }

    public void deleteOrderById(Long orderId){
        orders.remove(orderId);
    }
}
