package day11.task1;

public class Picker extends Employee implements Worker {

    private final int BONUS_SALARY = 70_000;
    private final int SALARY_RATE = 80;
    private final int SALARY_PAYMENT_INDICATOR = 10_000;
    private final int INDICATOR_NO_PAYMENT_SALARY = 9999;


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
        if (getWarehouse().getCountPickedOrders() == SALARY_PAYMENT_INDICATOR) {
            setSalary(getSalary() + BONUS_SALARY );
            System.out.println("Бонус уже был выплачен");
            setPayed(true);
        } else if (getWarehouse().getCountPickedOrders() <= INDICATOR_NO_PAYMENT_SALARY) {
            System.out.println("Бонус пока не доступен");
        }
    }
}
