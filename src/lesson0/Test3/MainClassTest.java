package lesson0.Test3;

import com.sun.tools.javac.util.FatalError;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class MainClassTest extends MainClass {
    @Test
public  void testgetClassString ()
    {
        String isHello = getClassString();
        try{
            if (isHello.contains("hello") || isHello.contains("Hello")){
            System.out.println("Фраза содержит Hello или hello");
        } else
            System.out.println("Фраза не содержит Hello или hello");
        }
        catch (NullPointerException e) {
            System.out.println("падение");
        }
    }

}
