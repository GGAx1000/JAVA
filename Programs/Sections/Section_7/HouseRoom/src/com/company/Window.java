package com.company;

public class Window {
    private int locks;
    boolean curtain;

    public Window(int locks, boolean curtain) {
        this.locks = locks;
        this.curtain = curtain;
    }

    public Window(int locks) {
        this.locks = locks;
    }

    public void openWindow(){
        System.out.println("You opened your room's window, you can feel the wind already!!!");
    }
    public void closeWindow(){
        System.out.println("You closed your room's window, you started to feel the warmth!!!");
    }
}
