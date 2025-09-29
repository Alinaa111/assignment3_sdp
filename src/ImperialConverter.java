// Adaptee with an incompatible interface
public class ImperialConverter {
    public double getKilometers(double miles) {
        return miles / 0.621371;
    }

    public double getCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public double getLiters(double gallons) {
        return gallons / 0.264172;
    }
}
