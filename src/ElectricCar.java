public class ElectricCar extends Car {
    String chargeLevel;

    public ElectricCar(String marka, String kolor, String chargeLevel) {
        super(marka, kolor);
        this.chargeLevel = chargeLevel;
    }

    public String getChargeLevel() {
        return chargeLevel;
    }

    public void setChargeLevel(String chargeLevel) {
        this.chargeLevel = chargeLevel;
    }
    public String getInfo() {
        return "Samochód elektryczny. Marka: " + marka + ", kolor samochodu: " + kolor + ", poziom naładowania samochodu: " + chargeLevel;
    }
}

