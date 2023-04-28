package by.alishev.tasks.day11.task1;

public class Picker implements IWorker {
    private int salary;
    public Warehouse warehouse;

    public Picker(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    @Override
    public void doWork() {
        salary += 80;
        warehouse.setCountOrder(warehouse.getCountOrder() + 1);
    }

    @Override
    public void bonus() {
        if (warehouse.getCountOrder() > 1500) {
            salary*=3;

        }

    }

    @Override
    public String toString() {
        return "salary=" + salary;
    }
}
