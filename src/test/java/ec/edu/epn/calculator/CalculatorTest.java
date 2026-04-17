package ec.edu.epn.calculator;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
    @Test
    public void testSum() {
       Calculator calculator = new Calculator();
         int resultado = calculator.sum(2, 2);
         if(resultado!=4){
             Assert.fail();
         }
    }

}
