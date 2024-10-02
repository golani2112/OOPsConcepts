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

public class Polymorphism {
    public static void main(String[] args) {
        Animal animal;
        Lion lion =new Lion();//This is method overriding
        animal=lion;
        animal.printAnimal();
        animal.printAnimalTwo();
        lion.printAnimalTwo();

    }
}
