package lesson0.Test1;

import org.junit.Assert;
import org.junit.Test;

public class MainClassTest extends MainClass {
    @Test

    public void  testGetLocolNumber(){

        int a = getLocalNumber();
        if (a != 14)
        {
            Assert.fail("Ошибка, значение не равно 14");
        }
    }
    //
}


