// Adapter with implemented methods from interface
public class UnitAdapter implements MetricConverter {
    private ImperialConverter imperial;

    // Adapter constructor
    public UnitAdapter(ImperialConverter imperial) {
        this.imperial = imperial;
    }

    // Override methods for getting metric units
    @Override
    public double convertDistance(double miles){
        return imperial.getKilometers(miles);
    }

    @Override
    public double convertTemperature(double fahrenheit){
        return imperial.getCelsius(fahrenheit);
    }

    @Override
    public double convertVolume(double gallons){
        return imperial.getLiters(gallons);
    }
}
