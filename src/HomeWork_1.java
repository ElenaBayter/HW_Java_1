import java.util.Scanner;

public class HomeWork_1 {
    public static void main(String[] args){
        hw4();
    }
    static void hw4(){
        /*
        Реализовать простой калькулятор ("введите первое число"...
        "Введите второе число"... "укажите операцию, которую
        надо выполнить с этими числами"... "ответ: ...")
         */
        double res;
        System.out.println("Input a first number: ");
        Scanner scanner = new Scanner(System.in);
        double first = scanner.nextDouble();
        System.out.println("Input a second number: ");
        Scanner scanner2 = new Scanner(System.in);
        double second = scanner.nextDouble();
        System.out.println("Input an operation that you want to do: ");
        Scanner scanner3 = new Scanner(System.in);
        String operation = scanner3.next();
        if (operation.equals("+")){
            System.out.println("res = " + (first + second));
        }
        else if (operation.equals("-")){
            System.out.println("res = " + (first - second));
        }
        else if (operation.equals("*")){
            System.out.println("res = " + (first * second));
        }
        else if (operation.equals("/")){
            System.out.println("res = " + (first / second));
        }

    }
    static void hw3(){
        /*
        Вывести все простые числа от 1 до 1000 (простые числа
        - это числа которые делятся только на себя и на единицу
        без остатка. Чтобы найти остаток от деления используйте
        оператор % , например 10%3 будет равно единице)
         */
        int num = 1000;
        boolean b = true;
        for (int j = 2; j <= num; j++) {
            for (int i = 2; i < j; i++) {
                if (j % i == 0){
                    b = false;
                    break;
                }
            }
            if (b) System.out.println(j);
            else b = true;
        }
    }
    static void hw2(){
        /* Вычислить n! (произведение чисел от 1 до n)*/
        System.out.println("Write a number: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int factorial = 1;
        while (num>=1){
            factorial *= num;
            num--;
        }
        System.out.println("Factorial of number " + num + " is " + factorial);
    }
    static void hw1(){
            /*Вычислить n-ое треугольного число(сумма чисел от 1 до n) */

        System.out.println("Write a number n: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int count = 0;
        while (num>0){
            count += num;
            num--;
        }
        System.out.println("Triangle digit of number " + num + " is " + count);
    }

}
