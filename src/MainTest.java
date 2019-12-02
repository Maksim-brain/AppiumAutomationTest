import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest extends MainClass {
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


