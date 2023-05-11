package by.alishev.lessons.Java_Collections_Framework.LinkedList;

public class Test3 {
    public static void main(String[] args) {
        MyLinkedList2 linkedList2 = new MyLinkedList2();
        linkedList2.add("H");
        linkedList2.add("E");
        linkedList2.add("L");
        linkedList2.add("L");
        linkedList2.add("O");

        System.out.println(linkedList2);

        System.out.println(linkedList2.get(1));

        linkedList2.remove(1);
        System.out.println(linkedList2);

    }
}
