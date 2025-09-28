// Adapter with implemented methods from interface
public class UnitAdapter implements MetricConverter {
    private ImperialConverter imperial;

    // Adapter constructor
    public UnitAdapter(ImperialConverter imperial) {
        this.imperial = imperial;
    }

    // Override methods for getting metric units
    @Override
    public double getKilometers(double miles){
        return miles / 0.621371;
    }

    @Override
    public double getCelsius(double fahrenheit){
        return (fahrenheit - 32) * 5 / 9;
    }

    @Override
    public double getLiters(double gallons){
        return gallons / 0.264172;
    }
}
