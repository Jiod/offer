package com.fishpan.offer.singleton;

/**
 * 题目二：设计一个类，我们只能生成该类的一个实例，就是单例嘛！
 */
public class Singleton {
    private Singleton () {

    }

    public static Singleton getInstance() {
        return InnerHolder.sInstance;
    }

    private static class InnerHolder {
        private static final Singleton sInstance = new Singleton();
    }
}
