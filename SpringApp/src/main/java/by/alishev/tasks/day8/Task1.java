package by.alishev.tasks.day8;

public class Task1 {
    public static void main(String[] args) {
        String numbers = "";

        long before =System.currentTimeMillis();

        for (int i = 0; i <= 20000; i++) {
            numbers = numbers + i + " ";
        }
        long after = System.currentTimeMillis();
        System.out.println("Work time : " + (after-before));
        System.out.print(numbers);


        long before2 =System.currentTimeMillis();
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i <= 20000; i++) {
            sb.append(i).append(" ");
        }
        long after2 = System.currentTimeMillis();
        System.out.println("Work time2 : " + (after2-before2));
        System.out.println(sb);
    }
}
