public  class Rectangle extends Shape implements Calculable {
    public  String draw(){
        return "Ma desenez ca un dreptunghi";
    }

    @Override
    public String perimeter() {
        return "Calculez perimetrul dreptunghiului";
    }

    @Override
    public String arial() {
        return "Calculez aria dreptunghiului";
    }
}
