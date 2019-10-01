package com.example.orderservice;


import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Order {

    private String orderId;
    private String orderDesc;
    private Date orderDate;
    private String customerId;
    private Map<String,OrderLineItem> orderLine = new HashMap<String,OrderLineItem>();
    
    public Order()
    {

    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderDesc() {
        return orderDesc;
    }

    public void setOrderDesc(String orderDesc) {
        this.orderDesc = orderDesc;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public Map<String, OrderLineItem> getOrderLine() {
        return orderLine;
    }

    public void setOrderLine(Map<String,OrderLineItem> orderLine) {
        this.orderLine = orderLine;
    }

    public void addOrderLine(OrderLineItem oItem)
    {
        getOrderLine().put(oItem.getLineId(), oItem);
    }

    @Override
    public String toString() {
        return "Order [customerId=" + customerId + ", orderDate=" + orderDate + ", orderDesc=" + orderDesc
                + ", orderId=" + orderId + ", orderLine=" + orderLine + "]";
    }

    

}