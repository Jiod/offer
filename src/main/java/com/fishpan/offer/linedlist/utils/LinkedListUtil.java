package com.fishpan.offer.linedlist.utils;

import com.fishpan.offer.linedlist.ListNode;

import java.util.ArrayList;
import java.util.List;

public class LinkedListUtil {
    public static ListNode generatorList() {
        List<String> datas = new ArrayList<>();
        datas.add("1");
        datas.add("2");
        datas.add("3");
        datas.add("4");
        datas.add("5");
        datas.add("6");
        datas.add("7");

        ListNode pHead = null;
        ListNode pTail = null;
        for (int i = 0, N = datas.size(); i < N; i ++) {
            if (pHead == null) {
                pHead = new ListNode(datas.get(i));
                pTail = pHead;
            } else {
                pTail.setNext(new ListNode(datas.get(i)));
                pTail = pTail.getNext();
            }
        }
        return pHead;
    }
}
