package com.hyc.designparttern.behavioral.observer;

import java.util.Observer;

public abstract class Person implements Observer {

  public void hello(Object obj){
    System.out.println("大家好，我的名字叫"+obj.toString());
  }
  
}
