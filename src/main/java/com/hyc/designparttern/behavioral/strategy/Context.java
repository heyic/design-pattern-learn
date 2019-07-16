package com.hyc.designparttern.behavioral.strategy;

/**
 * @Author yche4
 * @Date 2019/5/13 19:10
 **/
public class Context {

  private AbstractStrategy abstractStrategy;

  public void setAbstractStrategy(AbstractStrategy abstractStrategy) {
    this.abstractStrategy = abstractStrategy;
  }

  public void run(){
    abstractStrategy.algorithm();
  }

}
