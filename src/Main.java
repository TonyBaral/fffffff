public class Main {
    public static void main(String[] args){

Car auto = new Car("Lexus","Srebrny");
        System.out.println(auto.toString());
ElectricCar eleAuto = new ElectricCar("Tesla","Biały","78%");
        System.out.println(eleAuto.getInfo());
FuelCar fCar = new FuelCar("Audi","Czarny","50%");
        System.out.println(fCar.getInfo());
    }
}