package com.ohgiraffers.association.section02.onetomany;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderRegistService {

    private OrderRepository orderRepository;

    @Autowired

    public OrderRegistService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public void registerOrder(List<OrderMenuDTO> orderinfo) {
        List<OrderMenu> orderMenus = orderinfo.stream()
                .map(orderDetail -> new OrderMenu(new OrderMenuPK(0,orderDetail.getMenuCode(),orderDetail.getOrderAmount())))
    }
}
