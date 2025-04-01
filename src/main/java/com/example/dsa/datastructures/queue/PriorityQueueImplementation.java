package com.example.dsa.datastructures.queue;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueImplementation {
    Queue<Double> gpa = new PriorityQueue<>();

    public PriorityQueueImplementation() {
        gpa.offer(3.5);
        gpa.offer(3.8);
        gpa.offer(3.2);
    }

    public void printQueue() {
        while (!gpa.isEmpty()) {
            System.out.println(gpa.poll());
        }
    }

    // linked lists have data and address of next node
    // inserting an element into a linked list involves inserting the node and changing its address to the of the next node and changing that of the previous node to the new node
    // removing an element from a linked list involves changing the address of the previous node to the next node 
}
