package HomeWork3;

public class HomeWork0511Task1 {

    public static void main(String[] args) {


        //Напишите программу, которая выводит на экран результаты сложения, вычитания, умножения и деления двух чисел.
        // Каждая из арифметических операций должна быть реализована как отдельный метод.

        int a;
        int b;
        System.out.println(add(2,3));
        System.out.println(sub(5,6));
        System.out.println(mult(5,7));
        System.out.println(div(34,5));


    }
    public static int add (int a, int b){

        int result = a + b;
        return result;


    }

    public static int sub (int a, int b) {

        int result = a - b;
        return result;
    }
    public static int mult (int a, int b) {

        int result = a * b;
        return result;
    }

    public static int div (int a, int b) {
        int result = a / b;
        return result;
    }


}


