package C002.L003.LR;

import java.io.*;
import java.nio.CharBuffer;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Main {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);


//        Задание 1
//        Пользователь с клавиатуры вводит путь к файлу. После
//        чего содержимое файла отображается на экране.

//        String path;
//        System.out.println("Enter path to file: ");
//        path = scn.nextLine();
//        try(FileReader reader = new FileReader(path)){
//
//            int c;
//            while((c=reader.read())!=-1){
//                System.out.print((char)c);
//            }
//
//        }
//        catch (IOException ex){
//            System.out.println(ex.getMessage());
//        }

        //------------------------------------------------------------------------------------------------------------------

//        Задание 2
//        Пользователь с клавиатуры вводит пути к трем
//        файлам. Программа должна содержимое двух файлов
//        записать в третий файл.

//        String path1, path2, path3;
//
//        String text2;
//        System.out.println("Enter path to file (1): ");
//        path1 = scn.nextLine();
//        System.out.println("Enter path to file (2): ");
//        path2 = scn.nextLine();
//        System.out.println("Enter path to file (3): ");
//        path3 = scn.nextLine();
//
//        try (BufferedReader br = new BufferedReader(new FileReader(path1))) {
//
//            String c;
//            c = br.readLine();
//            BufferedWriter bw = new BufferedWriter(new FileWriter(path3));
//
//
//
//
//
//
//                try (BufferedReader br2 = new BufferedReader(new FileReader(path2))) {
//
//                    String v;
//                    v = br2.readLine();
//                    BufferedWriter bw2 = new BufferedWriter(new FileWriter(path3));
//                    bw2.write(c + " " + v);
//                    bw2.flush();
//
//
//                } catch (IOException ex) {
//                    System.out.println(ex.getMessage());
//                }
//                try (FileReader fr = new FileReader(path3)) {
//                    int b;
//                    while ((b = fr.read()) != -1) {
//                        System.out.print((char) b);
//                    }
//                } catch (IOException ex) {
//                    System.out.println(ex.getMessage());
//                }
//
//
//        }
//        catch (IOException ex){
//            System.out.println(ex.getMessage());
//        }

        //------------------------------------------------------------------------------------------------------------------

//        Задание 3
//        Создайте класс, который создает и заполняет файл 'part.txt' случайными
//        целыми числами от 0 до 50 (всего 10 чисел), затем читает файл и записывает его
//        содержимое в другой файл ('part_sorted.txt'). Числа должны быть отсортированы в
//        порядке возрастания. Отобразите содержимое обоих файлов в консоли (числа
//        должны быть разделены пробелом). Выходной файл должен быть доступен для чтения.


        int arr[] = new int[10];

       try(FileWriter fw = new FileWriter("part.txt")) {
           int[] part = {37, 12, 5, 47, 11, 22, 34, 1, 31, 15};
           for (int i = 0; i < part.length; i++) {
               fw.write(((part[i]) + System.getProperty("line.separator")));
               System.out.print(part[i] + " ");

           }
       }
       catch (IOException ex){
           System.out.println(ex.getMessage());
       }
        System.out.println(" ");
       try(FileReader fr = new FileReader("part.txt");
           BufferedReader br = new BufferedReader(fr);
       FileWriter fw = new FileWriter("part_sorted.txt");
       BufferedWriter bw = new BufferedWriter(fw))
       {

           for(int i = 0; i < arr.length; i++) {
               String a = br.readLine();
               arr[i] = Integer.parseInt(a);
               System.out.print(arr[i] + " ");
               br.lines();

           }
           int min = 0;
           int max = 0;
           int temp = 0;

           for(int i = arr.length-1 ; i > 0 ; i--){
               for(int j = 0 ; j < i ; j++){
            if( arr[j] > arr[j+1] ){
                int tmp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = tmp;
            }
        }
    }
           System.out.println(" ");

           for(int i = 0; i < arr.length; i++){
               System.out.print(arr[i] + " ");
               fw.write(((arr[i]) + " "));

           }


       }
       catch(IOException ex){
           System.out.println(ex.getMessage());
        }

    }
}