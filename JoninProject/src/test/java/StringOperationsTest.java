import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class StringOperationsTest {
    StringOperations stringOperations=new StringOperations();
    @BeforeClass
    public static void initialize(){
        System.out.println("Starting test ................."+System.currentTimeMillis());
    }

    @Before
    public void beforRunningTest(){
        System.out.println("Ma executat inainte de fiecare test");
    }

    @Test
    public void stringLengthTest(){
        System.out.println("Rulam testul pentru string length");
        String text="Alex";
        stringOperations.stringLength(text);
        int result=stringOperations.stringLength(text);

        assertEquals(result,4);
    }
    @Test
    public void stringCocantenationTest(){
        System.out.println("Rulam testul pentru concantenare");
        String text1 ="Ana";
        String text2="mere";
        String result=stringOperations.stringConcatenation(text1,text2);
        assertEquals(result,"Anamere");
    }
    @Test
    public void setStringContainsTest(){
        String text1="Toamna";
        String text2="am";
        boolean result=stringOperations.stringContains(text1,text1);
        assertTrue(result);
    }
    @After
    public  void afterRunningTest(){
        System.out.println("Ma executat dupa fiecare  test");
    }



}
