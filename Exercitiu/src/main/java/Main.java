public class Main {
    public static void main(String[] args) {
        Circle cerc = new Circle();
        Rectangle dreptunghi = new Rectangle();
        Square patrat = new Square();

        System.out.println(cerc.draw());
        System.out.println(cerc.arial());
        System.out.println(cerc.perimeter());

        System.out.println(dreptunghi.draw());
        System.out.println(dreptunghi.arial());
        System.out.println(dreptunghi.perimeter());

        System.out.println(patrat.draw());
        System.out.println(patrat.arial());
        System.out.println(patrat.perimeter());

        Calculable cerc2=new Circle();
        Calculable dreptunghi2=new Rectangle();
        Calculable patrat2=new Square();

        System.out.println(cerc2.arial());
        System.out.println(cerc2.perimeter());

        System.out.println(dreptunghi2.perimeter());
        System.out.println(dreptunghi2.arial());

        System.out.println(patrat2.perimeter());
        System.out.println(patrat2.arial());

        //Modelam animale
        //care zboara carea alearga care se tarasc care innoata
        //prumbel
        //tigru
        //soparla
        //crocodil
        Porumbel porumbel = new Porumbel();
        Tigru tigru = new Tigru();
        Soparla soparla = new Soparla();
        Crocodil crocodil = new Crocodil();

        System.out.println(porumbel.move());
        System.out.println(tigru.move());
        System.out.println(soparla.move());
        System.out.println(crocodil.move());
        System.out.println(crocodil.pet());

        Animal porumbel1 = new Porumbel();
        Animal tigru1 = new Tigru();
        Animal soparla1 = new Soparla();
        Animal crocodil1 = new Crocodil();

        System.out.println(porumbel1.move());
        System.out.println(tigru1.move());
        System.out.println(soparla1.move());
        System.out.println(crocodil1.move());

        System.out.println(porumbel1.sleep());
        System.out.println(tigru1.sleep());
        System.out.println(soparla1.sleep());
        System.out.println(crocodil1.sleep());

        Ierbivore porumbel3=new Porumbel();
        Carnivore tigru3=new Tigru();
        Ierbivore soparla3=new Soparla();
        Carnivore crocodil3=new Crocodil();

        System.out.println(porumbel3.eat());
        System.out.println(tigru3.eat());
        System.out.println(soparla3.eat());
        System.out.println(crocodil3.eat());

        Domestic porumbel4=new Porumbel();
        Domestic soparla4=new Soparla();

        Wild tigru4=new Tigru();
        Wild crocodil4=new Crocodil();

        System.out.println(porumbel4.pet());
        System.out.println(soparla4.pet());
        System.out.println(tigru4.pet());
        System.out.println(crocodil4.pet());
    }
}
