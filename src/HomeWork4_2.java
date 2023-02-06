import java.util.LinkedList;

public class HomeWork4_2 {
    //    Реализуйте очередь с помощью LinkedList со следующими методами:
    //    enqueue() - помещает элемент в конец очереди,
    //    dequeue() - возвращает первый элемент из очереди и удаляет его,
    //    first() - возвращает первый элемент из очереди, не удаляя.
    public static void main(String[] args) {
        int[] arr = {6, 7, 3, 9, 2, 4, 1, 5};

        LinkedList<Integer> list = new LinkedList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }
        int number = 24; // элемент в конец списка

        System.out.println("Main queue: ");
        System.out.println(list);


        enqueue(list, number);
        System.out.println("Method <enqueue>, element " + number + " added in the end of queue:");
        System.out.println(list);

        System.out.println("Method <dequeue>, back first element from queue [" + dequeue(list) + "] and delite it.");
        System.out.println("The queue after method <dequeue>:");
        System.out.println(list);

        System.out.println("Method <first>, back first element from queue [" + first(list) + "] and  not delite it.");
        System.out.println("The queue after method <first>:");
        System.out.println(list);
    }

    public static void enqueue(LinkedList<Integer> arr, int num) {
        arr.add(num);
    }

    public static int dequeue(LinkedList<Integer> arr) {
        int number = 0;
        number = arr.get(0);
        arr.remove(0);
        return number;
    }

    public static int first(LinkedList<Integer> arr) {
        int number = 0;
        number = arr.get(0);
        return number;
    }

}

