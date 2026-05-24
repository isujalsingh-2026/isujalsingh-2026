package MarqueeeDup.JavaFunction;

public class Cel_Fare {

    public static double conversion(float celcius) {
        double farenheit = (celcius * (9.0/5)) + 32;
        return farenheit;
    }
    public static void main(String[] args) {
        System.out.println(conversion(37));

    }
}
