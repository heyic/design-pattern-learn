package com.hyc.designparttern.creation.simple_factory_method;

public class Square extends Shapes{

    @Override
    public void draw() {
        System.out.println("绘制方形");
    }

    @Override
    public void erase() {
        System.out.println("擦除方形");
    }
}
