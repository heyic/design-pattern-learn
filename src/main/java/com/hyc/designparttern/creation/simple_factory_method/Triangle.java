package com.hyc.designparttern.creation.simple_factory_method;

public class Triangle extends Shapes{
    @Override
    public void draw() {
        System.out.println("绘制三角形");
    }

    @Override
    public void erase() {
        System.out.println("擦除三角形");
    }
}
