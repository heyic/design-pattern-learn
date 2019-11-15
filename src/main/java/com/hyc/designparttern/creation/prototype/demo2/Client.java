package com.hyc.designparttern.creation.prototype.demo2;

public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {
        ConcretePrototype concretePrototype = new ConcretePrototype();
        concretePrototype.setAttr("hyc");
        ConcretePrototype copy = concretePrototype.clone();
        copy.setAttr("hyc1");
        System.out.println(copy.getAttr() == concretePrototype.getAttr());
    }

}
