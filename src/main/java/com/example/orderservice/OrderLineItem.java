package com.example.orderservice;


public class OrderLineItem {
    private String lineId;
    private String productId;
    private int number;

    public OrderLineItem()
    {

    }

    public OrderLineItem(String lineId, String productId, int number)
    {
        this.lineId = lineId;
        this.productId = productId;
        this.number = number;
    }

    public String getLineId() {
        return lineId;
    }

    public void setLineId(String lineId) {
        this.lineId = lineId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "OrderLineItem [lineId=" + lineId + ", number=" + number + ", productId=" + productId + "]";
    }


}
