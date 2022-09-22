package day11.task1;

public class Courier extends Employee implements Worker {

    private final int BONUS_SALARY = 50_000;
    private final int SALARY_RATE = 100;
    private final int SALARY_PAYMENT_INDICATOR = 10_000;
    private final int INDICATOR_NO_PAYMENT_SALARY = 9999;

    public Courier(Warehouse warehouse) {
        super(warehouse);
    }


    @Override
    public void doWork() {
        setSalary(getSalary() + SALARY_RATE);
        getWarehouse().setCountDeliveredOrders(getWarehouse().getCountDeliveredOrders() + 1);
    }

    @Override
    public void bonus() {
        if (getIsPayed() == true) {
            System.out.println("Бонус уже был выплачен");
            return;
        }
        if (getWarehouse().getCountDeliveredOrders() == SALARY_PAYMENT_INDICATOR) {
            setSalary(getSalary() + BONUS_SALARY );
            System.out.println("Бонус уже был выплачен");
            setPayed(true);
        } else if (getWarehouse().getCountDeliveredOrders() <= INDICATOR_NO_PAYMENT_SALARY) {
            System.out.println("Бонус пока не доступен");
        }
    }
}
