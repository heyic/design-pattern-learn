package com.hyc.designparttern.creation.simple_factory_method;

public class Circle extends Shapes{

    @Override
    public void draw() {
        System.out.println("绘制圆形");
    }

    @Override
    public void erase() {
        System.out.println("擦除圆形");
    }

}
