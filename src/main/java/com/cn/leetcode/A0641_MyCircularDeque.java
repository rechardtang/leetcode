package com.cn.leetcode;

/**
 * 641. 设计循环双端队列
 * 设计实现双端队列。
 * 你的实现需要支持以下操作：
 *
 * MyCircularDeque(k)：构造函数,双端队列的大小为k。
 * insertFront()：将一个元素添加到双端队列头部。 如果操作成功返回 true。
 * insertLast()：将一个元素添加到双端队列尾部。如果操作成功返回 true。
 * deleteFront()：从双端队列头部删除一个元素。 如果操作成功返回 true。
 * deleteLast()：从双端队列尾部删除一个元素。如果操作成功返回 true。
 * getFront()：从双端队列头部获得一个元素。如果双端队列为空，返回 -1。
 * getRear()：获得双端队列的最后一个元素。 如果双端队列为空，返回 -1。
 * isEmpty()：检查双端队列是否为空。
 * isFull()：检查双端队列是否满了。
 * 示例：
 *
 * MyCircularDeque circularDeque = new MycircularDeque(3); // 设置容量大小为3
 * circularDeque.insertLast(1);			        // 返回 true
 * circularDeque.insertLast(2);			        // 返回 true
 * circularDeque.insertFront(3);			        // 返回 true
 * circularDeque.insertFront(4);			        // 已经满了，返回 false
 * circularDeque.getRear();  				// 返回 2
 * circularDeque.isFull();				        // 返回 true
 * circularDeque.deleteLast();			        // 返回 true
 * circularDeque.insertFront(4);			        // 返回 true
 * circularDeque.getFront();				// 返回 4
 *
 *
 *
 * 提示：
 *
 * 所有值的范围为 [1, 1000]
 * 操作次数的范围为 [1, 1000]
 * 请不要使用内置的双端队列库。
 */
public class A0641_MyCircularDeque {

    private final Integer[] deque;
    private final int capacity;
    private int front;
    private int rear;
    private int size;

    /**
     * Initialize your data structure here. Set the size of the deque to be k.
     */
    public A0641_MyCircularDeque(int k) {
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

        A0641_MyCircularDeque deque = new A0641_MyCircularDeque(3);
        deque.insertFront(8);
        deque.insertLast(8);
        deque.insertLast(2);
        deque.deleteLast();
        deque.insertFront(9);
        deque.deleteFront();
        deque.insertLast(2);
    }
}
