import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;


    // Пусть дан LinkedList с несколькими элементами.
    // Реализуйте метод, который вернет “перевернутый” список.


public class HomeWork4_1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Input ammount of list elements: ");
        int size = iScanner.nextInt();
        iScanner.close();
        LinkedList<Integer> linkedList = CreateNFillLinkedList(size);
        System.out.printf("Previous list: %s\n", linkedList);
        ReverseLinkedList(linkedList);
        System.out.printf("Result list: %s\n", linkedList);
    }

    public static LinkedList<Integer> CreateNFillLinkedList(int size) {
        Random rnd = new Random();
        LinkedList<Integer> lnkList = new LinkedList<>();
        for (int i = 0; i < size; i++) {
            lnkList.add(rnd.nextInt(0, 100));
        }
        return lnkList;
    }

    public static void ReverseLinkedList(LinkedList<Integer> lnkList) {
        for (int i = 0; i < lnkList.size() - 1; i++) {
            lnkList.add(lnkList.removeFirst());
        }
    }
}

