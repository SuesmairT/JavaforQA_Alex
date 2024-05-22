package HW220524;

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
