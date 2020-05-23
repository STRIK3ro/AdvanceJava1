import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArrayOperationsTest {
    ArrayOperations arrayOperations=new ArrayOperations();
    @Test
    public void lungimeaArrayTest(){
        System.out.println("Test lungime array");
        int[]numereIntregi={2,4,6,12,15};
        int result=arrayOperations.lungimeaArray(numereIntregi);
        assertEquals(result,5);
    }
    @Test
    public void numereMaiMariTest(){
        System.out.println("Test numere mai mari cu 5 ");
        int[] numere={1,3,4,7,10,14};
        int result=arrayOperations.numereMaiMari(numere);
        assertEquals(result,3);
    }
}
