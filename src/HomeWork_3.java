import java.util.*;

public class HomeWork_3 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String [] args){
        //ex1(10);
        ex2();

    }
    public static void ex2(){
        /*
        Задан целочисленный список ArrayList.
        Найти минимальное, максимальное и среднее
        арифметическое из этого списка. Collections.max()
         */
        ArrayList<Integer> numbers = new ArrayList<>();
        Collections.addAll(numbers, 8,3,10,47,39,44,97,22,83);
        double sum = 0;
        for (Integer num : numbers) {
            sum += num;
        }
        System.out.println("The list is: " + numbers);
        System.out.println("Min number: " + Collections.min(numbers));
        System.out.println("Max number: " + Collections.max(numbers));
        System.out.println("Average is: " + sum/numbers.size());

    }
    public static void ex1(int n) {
/*
    Пусть дан произвольный список целых чисел, удалить из него четные числа
 */
        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(random.nextInt(100));
        }
        System.out.println(list);

        List<Integer> list2 = list;
        for (int i = 0; i < list2.size(); i++) {
            if (list2.get(i) % 2 == 0) {
                list2.remove(i);
                i--;
            }
        }
        System.out.println(list2);
    }
}
