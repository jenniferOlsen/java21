package java21;

public class Weather {
    public static void main(String[] arguments) {
        float fah = 86;
        System.out.println(fah + " degrees Fahrenheit is ...");
        //to convert Fahrenheit into Celsius
        fah = fah - 32;
        fah = fah / 9;
        fah = fah * 5;
        System.out.println(fah + " degrees Celsius\n");
        
        float cel = 33;
        System.out.println(cel + " degrees Celsius is ...");
        // Convert Celsius to Fahrenheit
        cel = cel * 9;
        cel = cel / 5;
        cel = cel + 32;
        System.out.println(cel + " degrees Fahrenheit");
    }
}