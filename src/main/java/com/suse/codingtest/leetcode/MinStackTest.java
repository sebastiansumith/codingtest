package com.suse.codingtest.leetcode;

/**
 * Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
 *
 * push(x) -- Push element x onto stack.
 * pop() -- Removes the element on top of the stack.
 * top() -- Get the top element.
 * getMin() -- Retrieve the minimum element in the stack.
 *
 *
 * Example:
 *
 * MinStack minStack = new MinStack();
 * minStack.push(-2);
 * minStack.push(0);
 * minStack.push(-3);
 * minStack.getMin();   --> Returns -3.
 * minStack.pop();
 * minStack.top();      --> Returns 0.
 * minStack.getMin();   --> Returns -2.
 */
public class MinStackTest {

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println(minStack.getMin());
        minStack.pop();
        System.out.println(minStack.top());
        System.out.println(minStack.getMin());
    }
}

class MinStack {

    private Node<Integer> top;

    public MinStack() {
        top = null;
    }

    public void push(int x) {
        top = new Node(x, top);
    }

    public void pop() {
       top = top.next;
    }

    public int top() {
        return top.current;
    }

    public int getMin() {
        int temp = top.current;
        for(Node<Integer> n = top; n.next!= null; n = n.next){
            if(temp >  n.next.current){
                temp = n.next.current;
            }
        }
       return temp;
    }

    private class Node<E> {
        private Node<E> next;
        private E current;

        Node(E current, Node<E> next ){
         this.next = next;
         this.current = current;
        }
    }
}
