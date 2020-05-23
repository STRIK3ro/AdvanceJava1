import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorStiintificTest {
    CalculatorStiintific calculatorStiintific=new CalculatorStiintific();
    @Test
    public void ridicareLaPutereTest(){
        double a=5;
        double b=3;
        double result=calculatorStiintific.ridicareLaPutere(a,b);
        assertEquals(result,125.0,0.1);

    }
    @Test
    public void radicalDinNumarTest(){
        double a=625;
        double result=calculatorStiintific.radical(a);
        assertEquals(result,25.0,0.1);
    }

}
