package com.example.dsa;

import com.example.dsa.datastructures.stacks.StackImplementation;

public class Main {
    public static void main(String[] args) {
        StackImplementation stackImplementation = new StackImplementation();
        System.out.println(stackImplementation.mentionAndRemoveGame());
        System.out.println(stackImplementation.peekGame());
        System.out.println(stackImplementation.getGames());
        System.out.println(stackImplementation.findGame("FIFA"));
    }
}