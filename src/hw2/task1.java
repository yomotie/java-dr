package hw2;

public class task1 {
    public static void main(String[] args) {
        int radiusFirst = 1;
        double radiusSecond = 0.5;
        double radiusThird = 0.2;
        double coefficients = 0.7;
        double thickness1 = coefficients * (4.0 / 3.0 * Math.PI * Math.pow(radiusFirst, 3));
        double thickness2 = coefficients * (4.0 / 3.0 * Math.PI * Math.pow(radiusSecond, 3));
        double thickness3 = coefficients * (4.0 / 3.0 * Math.PI * Math.pow(radiusThird, 3));
        System.out.println("The mass of the first ballis: " + thickness1 + " kg");
        System.out.println("The mass of the second ball is: " +thickness2 + " kg");
        System.out.println("The mass of the third ball is: " +thickness3 + " kg");
        System.out.println("The snowman's weight is : " + (thickness1 + thickness2 + thickness3) + " kg" );
    }
}
