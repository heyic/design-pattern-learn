package com.hyc.designparttern.creation.simple_factory_method;

public class TestCase {

    public static void main(String[] args) {
        try {
            Shapes circle = ShapesFactory.getShape("circle");
            circle.draw();
            circle.erase();
        } catch (UnSupportedShapeException e) {
            e.printStackTrace();
        }
    }

}
