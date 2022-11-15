package com.thejava.thejava.JVM;

public class App {
    static String myName;

    static {
        myName = "Sangik";
    }

    private String foo = "bar";

    public static void main(String[] args) {
        Thread.currentThread(); // Java로 구현 된 것이 아닌, C나 C++로 구현된 것
        App app = new App();
        System.out.println(App.class.getClasses());
        //상속 받은 클레스 있는지 확인
        //class 로딩만 해도 객체 생성이 된다.

        //Class<App> => WhiteShip whiteShip = new WhiteShip();
        //        whiteShip.getClass(); 형성하면 Class 객체가 생성 된다. 로딩을 하고 나며 Heap 영역에


    }
}
