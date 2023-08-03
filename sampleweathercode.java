import java.util.Scanner;
public class WeatherApp {
    private static double getWeatherData(String date) {
        return 0.0;
    }
    private static double getWindSpeedData(String date) {
        return 0.0; 
    }
    private static double getPressureData(String date) {
        return 0.0; 
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Get weather");
            System.out.println("2. Get Wind Speed");
            System.out.println("3. Get Pressure");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter the date: ");
                    String date1 = scanner.next();
                    double temperature = getWeatherData(date1);
                    System.out.println("Temperature on " + date1 + ": " + temperature);
                    break;
                case 2:
                    System.out.print("Enter the date: ");
                    String date2 = scanner.next();
                    double windSpeed = getWindSpeedData(date2);
                    System.out.println("Wind Speed on " + date2 + ": " + windSpeed);
                    break;
                case 3:
                    System.out.print("Enter the date: ");
                    String date3 = scanner.next();
                    double pressure = getPressureData(date3);
                    System.out.println("Pressure on " + date3 + ": " + pressure);
                    break;
                case 0:
                    System.out.println("Exiting the program...");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
