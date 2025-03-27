package com.example.dsa.datastructures.queue;

import java.util.Queue;
import java.util.LinkedList;

public class QueueImplementation {
    // Queue<String> songs = new Queue<String>(); not allowed as Queue is an interface and cannot be instantiated directly
    Queue<String> songs = new LinkedList<String>();
    // enqueue: offer
    // dequeue: poll

    public QueueImplementation() {
        songs.offer("Song 1");
        songs.offer("Song 2");
        songs.offer("Song 3");
    }

    public Queue<String> getSongs() {
        return songs;
    }

    public void setSongs(Queue<String> songs) {
        this.songs = songs;
    }

    public void removeFirstSong() {
        songs.poll();
    }

    public String mentionAndRemoveFirstSong() {
        return songs.poll();
    }

    public String peekFirstSong() {
        return songs.peek();
    }

    public void addSong(String song) {
        songs.offer(song);
    }

    /*
     1. Keyboard buffer (FIFO)
     2. Print queue (printer queue)
     3. Breadth-first search (BFS) (graph traversal)
     4. Call center (call queue)
     */

}
