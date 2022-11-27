public class Car {
    String marka;
    String kolor;

    public Car(String marka, String kolor) {
        this.marka = marka;
        this.kolor = kolor;
    }

    public String getMarka() {
        return marka;
    }

    public String getKolor() {
        return kolor;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public void setKolor(String kolor) {
        this.kolor = kolor;
    }

    @Override
    public String toString() {
        return "Car{" +
                "marka='" + marka + '\'' +
                ", kolor='" + kolor + '\'' +
                '}';
    }
}
