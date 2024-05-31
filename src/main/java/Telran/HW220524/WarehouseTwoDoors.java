package Telran.HW220524;

import java.util.Deque;
import java.util.LinkedList;

public class WarehouseTwoDoors {
    private Deque<String> warehouse = new LinkedList<>();

    // Метод для загрузки продукции в начало очереди
    public void loadProduct(String product) {
        warehouse.addFirst(product);
        System.out.println("Loaded product at front: " + product);
    }

    // Метод для отгрузки продукции с конца очереди
    public void unloadProduct() {
        if (!warehouse.isEmpty()) {
            String product = warehouse.pollLast();
            System.out.println("Unloaded product from back: " + product);
        } else {
            System.out.println("No products to unload.");
        }
    }

    public static void main(String[] args) {
        WarehouseTwoDoors warehouse = new WarehouseTwoDoors();

        warehouse.loadProduct("Brick1");
        warehouse.loadProduct("Brick2");
        warehouse.loadProduct("Brick3");

        warehouse.unloadProduct();
        warehouse.unloadProduct();
        warehouse.unloadProduct();
        warehouse.unloadProduct(); // Пытаемся отгрузить, когда склад пуст
    }
}
//Описание задания.
//
// 1 уровень сложности: 1) Вы работаете на складе, который продает один вид продукции, не имеющий сроков хранения, например кирпич.
//У вас всего одни двери на складе, через которые вы загружаете новый товар и отгружаете заказчикам тоже через эту же дверь.
//Как бы вы построили рабочий процесс на Вашем складе, какую бы коллекцию использовали для имитации процесса работы?
//Напишите программу, которая бы имитировала работу.
//
//2)* Тот же склад, что и в случае п.1 но у Вас есть две двери - одна в начале склада, вторая в конце.
//Как бы вы построили оптимальный рабочий процесс на Вашем складе, какую бы коллекцию использовали для имитации процесса работы?
//
//Напишите программу, которая бы имитировала работу.
//
//
//3)** Автозаправка. По умолчанию автомобили заправляются согласно стандартной очереди FIFO. Но автомобили скорой помощи
//всегда заправляются вне очереди.
//В час пик, общественные автобусы получают максимальный приоритет по заправке, но скорая помощь все равно более приоритетна.
//Во время стихийных бедствий (снегопад, наводнение) технологический транспорт городских служб заправляется вне очереди.
//Какую бы коллекцию Вы использовали для реализацию данного алгоритма?
//
//Напишите программу, которая бы имитировала работу.
//
//
//2 уровень сложности: