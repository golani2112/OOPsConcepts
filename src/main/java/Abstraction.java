//Abstraction - Focuses on design level of system
public class Abstraction {
    private double radius;
    private double pi;

    public Abstraction() {
        radius=0;
        pi=3.142;
    }

    public Abstraction(double r){
        radius=r;
        pi=3.142;
    }

    public double area(){
        return pi*radius*radius;
    }
    public double perimeter(){
        return 2*pi*radius;
    }

    public static void main(String[] args) {
        Abstraction circle = new Abstraction(5);
        System.out.printf("Area: %.2f %n", circle.area());
        System.out.printf("Perimeter: %.2f %n", circle.perimeter());
    }


}
