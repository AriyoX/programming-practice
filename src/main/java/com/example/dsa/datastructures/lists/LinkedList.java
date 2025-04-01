package com.example.dsa.datastructures.lists;

public class LinkedList<T> {
    private Node<T> head;
    
    public LinkedList() {
        // Initialize an empty list
    }
    
    public void push(T data) {
        Node<T> newNode = new Node<>(data);
        newNode.next = head;
        head = newNode;
    }
    
    private static class Node<T> {
        T data;
        Node<T> next;
        
        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }
}
