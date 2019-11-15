package com.hyc.designparttern.creation.prototype.demo1;

public class Client {

    public static void main(String[] args) {
        ConcretePrototype concretePrototype = new ConcretePrototype();
        concretePrototype.setAttr("hyc");
        AbastractPrototype clone = concretePrototype.clone();
        System.out.println();
    }
}
