package HomeWork2;

public class HomeWork0511Task3 {


    public static void main(String[] args) {
         double smallpizza = 24;
         double bigpizza = 28;

         double smallArea = calculatePizzaArea(smallpizza);
         double bigArea = calculatePizzaArea(bigpizza);

        System.out.println((bigArea) +40);


    }
    public static double calculatePizzaArea(double diameter){
        return 3.14 *diameter * diameter /4;
    }



}
