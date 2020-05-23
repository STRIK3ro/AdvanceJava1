import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x = 13;
        int y = 0;
        try {
            System.out.println("Impartirea este : " + (x / y));
        } catch (ArithmeticException e) {
            System.out.println("Incercati o operatie aritmetica imposibila " + e.getMessage());
        }

        int[] array = {1, 2, 3, 4, 5};
        try {
            System.out.println("Numarul de pe pozitia 3 este : " + array[3]);

            System.out.println("Valoarea de pe pozitia 16 este : " + array[16]);
            System.out.println("Afisam x/y dinou : "+(13/0));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("A aparut eroarea : " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Array este mai mic de cat valoarea introdusa : " + e.getMessage());
        }



        String text="A";
        if(text==null){
            throw new NullPointerException("Ai uitat sa instantiezi textul ");
        }
        try {
            System.out.println("Lungimea textului este : " + text.length());
        }catch (NullPointerException e){
            System.out.println("Boss nu ai scris nimic " +e.getMessage());
        }catch (Exception e){
            System.out.println("Ceva nu merge bine "+e.getMessage());
        }
        String text1="Textul are 10 caractere daca vrea el !";
        System.out.println("Caracterul de pa pozitia 8 este : "+returneazaCaracter(text1));
        String text2="Tratam";
        try {
            System.out.println("Caracterul de la pozitia 8 este : " + returneazaCaracter(text2));
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("Stringul este mai mic de cat pozitia cautata : "+e.getMessage());
        }
        try{
            numar();
        }catch (OddNumberExeption e){
            System.out.println("Aveti grija ce numar introduceti : "+e.getMessage());
        }

        //puenm utilizatorul sa introduca un cuvant
        //daca cuvantul incepe cu o vocala , aruncam exeptia si o prindem vowelExeption
        //daca incepe cu o conasoana masaj totul ok boss
        try{
            cuvant();
        }catch (VowelExeption e){
            System.out.println("Aveti grija a parut eroarea : "+e.getMessage());
        }

    }
    public static char returneazaCaracter(String text)throws StringIndexOutOfBoundsException{

        return text.charAt(8);
    }
    public static void numar() throws OddNumberExeption{
        System.out.println("Introduceti un numar");
        Scanner scan=new Scanner(System.in);

        int numar=scan.nextInt();
        if(numar%2==0){
            System.out.println("Ati ales un numar par :");
        }else{
            throw new OddNumberExeption("Ati ales un numar impar");
        }
    }
    public static void cuvant()throws VowelExeption{
        System.out.println("Introduceti un cunvat");
        Scanner scanner=new Scanner(System.in);
        String cuvant=scanner.nextLine();
        System.out.println("Ati introdus cuvantul : "+cuvant);
        if (cuvant.startsWith("A")||cuvant.startsWith("E")||cuvant.startsWith("I")||cuvant.startsWith("U")||cuvant.startsWith("O")){
            throw new VowelExeption("Cuvantul incepe cu o vocala");
        }else{
            System.out.println("Totul e ok BOSS !!!");
        }
    }
}
