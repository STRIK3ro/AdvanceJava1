import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws BadGradesExeption {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Va rugam sa introduceti numele si prenumle studentului");
        String nume = scanner.nextLine();
        String prenume = scanner.nextLine();
        System.out.println("Numele studentului vostru este " + nume + " " + prenume);
        System.out.println("Va rugam sa introduceti notele studentului : ");
        System.out.println("Nota la matematica : ");
        int mate = scanner.nextInt();
        System.out.println("Notal a la fizica : ");
        int fizica = scanner.nextInt();
        System.out.println("Notla la informatica : ");
        int info = scanner.nextInt();
        System.out.println("Notele studentului sunt : la mate " + mate + " la fizica " + fizica + " si la informatica " + info);
        Student student = new Student(nume, prenume, mate, info, fizica);
        try {
            student.computeAvragePoli();
        } catch (GradesOutOfReachExeption e) {
            System.out.println("Din pacate a aparut eroarea : "+e.getMessage());
        }catch (BadGradesExeption e){
            System.out.println("Din pacate a aparut eroare : "+e.getMessage());
        }
        System.out.println("Rezultatul admiterii la poli este " + student.admisPoli);
    //sa se creeze exeptia atunci cand notele sunt mai mari ce 10 dar si mai mici ca 1
    //sa se adauge urmatorul comportament prin intermediul unei interfete
    //sa se calculeze media doar la mate si fizica si sa se adauge un camp admis la facultatea de fizica
    //sa se calculeze media doar la mate si info si un camp admis la info
    //sa se adauge o exeptie atunci cand media este 10 cu mesaj
        try{
            if(student.admisPoli==false){
                student.computeAvrageFizica();

            }
        }catch (GradesOutOfReachExeption e){
            System.out.println("Din pacate a aparut eroarea : "+e.getMessage());
        }catch (BadGradesExeption e){
            System.out.println("Din pacate a aparut eroarea : "+e.getMessage());
        }
        System.out.println("Rezultatul admiterii la fizica este :" +student.admisFizica);
        try{
            if(student.admisFizica==false){
                student.computeAvrageInfo();
            }
        }catch (GradesOutOfReachExeption e){
            System.out.println("Din pacate a aparut eroarea : "+e.getMessage());
        }catch (BadGradesExeption e){
            System.out.println("Din pacate a aparut eroarea :" +e.getMessage());
        }
        System.out.println("Rezultatul admiterii la mate info este : "+student.admisMateInfo);
        if(student.admisMateInfo==false){
            System.out.println("Mai stai un an pe tusa somere");
        }
    }
}
