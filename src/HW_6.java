///*
//1. Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
//Создать множество ноутбуков.
//2. Написать метод, который будет запрашивать у пользователя критерий
//(или критерии) фильтрации и выведет ноутбуки, отвечающие фильтру.
//Критерии фильтрации можно хранить в Map.
//Например: “Введите цифру, соответствующую необходимому критерию:
//1 - ОЗУ
//2 - Объем ЖД
//3 - Операционная система
//4 - Цвет …
//3. Далее нужно запросить минимальные значения для указанных критериев -
//сохранить параметры фильтрации можно также в Map.
//4. Отфильтровать ноутбуки из первоначального множества и вывести проходящие по условиям.
// */
//

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class HW_6 {

    public static void printAllLaptops(Set<Laptop> laptops) {
        for (Laptop laptop : laptops) {
            System.out.println(laptop);
        }
    }

    public static Set<Laptop> getLaptopsByFilter(Set<Laptop> laptops, int filter) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Set<Laptop> laptopsSet = new HashSet<>();
        if (filter == 1) {
            System.out.println("Please input min RAM capasity to filter: ");
            int ramCapasityFrom = Integer.parseInt(reader.readLine());
            System.out.println("Please input max RAM capasity to filter: ");
            int ramCapasityTo = Integer.parseInt(reader.readLine());
            for (Laptop laptop : laptops) {
                if (laptop.getOperMemory() >= ramCapasityFrom && laptop.getOperMemory() <= ramCapasityTo) {
                    laptopsSet.add(laptop);
                }
            }
        }
        if (filter == 2) {
            System.out.println("Please input min Hard Disc capasity to filter: ");
            int hardDiscCapasityFrom = Integer.parseInt(reader.readLine());
            System.out.println("Please input max Hard Disc capasity to filter: ");
            int hardDiscCapasityTo = Integer.parseInt(reader.readLine());
            for (Laptop laptop : laptops) {
                if (laptop.getHardDisc() >= hardDiscCapasityFrom && laptop.getHardDisc() <= hardDiscCapasityTo) {
                    laptopsSet.add(laptop);
                }
            }
        }
        if (filter == 3) {
            System.out.println("Please input operating System to filter: ");
            String system = reader.readLine();
            for (Laptop laptop : laptops) {
                if (laptop.getSystem().equalsIgnoreCase(system)) {
                    laptopsSet.add(laptop);
                }
            }
        }
        if (filter == 4) {
            System.out.println("Please input color to filter: ");
            String color = reader.readLine();
            for (Laptop laptop : laptops) {
                if (laptop.getColor().equalsIgnoreCase(color)) {
                    laptopsSet.add(laptop);
                }
            }
        }
        return laptopsSet;
    }

    public static void main(String[] args) throws IOException {
        Laptop laptop1 = new Laptop(16, 512, "macOS", "silver");
        Laptop laptop2 = new Laptop(32, 1024, "Windows", "gold");
        Laptop laptop3 = new Laptop(8, 512, "Linux", "white");
        Laptop laptop4 = new Laptop(16, 1000, "Linux", "white");
        Laptop laptop5 = new Laptop(128, 1000, "Windows", "gold");

        Set<Laptop> laptops = new HashSet<>();
        Collections.addAll(laptops, laptop1, laptop2, laptop3, laptop4, laptop5);


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            System.out.println("Menu: ");
            System.out.println("1. Show all laptops.");
            System.out.println("2. Show laptops by filter: RAM");
            System.out.println("3. Show laptops by filter HArd Disc");
            System.out.println("4. Show laptops by filter System");
            System.out.println("5. Show laptops by filter Color");
            System.out.println("0. Exit");
            int action = -1;
            try {action = Integer.parseInt(reader.readLine());}
            catch (Exception e){
                System.out.println("Exeption: " + e.getMessage());
            }
            if (action == 1) {
                printAllLaptops(laptops);
            } else if (action == 2) {
                printAllLaptops(getLaptopsByFilter(laptops, 1));
            } else if (action == 3) {
                printAllLaptops(getLaptopsByFilter(laptops, 2));
            } else if (action == 4) {
                printAllLaptops(getLaptopsByFilter(laptops, 3));
            } else if (action == 5) {
                printAllLaptops(getLaptopsByFilter(laptops, 4));
            } else if (action == 0) {
                break;
            } else {
                System.out.println("Falls action, try again");
            }
        }

    }


}
