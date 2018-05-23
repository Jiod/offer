package com.fishpan.offer.arrays;

import com.sun.javafx.binding.StringFormatter;

/**
 * 题目-：请实现一个函数，把字符串的每个空格替换成"%20"，例如输入"We are happy",则输出"We%20are%20happy"
 */
public class ReplaceWhiteSpace {
    public static void main(String[] args) {
        log(replaceWhiteSpace("We are happy", "%20"));
    }

    private static String replaceWhiteSpace(String value, String replacement) {

        // 对特殊情况做判断，只有在输入的value值不为空的时候再进行处理
        if (null != value && !"".equals(value)) {
            char[] values = value.toCharArray();

            // 先遍历一下需要替换几个字符
            int replaceCharCount = 0;
            char whiteSpace = ' ';

            // 统计要替换的字符数
            for (int i = 0; i < values.length; i++) {
                if (whiteSpace == values[i]) {
                    replaceCharCount ++;
                }
            }

            log(StringFormatter.format("总共有%d个空格", replaceCharCount).getValue());

            // 创建新的字符数组，长度=原来的长度 + (要替换的字符数 - 1) * 替换字符串长度，这里1是指一个空格
            char[] newValues = new char[values.length + (replacement.length() - 1) * replaceCharCount];

            log(StringFormatter.format("新字符串长度%d", newValues.length).getValue());

            int nTail = newValues.length - 1;
            int oTail = values.length - 1;

            // 把目标字符串转为数组，方便后面的替换
            char[] replaceChars = replacement.toCharArray();
            // 倒序遍历，替换对应的字符，遇到空格就往新数字里面填充要替换的字符
            for (; oTail >= 0; oTail--) {
                // 如果是空白字符，新字符填充新的字符
                if (values[oTail] == whiteSpace) {
                    // 倒序遍历要替换的char数组
                    for (int i = replaceChars.length - 1; i >= 0 ; i --) {
                        newValues[nTail] = replaceChars[i];
                        nTail --;
                    }
                } else {
                    // 如果不空格就直接复制字符
                    newValues[nTail] = values[oTail];
                    nTail --;
                }
            }
            return new String(newValues);
        } else {
            return value;
        }
    }

    private static void log(String message) {
        System.out.println(message);
    }
}
