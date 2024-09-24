class Vehicle{
    private String name;
    private String model;
    Vehicle(String name,String model){
        this.name=name;
        this.model=model;

    }
    public void getName() {
        System.out.print("The car is a "+ name + " " + model);
    }
}
class FuelCar extends Vehicle {
    private String combustType;
    FuelCar(String name, String model,String combustType) {
        super(name, model);
        this.combustType=combustType;
    }
    public void getFuelCar() {
        getName();
        System.out.print(",combust type is "+ combustType);
    }
}
class ElectriCar extends Vehicle {
    private String batteryPower;
    ElectriCar(String name, String model,String batteryPower) {
        super(name, model);
        this.batteryPower=batteryPower;
    }
    public void getElectricCar() {
        getName();
        System.out.print(", battery power is " + batteryPower);
    }
}
class GasolineCar extends FuelCar {
    private String combustType;
    private String gasCapacity;
    GasolineCar(String name, String model, String combustType,String gasCapacity) {
        super(name, model, combustType);
        this.gasCapacity=gasCapacity;
    }
    public void getGasolineCar(){
        getName();
        System.out.print(", gas capacity is "+gasCapacity);
    }
}
public class Inheritance {

    public static void main(String[] args){
        System.out.print("Single Inheritnce: ");
        FuelCar Fuel = new FuelCar("Honda","Accord","Petrol");
        Fuel.getFuelCar();
        System.out.println("\n");

        System.out.print("Hierarchical inheritance: ");
        ElectriCar Electric = new ElectriCar("Tesla","ModelX","200MWH");
        Electric.getElectricCar();
        System.out.print("\n");

        System.out.println("Multi-Level inheritance:");
        GasolineCar Gasoline = new GasolineCar("Toyota", "Corolla", "Gasoline", "30 liters");
        Gasoline.getGasolineCar();
        System.out.println("\n");
    }
}
