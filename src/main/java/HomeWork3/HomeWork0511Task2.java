package HomeWork3;

public class HomeWork0511Task2 {

    public static void main(String[] args) {

        double euro = 100;
        double b = 0.92;

        System.out.println("Сумма в долларах США: " +convert(euro,b));
    }

    public static double convert(double euro, double b) {
            double result = euro * b;
            return result;

        }
}
