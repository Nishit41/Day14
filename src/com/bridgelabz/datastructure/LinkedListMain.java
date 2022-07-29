package com.bridgelabz.datastructure;

public class LinkedListMain {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.push(70);
        linkedList.push(56);
        linkedList.insert(30);
        System.out.println(linkedList.pop());
        System.out.println(linkedList.popLast());
        linkedList.display();
        System.out.println();
        linkedList.display();

    }
}



