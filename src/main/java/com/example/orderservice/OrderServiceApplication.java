package com.example.orderservice;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class OrderServiceApplication {

	public static Map<String, Order> orderList = new HashMap<String,Order>();

	public static void main(String[] args) {
		SpringApplication.run(OrderServiceApplication.class, args);
		populateOrderList();
	}

	private static void populateOrderList()
	{
		orderList.clear();
		Order o1 = new Order();
		OrderLineItem item1 = new OrderLineItem("1","foo",2);
		OrderLineItem item2 = new OrderLineItem("2","bar",1);
		o1.addOrderLine(item1);
		o1.addOrderLine(item2);
		o1.setOrderDate(new Date());
		o1.setOrderDesc("Two Foos and a bar please");
		o1.setOrderId("O1");

		Order o2 = new Order();
		OrderLineItem item3 = new OrderLineItem("1","bar",10);
		o2.addOrderLine(item3);
		o2.setOrderDate(new Date());
		o2.setOrderDesc("I like bars");
		o2.setOrderId("O2");
		

		orderList.put(o1.getOrderId(), o1);
		orderList.put(o2.getOrderId(), o2);
	}

	@RequestMapping("/")
	public String home() {
		return "Hello from order service";
	}

	@GetMapping("/order")
	public List<Order> getOrderList() 
	{
		if(orderList==null||orderList.isEmpty())populateOrderList();
		return new ArrayList<Order>(orderList.values());
	}

	@GetMapping("/order/{id}")
    public List<Order> getOrder(@PathVariable(value="id") String id){
		
		if(orderList==null||orderList.isEmpty())populateOrderList();
		List<Order> singleItemList = new ArrayList<Order>();
		singleItemList.add(orderList.get(id));
		return singleItemList;

	}

	public static void setOrderList(Map<String, Order> orderList) {
		OrderServiceApplication.orderList = orderList;
	}
}
