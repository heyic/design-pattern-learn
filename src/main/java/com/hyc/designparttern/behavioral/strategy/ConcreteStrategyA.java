package com.hyc.designparttern.behavioral.strategy;

/**
 * @Author yche4
 * @Date 2019/5/13 19:09
 **/
public class ConcreteStrategyA extends AbstractStrategy{

  //算法具体的实现
  @Override
  public void algorithm() {
      System.out.println("运行算法A");
  }


}
