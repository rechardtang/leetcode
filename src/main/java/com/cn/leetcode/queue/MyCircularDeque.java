package com.cn.leetcode.queue;

public class MyCircularDeque {

    private final Integer[] deque;
    private final int capacity;
    private int front;
    private int rear;
    private int size;

    /**
     * Initialize your data structure here. Set the size of the deque to be k.
     */
    public MyCircularDeque(int k) {
        this.capacity = k;
        deque = new Integer[k];
    }

    /**
     * Adds an item at the front of Deque. Return true if the operation is successful.
     */
    public boolean insertFront(int value) {
        if (isFull()) {
            return false;
        }
        if (isEmpty()) {
            deque[front] = value;
        }else{
            int next = front + 1 > capacity - 1 ? 0 : front + 1;
            deque[next] = value;
            front = next;
        }
        size++;
        return true;
    }

    /**
     * Adds an item at the rear of Deque. Return true if the operation is successful.
     */
    public boolean insertLast(int value) {
        if (isFull()) {
            return false;
        }
        if (isEmpty()) {
            deque[rear] = value;
        }else {
            int next = rear - 1 < 0 ? capacity - 1 : rear - 1;
            deque[next] = value;
            rear = next;
        }
        size++;
        return true;
    }

    /**
     * Deletes an item from the front of Deque. Return true if the operation is successful.
     */
    public boolean deleteFront() {
        if (isEmpty()) {
            return false;
        }
        front = front - 1 < 0 ? capacity - 1 : front - 1;
        size--;
        return true;
    }

    /**
     * Deletes an item from the rear of Deque. Return true if the operation is successful.
     */
    public boolean deleteLast() {
        if (isEmpty()) {
            return false;
        }
        if (rear > front) {
            rear = rear + 1 > capacity - 1 ? 0 : rear + 1;
        } else if (rear < front) {
            rear = rear - 1 < 0 ? capacity - 1 : rear - 1;
        } else {
            deque[rear] = null;
        }
        size--;
        return true;
    }

    /**
     * Get the front item from the deque.
     */
    public int getFront() {
        if (isEmpty()) return -1;
        return deque[front];
    }

    /**
     * Get the last item from the deque.
     */
    public int getRear() {
        if (isEmpty()) return -1;
        return deque[rear];
    }

    /**
     * Checks whether the circular deque is empty or not.
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * Checks whether the circular deque is full or not.
     */
    public boolean isFull() {
        return size == capacity;
    }

    public static void main(String[] args) {

        MyCircularDeque deque = new MyCircularDeque(3);
        deque.insertFront(8);
        deque.insertLast(8);
        deque.insertLast(2);
        deque.deleteLast();
        deque.insertFront(9);
        deque.deleteFront();
        deque.insertLast(2);
    }
}
