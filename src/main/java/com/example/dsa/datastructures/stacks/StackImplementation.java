package com.example.dsa.datastructures.stacks;

import java.util.Stack;

public class StackImplementation {
    Stack<String> games = new Stack<String>();

    public StackImplementation() {
        games.push("Minecraft");
        games.push("Among Us");
        games.push("Valorant");
    }

    public Stack<String> getGames() {
        return games;
    }

    public void setGames(Stack<String> games) {
        this.games = games;
    }

    public void removeGame() {
        games.pop();
    }

    public String mentionAndRemoveGame() {
        return games.pop();
    }

    public String peekGame() {
        return games.peek();
    }

    public int findGame(String game) {
        return games.search(game);
    }

    /*   
     1. implement undo/redo functionality using two stacks (text editor)
     2. implement back/forward functionality using two stacks (browser history)
     3. backtracking algorithm
     4. calling functions (call stack)
       */
}
