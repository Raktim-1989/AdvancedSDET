package com.qa.SDET;

import javax.management.MBeanAttributeInfo;

public class SDET6 {
    Node head;
    class Node
    {
          int data;
          Node next;
          Node(int data)
          {
              this.data = data;
              next = null;
          }
    }
    public void printNodedata()
    {
        Node n = head;
        while(n!= null)
        {
            System.out.println(n.data
            );
            n = n.next;
        }

    }

    public static void main(String[] args) {
        SDET6 obj = new SDET6();
        Node first = obj.new Node(10);
        obj.head = first;

        Node second = obj.new Node(20);
        first.next = second;

        Node third = obj.new Node(30);
        second.next = third;

        obj.printNodedata();

    }
}
