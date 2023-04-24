package by.alishev.tasks.day11.task1;

public class Courier implements IWorker{
    private int salary;
    private Warehouse warehouse;

    public Courier(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    @Override
    public void doWork() {
        salary += 80;
        warehouse.setBalance(warehouse.getBalance() + 1000);

    }

    @Override
    public void bonus() {
        if (warehouse.getBalance()>1_000_000){
            salary *= 2;
        }

    }

    @Override
    public String toString() {
        return "Courier{" +
                "salary=" + salary +
                '}';
    }
}
