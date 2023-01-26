
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;




public class HomeWork_2 {
    public static void main(String[] args) throws Exception {
        String result = ex1(result);
        String filePath2 = "file2.txt";

        ex2(String result, filePath2);
/*
Дана json строка
[{ "фамилия":"Иванов","оценка":"5","предмет":"Математика"},
{"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},
{"фамилия":"Краснов","оценка":"5","предмет":"Физика"}].
 Задача написать метод, который распарсит строку и выдаст ответ вида:
 Студент Иванов получил 5 по предмету Математика.
 Студент Петрова получил 4 по предмету Информатика.
 Студент Краснов получил 5 по предмету Физика.
 Используйте StringBuilder для подготовки ответа.
 */
        static void ex1(String filePath) {
            FileReader fr = new FileReader("file.txt");
            Scanner scan = new Scanner(fr);

            String s = scan.next();
            String new_s = s.replace('[', ' ').replace(']', ' ').replace('{', ' ').replace('}', ' ').replace('"', ' ').replace(':', ' ').replace(',', ' ');

            String[] words = new_s.split(" ");

            String result = "";
            for (int j = 1; j < words.length; j += 6) {
                result += "student " + words[j] + "received " + words[j + 2] + "by the discipline " + words[j + 4] + ".\n";
            }
            fr.close();
        }
        static void ex2(String result, String filePath2){

            try (FileWriter fileWriter = new FileWriter(filePath2)){
                fileWriter.write(result.toString());
            } catch (IOException e){
                e.printStackTrace();
            }

        }
    }
}