package com.fishpan.offer.linedlist;

import com.fishpan.offer.linedlist.utils.LinkedListUtil;

/**
 * 输入一个链表的头结点，从尾到头反过来打印出每个结点的值。
 */
public class PrintLinkedList {
    public static void main(String[] args) {
        ListNode pHeader = LinkedListUtil.generatorList();
        printListReverse(pHeader);
    }

    /**
     * 倒序打印链表
     * @param pHead 头指针
     */
    private static void printListReverse(ListNode pHead) {
        if (pHead != null) {
            printListReverse(pHead.getNext());
            System.out.println(pHead.getData());
        }
    }
}
