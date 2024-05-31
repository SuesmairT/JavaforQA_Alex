package Telran.HW210424.Order_restoran;

import java.util.LinkedHashSet;
import java.util.Set;

public class Order {private int orderId;
    private String dishName;

    public Order(int orderId, String dishName) {
        this.orderId = orderId;
        this.dishName = dishName;
    }

    // Геттеры и сеттеры
    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getDishName() {
        return dishName;
    }

    public void setDishName(String dishName) {
        this.dishName = dishName;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", dishName='" + dishName + '\'' +
                '}';
    }
}




