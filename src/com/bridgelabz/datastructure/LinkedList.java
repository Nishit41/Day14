package com.bridgelabz.datastructure;

public class LinkedList<T> {
    Node<T> head;
    Node<T> tail;



    public void push(T key) {
        {
            Node<T> newNode = new Node<>(key);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                newNode.next = head;
                head = newNode;
            }
        }
    }

    public void print()
        {
            Node<T> temp = head;
            while (temp != null) {
                System.out.print(temp.data + "->");
                temp = temp.next;
            }
        }
        void add(T data)
        {
            Node<T> node = new Node<>( data);
            if(head == null){
                head = node;
                tail = node;
            }
            else{
                tail.next = node;
                tail = node;
            }
        }

    void display() {
        Node<T> temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

    }
    public Node<T> search(T searchData) {
        Node<T> temp = head;
        while(temp != null){
            if(temp.data.equals(searchData))
                return temp;
            temp = temp.next;
        }
        return null;
    }

    public boolean insertAfter(T searchData, T insertData) {
        Node<T> newNode = new Node<>(insertData);
        Node<T> searchedNode = search(searchData);
        if (searchedNode != null) {
            newNode.next = searchedNode.next;
            searchedNode.next = newNode;
            return true;
        }
        return false;
    }

    public void insert(T data) {
        Node<T> node = new Node<>(data);
        head.next = node;
        node.next = tail;
    }
    public T pop() {
        T deletedElement = head.data;
        head = head.next;
        return deletedElement;
    }
    public T popLast() {
        T deletedElement = tail.data;
        Node<T> temp = head;
        while(temp.next != tail)
        {
            temp = temp.next;
        }
        temp.next = null;
        temp = tail;
        return  deletedElement;


    }
}






