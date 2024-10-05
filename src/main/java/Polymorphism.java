class Animal {
    public void printAnimal() {
        System.out.print("I am from the animal class");
    }
    public void printAnimalTwo()
    {
        System.out.print("I am from Animal class too \n");
    }
}
class Lion extends Animal{
    public void printAnimal() {
        System.out.print("I am from Lion class");
    }
}
//Method Overloading - same class ,same name method with different parameters or type
class Addition{
    public int addition(int a,int b)
    {
        return a+b;
    }
    public int addition(int a,int b,int c)
    {
        return a+b+c;
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Animal animal;
        Lion lion =new Lion();//This is method overriding
        animal=lion;
        animal.printAnimal();
        animal.printAnimalTwo();
        lion.printAnimalTwo();


        //Method overloading
        Addition add=new Addition();
        System.out.print(add.addition(25,25));
        System.out.print("\n");
        System.out.print(add.addition(25,25,25));
    }
}
