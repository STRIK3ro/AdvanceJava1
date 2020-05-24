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
        System.out.println("Rezultatul admiterii la poli este " + student.getAdmisPoli());
    //sa se creeze exeptia atunci cand notele sunt mai mari ce 10 dar si mai mici ca 1
    //sa se adauge urmatorul comportament prin intermediul unei interfete
    //sa se calculeze media doar la mate si fizica si sa se adauge un camp admis la facultatea de fizica
    //sa se calculeze media doar la mate si info si un camp admis la info
    //sa se adauge o exeptie atunci cand media este 10 cu mesaj
        try{
            if(student.getAdmisPoli()==false){
                student.computeAvrageFizica();

            }
        }catch (GradesOutOfReachExeption e){
            System.out.println("Din pacate a aparut eroarea : "+e.getMessage());
        }catch (BadGradesExeption e){
            System.out.println("Din pacate a aparut eroarea : "+e.getMessage());
        }
        System.out.println("Rezultatul admiterii la fizica este :" +student.getAdmisFizica());
        try{
            if(student.getAdmisFizica()==false){
                student.computeAvrageInfo();
            }
        }catch (GradesOutOfReachExeption e){
            System.out.println("Din pacate a aparut eroarea : "+e.getMessage());
        }catch (BadGradesExeption e){
            System.out.println("Din pacate a aparut eroarea :" +e.getMessage());
        }
        System.out.println("Rezultatul admiterii la mate info este : "+student.getAdmisMateInfo());
        if(student.getAdmisMateInfo()==false){
            System.out.println("Mai stai un an pe tusa somere");


        }
        //Cum comparam studentii ?
        //Dupa note
        //Creem doi studenti

        Student student_alex=new Student("Alex","Ion",8,7,9);
        Student student_liviu=new Student("Liviu","Preda",5,7,6);
        Student student_robert=new Student("Robert","Rotaru",10,10,10);

        int medieA=(student_alex.getMathGrade()+student_alex.getPhizGrade()+student_alex.getInfoGrade())/3;
        int medieL=(student_liviu.getMathGrade()+student_liviu.getPhizGrade()+student_liviu.getInfoGrade())/3;
        if(medieA>medieL){
            System.out.println("Media lui Alex este mai mare ca a lui Liviu");
        }else{
            System.out.println("Media lui Liviu este mai mare ca a lui Alex");
        }

            


        if(student_alex.getMedie()>student_liviu.getMedie()){
            System.out.println("Media lui Alex este mai mare ca a lui Liviu");
        }else{
            System.out.println("Media lui Liviu este mai mare ca a lui Alex");
        }




         int comparatie=student_alex.compareTo(student_liviu);
        if(comparatie>0){
            System.out.println("Media lui Alex este mai mare ca a lui Liviu");
        }else if (comparatie<0){
            System.out.println("Media lui Liviu este mai mare ca a lui Alex");
        }else{
            System.out.println("Cei doi au mediile egale");
        }






    }

}
