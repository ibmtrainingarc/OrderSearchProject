package com.ibm.searchorder;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderSearchController {
	@Autowired
	OrderService orderService; // DI

	@GetMapping("/order")
	List<Order> getOrders() {
		return orderService.getOrders();
	}

	/**
	 * method to search for an order
	 * 
	 * @param orderId
	 * @return return a matching order
	 */

	@GetMapping("/order/{id}")
	Optional<Order> getOrderById(@PathVariable("id") String orderId) {
		return orderService.getOrderById(orderId);
	}
}
