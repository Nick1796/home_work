package HomeWork.task3;

public class HW3 {
    public static void main(String[] args) {
        int n = (int) (Math.random() * 28801);
        System.out.println("Осталось " + n + " секунд");
        int hoursLeft = (28800 - n) / 3600;

        if (hoursLeft > 1) {
            System.out.println("Осталось " + hoursLeft + " часов");
        } else if (hoursLeft == 1) {
            System.out.println("Остался 1 час");
        } else {
            System.out.println("Осталось менее часа");
        }
    }

}


