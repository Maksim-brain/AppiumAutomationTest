package lesson0.Test2;

import org.junit.Test;

public class MainClassTest extends MainClass {
    @Test

    public void testGetClassNumber(){
        int number = this.getClassNumber();

      if (number > 45) {
          System.out.println ("Число больше 45");
      }
      else
          System.out.println ("Число меньше или равно 45");

  }
    }



