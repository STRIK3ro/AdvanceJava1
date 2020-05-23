public  class Square extends Shape implements Calculable{
    public  String draw(){
        return "Ma desenez ca un patrat";
    }

    @Override
    public String perimeter() {
        return "Calculam perimetrul patratului";
    }

    @Override
    public String arial() {
        return "Calculam aria patratului";
    }
}
