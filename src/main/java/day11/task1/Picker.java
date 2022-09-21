package day11.task1;

public class Picker extends Employee implements Worker {


    public Picker(Warehouse warehouse) {
        super(warehouse);
    }

    @Override
    public void doWork() {
        setSalary(getSalary() + 80);
        getWarehouse().setCountPickedOrders(getWarehouse().getCountPickedOrders() + 1);
    }

    @Override
    public void bonus() {
        if (getIsPayed() == true) {
            System.out.println("Бонус уже был выплачен");
            return;
        }
        if (getWarehouse().getCountPickedOrders() == 10_000) {
            setSalary(getSalary() + 70_000 );
            System.out.println("Бонус уже был выплачен");
            setPayed(true);
        } else if (getWarehouse().getCountPickedOrders() <= 9999) {
            System.out.println("Бонус пока не доступен");
        }
    }
}
