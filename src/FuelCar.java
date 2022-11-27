public class FuelCar extends Car{
    String fuel;

    public FuelCar(String marka, String kolor, String fuel) {
        super(marka, kolor);
        this.fuel = fuel;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public String getInfo() {
        return "Samochód spalinowany. Marka: " + marka + ", kolor samochodu: " + kolor + ", ilość benzyny: " + fuel;
    }
    }

