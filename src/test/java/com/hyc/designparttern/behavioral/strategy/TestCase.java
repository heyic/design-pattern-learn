package com.hyc.designparttern.behavioral.strategy;

import com.hyc.designparttern.StartUp;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author yche4
 * @Date 2019/5/13 19:13
 **/
@SpringBootTest(classes = StartUp.class)
@RunWith(SpringRunner.class)
@Configuration
public class TestCase {

  @Value("${behavioral.strategy.className}")
  private String concreteStrategyClassName;


  @Test
  public void runAlgorithm(){
    try {
      Context context = new Context();
      Class clazz = Class.forName(concreteStrategyClassName);
      Object o = clazz.newInstance();
      AbstractStrategy abstractStrategy = (AbstractStrategy) o;
      context.setAbstractStrategy(abstractStrategy);
      context.run();
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    } catch (IllegalAccessException e) {
      e.printStackTrace();
    } catch (InstantiationException e) {
      e.printStackTrace();
    }
  }

}
