public class Tigru extends Animal implements Carnivore ,Wild{
    public String move(){
        return "Eu alerg";
    }

    @Override
    public String eat() {
        return "Tigrul mananca carne";
    }

    @Override
    public boolean pet() {
        return false;
    }
}
