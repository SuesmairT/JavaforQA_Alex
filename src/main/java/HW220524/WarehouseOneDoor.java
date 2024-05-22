package HW220524;

import java.util.LinkedList;
import java.util.Queue;

public class WarehouseOneDoor {
    private Queue<String> warehouse = new LinkedList<>();

    // Метод для загрузки продукции
    public void loadProduct(String product) {
        warehouse.add(product);
        System.out.println("Loaded product: " + product);
    }

    // Метод для отгрузки продукции
    public void unloadProduct() {
        if (!warehouse.isEmpty()) {
            String product = warehouse.poll();
            System.out.println("Unloaded product: " + product);
        } else {
            System.out.println("No products to unload.");
        }
    }

    public static void main(String[] args) {
        WarehouseOneDoor warehouse = new WarehouseOneDoor();

        warehouse.loadProduct("Brick1");
        warehouse.loadProduct("Brick2");
        warehouse.loadProduct("Brick3");

        warehouse.unloadProduct();
        warehouse.unloadProduct();
        warehouse.unloadProduct();
        warehouse.unloadProduct(); // Пытаемся отгрузить, когда склад пуст
    }
}
