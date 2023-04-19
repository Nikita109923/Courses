package by.alishev.lessons;

public class Arrays_of_Strings {
    public static void main(String[] args) {
        int [] array = new int[5];
        array[0] = 10;
        String [] strings = new String[3];
        strings [0] = "Hello";
        strings [1] = "Java";
        strings [2] = "!";

        for (String string : strings) {
            System.out.println(string);
        }
        int [] numbers = {1,2,3};
        int sum = 0;
        for (int x : numbers) {
            sum+=x;
        }
        System.out.println(sum);
        int value = 0;
        String s;
    }
}
