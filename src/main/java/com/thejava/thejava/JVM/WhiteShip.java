package com.thejava.thejava.JVM;

public class WhiteShip {

    public void work(){

        //WhiteShip.class; // class가 로딩하면 클레스타입의 인스턴스가 생성
        WhiteShip whiteShip = new WhiteShip();
        whiteShip.getClass(); // 인스턴스가 있으면 인스턴스에 getclass로 접근 가능

        System.out.println(App.myName);
    }
}
