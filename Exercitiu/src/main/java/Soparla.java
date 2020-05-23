public class Soparla extends Animal implements Ierbivore,Domestic{
    public String move(){
        return "Eu ma tarasc";
    }
    public  String eat(){
        return "Soparla manaca plante" ;
    }

    @Override
    public boolean pet() {
        return true;
    }
}
