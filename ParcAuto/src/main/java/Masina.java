public class Masina implements Comparable<Masina>,Leazing{
    private String marca;
    private String model;
    private String culoare;
    private int pret;
    private String consumabil;
    private int fabricare;
    private boolean sold=false;

    public Masina(String marca,String model,String culoare,int pret,String consumabil,int fabricare) {
        this.consumabil = consumabil;
        this.culoare = culoare;
        this.fabricare = fabricare;
        this.pret=pret;
        this.marca=marca;
        this.model=model;
    }

    public int getFabricare() {
        return fabricare;
    }

    public String getConsumabil() {
        return consumabil;
    }

    public int getPret() {
        return pret;
    }

    public String getCuloare() {
        return culoare;
    }

    public String getMarca() {
        return marca;
    }

    public String getModel() {
        return model;
    }

    public int compareTo(Masina o) {
        if(this.fabricare<o.getFabricare()){
            return -1;
        }else if(this.fabricare>o.getFabricare()){
            return 1;
        }
        return 0;
    }

    public int numberOfPays() {

        return 24;
    }

    public int payRate() {
        return this.pret/numberOfPays();
    }
    public boolean getSold(){
        if ((this.marca.equals("audi")||this.marca.equals("bmw"))&&this.culoare.equals("negru")&&this.consumabil.equals("benzina")){
            return sold=true;
        }else{
            return sold=false;
        }
    }
}
