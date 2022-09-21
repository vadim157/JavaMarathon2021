package day11.task1;

public class Courier extends Employee implements Worker {

    public Courier(Warehouse warehouse) {
        super(warehouse);
    }


    @Override
    public void doWork() {
        setSalary(getSalary() + 100);
        getWarehouse().setCountDeliveredOrders(getWarehouse().getCountDeliveredOrders() + 1);
    }

    @Override
    public void bonus() {
        if (getIsPayed() == true) {
            System.out.println("Бонус уже был выплачен");
            return;
        }
        if (getWarehouse().getCountDeliveredOrders() == 10_000) {
            setSalary(getSalary() + 50_000 );
            System.out.println("Бонус уже был выплачен");
            setPayed(true);
        } else if (getWarehouse().getCountDeliveredOrders() <= 9999) {
            System.out.println("Бонус пока не доступен");
        }
    }
}
