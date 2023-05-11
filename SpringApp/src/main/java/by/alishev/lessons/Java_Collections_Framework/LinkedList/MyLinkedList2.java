package by.alishev.lessons.Java_Collections_Framework.LinkedList;

import java.util.Arrays;

public class MyLinkedList2 {
    private Node head;
    private int size;

    public void add(String value){
        if (head == null){
            this.head = new Node(value);
        }else {
            Node temp = head;
            while (temp.getNext()!=null){
                temp = temp.getNext();
            }
            temp.setNext(new Node(value));
        }
        size++;
    }

    public String get(int index){
        int currentIndex = 0;
        Node temp = head;
        while (temp != null){
            if (currentIndex == index){
                return temp.getValue();
            }else {
                temp = temp.getNext();
                currentIndex++;
            }
        }
        throw new IllegalArgumentException();
    }

    public void remove(int index){
       if (index == 0){
           head = head.getNext();
           size--;
           return;
       }
        int currentIndex = 0;
        Node temp = head;

        while (temp != null){
            if (currentIndex == index-1){
                temp.setNext(temp.getNext().getNext());
                size--;
                return;
            } else {
                temp = temp.getNext();
                currentIndex++;
            }
        }
    }


    @Override
    public String toString() {
        String[] result = new String[size];
        int idx = 0;
        Node temp = head;

        while (temp != null){
            result[idx++] =temp.getValue();
            temp = temp.getNext();
        }
        return Arrays.toString(result);
    }

    private static class Node {
        private String value;
        private Node next;

        public Node(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }

}
