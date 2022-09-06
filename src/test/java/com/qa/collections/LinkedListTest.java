package com.qa.collections;

import java.util.LinkedList;

public class LinkedListTest {

    Node head;

    class Node
    {
        int data;
        Node next;

        Node(int data)
        {
                this.data = data;
                this.next = null;
        }


    }

    public void printLL()
    {
        Node n = head;
        while(n != null)
        {
            System.out.println(n.data);
            n = n.next;
        }
    }

    public static void main(String[] args) {

        LinkedListTest l1 = new LinkedListTest();
       Node first =  l1.new Node(10);
       l1.head = first;
       LinkedList<Object> obj = new LinkedList<Object>();



        Node second =  l1.new Node(20);
        first.next = second;

        Node third =  l1.new Node(20);
        second.next = third;

        l1.printLL();

    }

}
