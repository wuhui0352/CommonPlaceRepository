package com.pattern;

public class HungryHanstyle {
    //饿汉式
    private static HungryHanstyle hungryHanstyle = new HungryHanstyle();

    private HungryHanstyle(){
        System.out.println("===========我是单例模式饿汉式模式========");
    }

    public static HungryHanstyle getInstance(){
        return hungryHanstyle;
    }

    public static void main(String[] args) {
        HungryHanstyle hungryHanstyle = HungryHanstyle.getInstance();
        HungryHanstyle hungryHanstyle1 = HungryHanstyle.getInstance();
        System.out.println(hungryHanstyle == hungryHanstyle1);
    }

}
