package C002.L004.T;

import java.io.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.time.LocalTime.now;

public class Main {
    public static void main(String[] args) {

//        Напишите консольное приложение, позволяющие пользователю зарегистрироваться под «Логином»,
//        состоящем только из символов латинского алфавита, и пароля, состоящего из цифр и символов.

        Scanner scn = new Scanner(System.in);

//        System.out.println("Enter login: ");
//        String login = scn.nextLine();
//        if(!Pattern.matches("(\\w+[a|b|c|d|e|f|g|h|i|j|k|l|m|n|o|p|q|r|s|t|u|v|w|x|y|z])", login)){
//            System.err.println("No match pattern");
//            System.exit(0);
//        }
//        System.out.println("Enter password: ");
//        String password = scn.nextLine();
//        if(!Pattern.matches("(\\w+)", password)){
//            System.err.println("No match pattern");
//            System.exit(0);
//        }
//        System.out.println("Login: " + login + "\nPassword: " + password);

        //-------------------------------------------------------------------------------------------------------------------------------------------------------------------------

//        Напишите шуточную программу «Дешифратор», которая бы в текстовом файле могла бы заменить все предлоги на слово «Java».
//        Stroka - Бывало с самого раннего утра убегаю или на пруд или в рощу или на сенокос

        try {
            String s2;
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\4exan\\IdeaProjects\\Test\\src\\Writer\\text1.txt"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\4exan\\IdeaProjects\\Test\\src\\Writer\\text2.txt"));
            String s = br.readLine();
            String m1 = "(\\s)[в|на|под|из|или|там]+(\\s)";
            Pattern p1 = Pattern.compile(m1);
            Matcher matcher = p1.matcher(s);
           while(matcher.find()){
               s = s.replaceAll(m1, " Java ");
           }
            bw.write(s);
            bw.flush();




        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }

        //-------------------------------------------------------------------------------------------------------------------------------------------------------------------------

//        Спроектируйте и разработайте метод, определяющий, сколько времени прошло с заданной даты.
//                С помощью этого методы выведите в консоль, сколько времени прошло с вашего дня рождения в удобном для восприятия виде,
//                например: «Вам исполнилось 20 лет, 3 месяца, 18 дней, 4 часа, 5 минут и 10 секунд».

//        LocalDate localDate = LocalDate.now();
//        LocalDate birtDate = LocalDate.of(2001,10,23);
//
//        Period period = Period.between(birtDate, localDate);
//        System.out.println("Вам исполнилось: " + period.getYears() + " " + getYear(period.getYears()) + " " + period.getMonths() + " " + getMonth(period.getMonths()) + " " + period.getDays() + " " + getDay(period.getDays()) + " " + now().getHour() + " " + getHour(now().getHour()) + " " + now().getMinute() + " " + getMinute(now().getMinute()) + " " + now().getSecond() + " " + getSecond(now().getSecond()));
//    }
//
//        public static String getYear(int year){
//            if(year > 10 && year < 20) return "лет";
//            switch(year % 10){
//                case 1 : return "год";
//                case 2,3,4 : return  "года";
//                default : return "лет";
//            }
//        }
//
//    public static String getMonth(int month){
//        if(month > 6 && month < 12) return "месяцев";
//        switch(month){
//            case 1 : return "месяц";
//            case 2,3,4 : return  "месяца";
//            default : return "месяцев";
//        }
//    }
//
//    public static String getDay(int day){
//        if(day > 5 && day < 20) return "дней";
//        switch(day){
//            case 1,21 : return "день";
//            case 2,3,4,22,23,24 : return  "дня";
//            default : return "дней";
//        }
//    }
//
//    public static String getHour(int hour){
//        if(hour > 5 && hour < 20) return "часов";
//        switch(hour){
//            case 1,21 : return "час";
//            case 2,3,4,22,23,24 : return  "часа";
//            default : return "часов";
//        }
//    }
//
//    public static String getMinute(int minute){
//        if(minute > 10 && minute < 20) return "минут";
//        switch(minute % 10){
//            case 1 : return "минута";
//            case 2,3,4 : return  "минуты";
//            default : return "минут";
//        }
//    }
//
//    public static String getSecond(int second){
//        if(second > 10 && second < 20) return "секунд";
//        switch(second % 10){
//            case 1 : return "секунда";
//            case 2,3,4 : return  "секунды";
//            default : return "секунд";
//        }
    }
}
