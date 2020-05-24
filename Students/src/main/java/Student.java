import java.io.Serializable;

public class Student extends Person implements Examinator, ExaminatorInfo, ExaminatorFizica,Comparable<Student>, Serializable {
    private int infoGrade;
    private int mathGrade;
    private int phizGrade;
    private boolean admisPoli;
    private boolean admisFizica;
    private boolean admisMateInfo;
    private int medie;


    public Student(String nume, String prenume, int mathGrade, int infoGrade, int phizGrade) {
        this.nume = nume;
        this.prenume = prenume;
        this.mathGrade = mathGrade;
        this.infoGrade = infoGrade;
        this.phizGrade = phizGrade;

    }

    public void computeAvragePoli() throws BadGradesExeption, GradesOutOfReachExeption {
        int medie = (this.infoGrade + this.mathGrade + this.phizGrade) / 3;
        int medieF = (this.phizGrade + this.mathGrade) / 2;
        if (this.infoGrade <= 1 || this.infoGrade > 10 || this.mathGrade <= 1 || this.mathGrade > 10 || this.phizGrade <= 1 || this.phizGrade > 10) {
            throw new GradesOutOfReachExeption("Boss nu poti sa ii dai studentului note mai mari de 10 sau mai mici ca 1 ");
        } else if (medie < 5) {
            throw new BadGradesExeption("Studentul este repetent");
        } else if (medie < 9 && medie > 5) {
            admisPoli = false;
        } else {
            admisPoli = true;
        }
    }


    @Override
    public void computeAvrageFizica() throws BadGradesExeption, GradesOutOfReachExeption {
        int medie = (this.phizGrade + this.mathGrade) / 2;
        if (this.infoGrade <= 1 || this.infoGrade > 10 || this.mathGrade <= 1 || this.mathGrade > 10 || this.phizGrade <= 1 || this.phizGrade > 10) {
            throw new GradesOutOfReachExeption("Boss nu poti sa ii dai studentului note mai mari de 10 sau mai mici ca 1 ");
        } else if (medie < 5) {
            throw new BadGradesExeption("Studentul este repetent");
        } else if (medie < 8 && medie > 5) {
            admisFizica = false;
        } else {
            admisFizica = true;
        }

    }

    @Override
    public void computeAvrageInfo() throws BadGradesExeption, GradesOutOfReachExeption {
        int medie = (this.infoGrade + this.mathGrade) / 2;
        if (this.infoGrade <= 1 || this.infoGrade > 10 || this.mathGrade <= 1 || this.mathGrade > 10 || this.phizGrade <= 1 || this.phizGrade > 10) {
            throw new GradesOutOfReachExeption("Boss nu poti sa ii dai studentului note mai mari de 10 sau mai mici ca 1 ");
        } else if (medie < 5) {
            throw new BadGradesExeption("Studentul este repetent");
        } else if (medie < 7 && medie > 5) {
            admisMateInfo = false;
        } else {
            admisMateInfo = true;
        }

    }
    public int getInfoGrade(){
        return infoGrade;
    }

    public int getMathGrade() {
        return mathGrade;
    }

    public int getPhizGrade() {
        return phizGrade;
    }
    public boolean getAdmisPoli(){
        return admisPoli;
    }

    public boolean getAdmisFizica() {
        return admisFizica;
    }
    public boolean getAdmisMateInfo(){
        return admisMateInfo;
    }
    public int getMedie(){
        this.medie=(this.mathGrade+this.phizGrade+this.infoGrade)/3;
        return this.medie;
    }

    @Override
    public int compareTo(Student o) {
        if(this.medie>o.getMedie()){
            return 1;
        }else if(this.medie<o.getMedie()){
            return -1;
        }
        return 0;
    }
}
