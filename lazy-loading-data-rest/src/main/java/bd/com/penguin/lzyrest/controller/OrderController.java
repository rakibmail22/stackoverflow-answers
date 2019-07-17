package bd.com.penguin.lzyrest.controller;

import bd.com.penguin.lzyrest.domain.Order;
import bd.com.penguin.lzyrest.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author bashir
 * @since 7/17/19
 */

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/orders")
public class OrderController {

    private final OrderRepository orderRepository;

    @GetMapping(value = "/list")
    public List<Order> getOrders() {
        return orderRepository.findAll();
    }
}