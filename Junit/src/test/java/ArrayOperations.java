public class ArrayOperations {
    public int lungimeaArray(int[] numereIntregi){
        return numereIntregi.length;
    }
    public int numereMaiMari(int[]numere){
        int numarNumber=0;
        for(int cursor=0;cursor<numere.length;cursor++){
            if(numere[cursor]>5){
                numarNumber++;
            }
        }
        return numarNumber;
    }
}
