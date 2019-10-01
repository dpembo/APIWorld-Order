package com.example.orderservice;

import org.junit.Assert;
import org.junit.Test;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import java.net.URISyntaxException;
import java.util.List;

import com.example.orderservice.OrderServiceApplication;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderServiceApplicationTests {
 
    @Test
    public void testSingleOrder() throws URISyntaxException
    {
        OrderServiceApplication orderServiceApplication = new OrderServiceApplication();
        List<Order> orderList = orderServiceApplication.getOrder("O1");
        Order ord = orderList.get(0);

        Assert.assertEquals("O1", ord.getOrderId());
    }

    @Test
    public void testOrderList() throws URISyntaxException
    {
        OrderServiceApplication orderServiceApplication = new OrderServiceApplication();
        List<Order> orderList = orderServiceApplication.getOrderList();
        Assert.assertEquals(true, orderList.size()>0);
    }
}