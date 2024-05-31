package Telran.HW210424.Order_restoran;

public class Main {

        public static void main(String[] args) {
            Kitchen kitchen = new Kitchen();

            // Создание и добавление заказов
            Order order1 = new Order(1, "Pizza");
            Order order2 = new Order(2, "Pasta");
            Order order3 = new Order(3, "Salad");

            kitchen.addOrder(order1);
            kitchen.addOrder(order2);
            kitchen.addOrder(order3);

            // Обработка заказов
            kitchen.processOrders();


    }
}
