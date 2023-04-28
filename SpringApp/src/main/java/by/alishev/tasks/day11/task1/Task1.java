package by.alishev.tasks.day11.task1;

public class Task1 {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse(0,0);
        Picker picker = new Picker(warehouse) ;
        Courier courier = new Courier(warehouse);
        System.out.println(picker);
        System.out.println(courier);
        picker.doWork();
        courier.doWork();

        System.out.println(warehouse);
        System.out.println(picker);
        System.out.println(courier);
        for (int i = 0; i <= 1500; i++) {
            picker.doWork();
            courier.doWork();
        }
        picker.bonus();
        courier.bonus();
        System.out.println(warehouse + ". Pickers salary : " + picker + ". Couriers salary : " + courier);

    }
}
