package com.hyc.designparttern.behavioral.observer;

import com.hyc.designparttern.StartUp;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = StartUp.class)
public class TestCase {

  @Test
  public void test(){
    BroadcastPlatform broadcastPlatform = new BroadcastPlatform();
    PersonA personA = new PersonA();
    PersonB personB = new PersonB();
    PersonC personC = new PersonC();
    PersonD personD = new PersonD();
    broadcastPlatform.addObserver(personA);
    broadcastPlatform.addObserver(personB);
    broadcastPlatform.addObserver(personC);
    broadcastPlatform.addObserver(personD);
    broadcastPlatform.setChanged();
    broadcastPlatform.notifyObservers("hyc");
  }

}
