public class Crocodil extends Animal implements Carnivore ,Wild {
    public String move() {
        return "Eu innot";
    }

    @Override
    public String eat() {
        return "Crocodilul mananca carne";
    }

    @Override
    public boolean pet() {
        return false;
    }
}
