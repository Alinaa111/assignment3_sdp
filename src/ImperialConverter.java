// Adaptee with an incompatible interface
public class ImperialConverter {
    public double getMiles(double kilometers) {
        return kilometers * 0.621371;
    }

    public double getFahrenheit(double celsius) {
        return celsius * 9 / 5 + 32;
    }

    public double getGallons(double liters) {
        return liters * 0.264172;
    }
}
