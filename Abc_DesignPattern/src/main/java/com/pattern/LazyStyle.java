package com.pattern;

public class LazyStyle {

//懒汉式
private volatile static  LazyStyle instance =  null; //添加volatile的目的是处理 ①


private LazyStyle(){

}

    public static LazyStyle getInstance(){

        if(null == instance){
            synchronized (LazyStyle.class){//当多个线程访问时，导致出现多个对象，从而添加锁
                if(null == instance){
                    instance = new LazyStyle(); //①   当两个线程同时进入到当前代码时，造成的原因是因为类加载过程的步骤
                    /*1、加载二进制数据到内存中，生成对应的Class数据结构
                    2、连接：a、验证，b、准备（给静态的成员变量赋默认值）c、解析
                    3、初始化：给类的静态变量赋初值*/
                }
            }
        }
    return instance;
    }


    public static void main(String[] args) {
        LazyStyle instance = LazyStyle.getInstance();
        LazyStyle instance2 = LazyStyle.getInstance();
        System.out.println(instance == instance2);
    }
}
