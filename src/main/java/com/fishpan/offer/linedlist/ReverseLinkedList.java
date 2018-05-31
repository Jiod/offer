package com.fishpan.offer.linedlist;

import com.fishpan.offer.linedlist.utils.LinkedListUtil;

/**
 * 对一个链表进行反转
 */
public class ReverseLinkedList {
    public static void main(String[] args) {
        ListNode pHead = LinkedListUtil.generatorList();
        reverseLinkedList2(pHead);
    }

    /**
     * 使用递归进行反转
     */
    private static ListNode mHead;
    private static ListNode reverseLinkedList1(ListNode pHead) {
        if (pHead != null) {
            ListNode next = reverseLinkedList1(pHead.getNext());
            // 如果next是空，说明是尾结点
            if(next == null) {
                mHead = pHead;
                return mHead;
            } else {
                next.setNext(pHead);
                pHead.setNext(null);
                return pHead;
            }
        } else {
            return null;
        }
    }

    /**
     * 常规使用一个循环实现链表反转
     * @param phead
     * @return
     */
    private static ListNode reverseLinkedList2(ListNode phead) {
        ListNode nHead = null;

        while (phead != null) {
            System.out.println(phead.getData());
            ListNode temp = phead.getNext();

            phead.setNext(nHead);
            nHead = phead;

            phead = temp;
        }

        return nHead;
    }
}
