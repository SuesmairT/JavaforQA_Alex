package Telran.HW210424.Order_restoran;

import java.util.LinkedHashSet;
import java.util.Set;

class Kitchen {
    private Set<Order> orders;

    public Kitchen() {
        this.orders = new LinkedHashSet<>();
    }

    public void addOrder(Order order) {
        orders.add(order);
        System.out.println("Order " + order.getOrderId() + " added to the kitchen.");
    }

    public void processOrders() {
        for (Order order : orders) {
            System.out.println("Cooking dish: " + order.getDishName() + " for order " + order.getOrderId());
            // Здесь можно добавить логику обработки заказа
        }
        orders.clear(); // Очистка заказов после обработки
    }
}
