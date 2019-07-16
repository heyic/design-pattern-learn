package com.hyc.designparttern.behavioral.observer;

import java.util.Observable;

public class PersonA extends Person {
  
  
  @Override
  public void update(Observable o, Object arg) {
    hello(arg);
  }
  
}
