package com.sldroid.cardview;

/**
 * Copyright(c) SLDroid Creations (Pvt) Ltd.  All Rights Reserved.
 * This software is the proprietary information of SLDroid Creations (Pvt) Ltd.
 * .
 * Created by dilanka on 6/3/17.
 */

public class Order {

    private String cusName;
    private String fuelType;
    private int fuelVolume;
    private int fuelPrice;
    private byte orderStatus;
    private float orderSrc;
    private float orderDes;

    public Order(){

    }

    public Order(byte orderStatus, String cusName, String fuelType,
                 int fuelVolume, int fuelPrice, float orderSrc, float orderDes){
        this.cusName = cusName;
        this.fuelType = fuelType;
        this.fuelVolume = fuelVolume;
        this.fuelPrice = fuelPrice;
        this.orderStatus = orderStatus;
        this.orderSrc = orderSrc;
        this.orderDes = orderDes;
    }

    public String getCusName() {
        return cusName;
    }

    public void setCusName(String cusName) {
        this.cusName = cusName;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public int getFuelVolume() {
        return fuelVolume;
    }

    public void setFuelVolume(int fuelVolume) {
        this.fuelVolume = fuelVolume;
    }

    public int getFuelPrice() {
        return fuelPrice;
    }

    public void setFuelPrice(int fuelPrice) {
        this.fuelPrice = fuelPrice;
    }

    public byte getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(byte orderStatus) {
        this.orderStatus = orderStatus;
    }

    public float getOrderSrc() {
        return orderSrc;
    }

    public void setOrderSrc(float orderSrc) {
        this.orderSrc = orderSrc;
    }

    public float getOrderDes() {
        return orderDes;
    }

    public void setOrderDes(float orderDes) {
        this.orderDes = orderDes;
    }
}
