package ProgrammingExercises;

public class Billing {
    public static void main(String args[]) {
        double price = 10;
        final double TAX = 0.08;
        double quantity = 3;
        double coupon = 2;
        computeBill(price, TAX);
        computeBill(price, quantity, TAX);
        computeBill(price, quantity, coupon, TAX);
    }
    public static void computeBill(double p, final double T){
        double addedTax = p * T;
        double total = p + addedTax;
        System.out.println("Total = " + total);
    }
    public static void computeBill(double p, double q, final double T){
        p = p * q;
        double addedTax = p * T;
        double total = p + addedTax;
        System.out.println("Total = " + total);
    }
    public static void computeBill(double p, double q, double c, final double T){
        p = p * q;
        p = p - c;
        double addedTax = p * T;
        double total = p + addedTax;
        System.out.println("Total = " + total);
    }
}
