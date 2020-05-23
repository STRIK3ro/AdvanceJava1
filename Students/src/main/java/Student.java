public class Student extends Person implements Examinator {
    int infoGrade;
    int mathGrade;
    int phizGrade;
    boolean admisPoli;

    public Student(String nume, String prenume, int mathGrade, int infoGrade, int phizGrade) {
        this.nume = nume;
        this.prenume = prenume;
        this.mathGrade = mathGrade;
        this.infoGrade = infoGrade;
        this.phizGrade = phizGrade;

    }

    public void computeAvrage ()throws BadGradesExeption{
        int medie=(this.infoGrade+this.mathGrade+this.phizGrade)/3;
        if(medie<6){
            throw new BadGradesExeption("Studentul este repetent");
        }else if(medie<9&&medie>6){
            admisPoli=false;
        }else{
            admisPoli=true;
        }
    }
}
