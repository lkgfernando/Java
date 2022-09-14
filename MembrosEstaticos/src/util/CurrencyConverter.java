package util;

public class CurrencyConverter {
    public static final double IOF = 0.06;

    public static double calcDollar(double price, double quantity){
        return price * quantity * (1.0 + IOF);
    }
}
