package com.fishpan.offer.stack;

import java.util.Stack;

/**
 * 两个栈实现一个队列
 */
public class Queue {
    private static Stack<String> sInStack = new Stack<>();
    private static Stack<String> sOutStack = new Stack<>();

    public static void main(String[] args) {
        inQueue("1");
        inQueue("2");
        inQueue("3");

        System.out.println(outQueue());
        System.out.println(outQueue());
        System.out.println(outQueue());
    }

    private static void inQueue(String element) {
        sInStack.push(element);
    }

    private static String outQueue() {
        if(sOutStack.empty()) {
            while (!sInStack.empty()) {
                sOutStack.push(sInStack.pop());
            }
        }

        if(sOutStack.empty()) {
            return null;
        } else {
            return sOutStack.pop();
        }
    }
}
