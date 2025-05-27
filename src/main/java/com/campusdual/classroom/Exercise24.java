package com.campusdual.classroom;

import java.util.LinkedList;
import java.util.Queue;

public class Exercise24 {
    public static Queue<String> createQueue() {
        Queue<String> colaQueue = new LinkedList<>();
        colaQueue.offer("Smith");
        colaQueue.offer("Montessori");
        colaQueue.offer("Peralta");
        colaQueue.offer("House");

        return colaQueue;
    }
    public static void printAndEmptyQueue(Queue<String> queue) {
        for (String item : queue) {
            System.out.println(item);
        }

        queue.poll();
        queue.poll();
        queue.poll();
        queue.poll();
    }

    public static void main(String[] args) {
        Queue<String> newQueue = createQueue();
        printAndEmptyQueue(newQueue);
        System.out.println("==================");
        printAndEmptyQueue(newQueue);
    }
}
