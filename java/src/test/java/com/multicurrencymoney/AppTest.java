package test.java.com.multicurrencymoney;

import main.java.com.multicurrencymoney.Dollar;
import org.junit.Test;
import static org.junit.Assert.*;


public class AppTest {

    @Test
    public void testMultiplication(){
        Dollar five = new Dollar(5);
        five.times(2);
        assertEquals(10,five.amount);
    }
}
