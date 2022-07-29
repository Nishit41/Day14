package com.bridgelabz.stack;


import com.bridgelabz.datastructure.LinkedList;

    public class Stacks <T>{
        LinkedList<T> linkedList;
        public Stacks(){
            this.linkedList=new LinkedList<>();
        }

        void push(T data){
            linkedList.push(data);
        }

        void display(){
            linkedList.print();
        }

        void pop(){
            linkedList.pop();
        }

        public static void main(String[] args) {
            Stacks<Integer> stack = new Stacks<>();
            stack.push(70);
            stack.push(30);
            stack.push(56);
            stack.display();
        }
    }

