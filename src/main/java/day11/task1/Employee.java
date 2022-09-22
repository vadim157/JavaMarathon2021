package day11.task1;

public abstract class Employee {
    private int salary;
    private boolean isPayed;
    private Warehouse warehouse;


    public Employee(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setPayed(boolean payed) {
        isPayed = payed;
    }

    public int getSalary() {
        return salary;
    }

    public boolean getIsPayed() {
        return isPayed;
    }

    public Warehouse getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(Warehouse warehouse) {
        this.warehouse = warehouse;
    }
}
