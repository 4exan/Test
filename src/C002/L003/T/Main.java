package C002.L003.T;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

//        Задание 2
//        Создайте файл, запишите в него произвольные данные и закройте файл. Затем снова откройте этот файл, прочитайте из него данные и выведете их на консоль.

        try(FileWriter fw = new FileWriter("src\\C002\\L003\\T\\task1.txt")){

            String a = "Hello World!";
            fw.write(a);
            fw.flush();
        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
        }

        try(FileReader fr = new FileReader("src\\C002\\L003\\T\\task1.txt")){

            int c;
            while((c=fr.read())!=-1){
                System.out.print((char)c);
            }

        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
        }

        //----------------------------------------------------------------------------------------------------------------------------------------------------------

//        Задание 3
//        Необходимо создать строку с текстом (текст взять любой из интернета). Разбить эту строку на 2 подстроки равной длине и вывести на экран каждое предложения с новой строки.

    }
}
