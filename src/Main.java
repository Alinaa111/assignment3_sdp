import java.util.Scanner;

// Client code
public class Main {
    public static void main(String[] args) {
        ImperialConverter imperial = new ImperialConverter();
        MetricConverter adapter = new UnitAdapter(imperial);

        // Entering units, converting and outputting
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter miles: ");
        double miles = sc.nextDouble();
        System.out.println("In kilometers: " + adapter.convertDistance(miles));

        System.out.print("Enter fahrenheits: ");
        double fahrenheits = sc.nextDouble();
        System.out.println("In celsius: " + adapter.convertTemperature(fahrenheits));

        System.out.print("Enter gallons: ");
        double gallons = sc.nextDouble();
        System.out.println("In liters: " + adapter.convertVolume(gallons));


    }
}