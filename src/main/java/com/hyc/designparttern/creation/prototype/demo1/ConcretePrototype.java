package com.hyc.designparttern.creation.prototype.demo1;

public class ConcretePrototype extends AbastractPrototype{

    private String attr;

    public String getAttr() {
        return attr;
    }

    public void setAttr(String attr) {
        this.attr = attr;
    }

    @Override
    public AbastractPrototype clone() {
        ConcretePrototype concretePrototype = new ConcretePrototype();
        concretePrototype.setAttr(attr);
        return concretePrototype;
    }
}
