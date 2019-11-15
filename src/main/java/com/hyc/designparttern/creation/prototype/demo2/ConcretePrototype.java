package com.hyc.designparttern.creation.prototype.demo2;

public class ConcretePrototype implements Cloneable{

    private String attr;

    public String getAttr() {
        return attr;
    }

    public void setAttr(String attr) {
        this.attr = attr;
    }

    @Override
    protected ConcretePrototype clone() throws CloneNotSupportedException {
        Object clone = super.clone();
        return (ConcretePrototype) clone;
    }

}
