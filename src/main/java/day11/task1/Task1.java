package day11.task1;

public class Task1 {
    public static void main(String[] args) {

        Warehouse warehouse = new Warehouse();
        Courier сourier = new Courier(warehouse);
        Picker picker = new Picker(warehouse);

        Task1.businessProcess(сourier);
        Task1.businessProcess(picker);
        System.out.println("Первый склад: Количество доставок " + warehouse.getCountDeliveredOrders());
        System.out.println("Первый склад: Количество сборок " + warehouse.getCountPickedOrders());
        System.out.println("Зарплата курьера " + сourier.getSalary());
        System.out.println("Зарплата сборщика " + picker.getSalary());
        System.out.println("--------------------------------------------------------------------------");
        Warehouse warehouse2 = new Warehouse();
        Courier сourier2 = new Courier(warehouse2);
        Picker picker2 = new Picker(warehouse2);
        Task1.businessProcess(сourier2);
        Task1.businessProcess(picker2);
        System.out.println("Второй склад: Количество доставок " + warehouse.getCountDeliveredOrders());
        System.out.println("Второй склад: Количество сборок " + warehouse.getCountPickedOrders());
        System.out.println("Зарплата курьера " + сourier2.getSalary());
        System.out.println("Зарплата сборщика " + picker2.getSalary());
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("Первый склад: Количество доставок " + warehouse.getCountDeliveredOrders());
        System.out.println("Первый склад: Количество сборок " + warehouse.getCountPickedOrders());
        System.out.println("Зарплата курьера " + сourier.getSalary());
        System.out.println("Зарплата сборщика " + picker.getSalary());

    }

    static void businessProcess(Worker worker) {
        for (int i = 0; i < 10000; i++) {
            worker.doWork();
        }
        worker.bonus();
    }
}
