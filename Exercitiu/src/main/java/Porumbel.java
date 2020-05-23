public class Porumbel extends Animal  implements Ierbivore ,Domestic{
    public String move(){
        return "Eu zbor";
    }

    @Override
    public String eat() {
        return "Porumbelul mananca iarba";
    }

    @Override
    public boolean pet() {
        return true;
    }
}
