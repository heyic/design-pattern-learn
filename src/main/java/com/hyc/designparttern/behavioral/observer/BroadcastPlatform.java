package com.hyc.designparttern.behavioral.observer;

import java.util.Observable;

public class BroadcastPlatform extends Observable {
  
  public synchronized void setChanged() {
    super.setChanged();
  }
  
  @Override
  public void notifyObservers(Object arg) {

  }
  
  
}
