package hw4;

public class task1 {
    public static void main(String[] args) {
        System.out.println( printAirplaneInfo("Jet", "F-22 Raptor") + "\n" +
         printAirplaneInfo("Airliner", "Aerobus 737", 120) + "\n" +
         printAirplaneInfo("Airliner", "Boeing 777",  180, 28));
    }

    public static String printAirplaneInfo(String name, String type) {
        return "Name is :" + name + ", Type is: " + type ;
    }

    public static String printAirplaneInfo(String name, String type, int economySeats) {
        return "Name is: " + name + ", type is: " + type + ", Number of economclass seats is: " + economySeats;
    }

    public static String printAirplaneInfo(String name, String type, int economySeats, int businessSeats) {
        return "Name is: " + name + ", Type is: " + type + ", Number of economclass seats is: " + economySeats + ", Number of business class seats is: " + businessSeats;

    }

}
