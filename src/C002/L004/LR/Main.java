package C002.L004.LR;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

//        Задание 1
//        Дана строка 'ahb acb aeb aeeb adcb axeb'. Напишите регулярное выражение, которая найдет строки ahb, acb, aeb по
//        шаблону: буква 'a', любой символ, буква 'b'. Выведите строки на консоль

//        String regex = "a(\\w)b";
//        String s = "ahb acb aeb aeeb adcb axeb";
//
//        Pattern p1 = Pattern.compile(regex);
//        Matcher m1 = p1.matcher(s);
//
//        while(m1.find()){
//            System.out.println("Matched: " + m1.group());
//        }

//        Задание 2
//        Дана строка 'aa aba abba abbba abca abea'. Напишите регулярное выражение, которая найдет строки aa, aba, abba, abbba по
//        шаблону: буква 'a', буква 'b' любое количество раз (в том числе ниодного раза), буква 'a'. Выведите строки на консоль

//        String regex2 = "a+b*+a";
//        String s2 = "aa aba abba abbba abca abea";
//
//        Pattern p2 = Pattern.compile(regex2);
//        Matcher m2 = p2.matcher(s2);
//
//        while(m2.find()){
//            System.out.println("Matched: " + m2.group());
//        }

//        Задание 3
//        Дана строка “Versions: Java  5, Java 6, Java   7, Java 8.”  Найти все подстроки "Java X" и распечатать их.

//        String regex3 = "(\\w+)(\\w)(\\s+)(\\w)";
//        String s3 = "Versions: Java  5, Java 6, Java   7, Java 8";
//        s3 = s3.trim().replaceAll("\\s+"," ");
//
//        Pattern p3 = Pattern.compile(regex3);
//        Matcher m3 = p3.matcher(s3);
//
//        while(m3.find()){
//            System.out.println("Matched: " + m3.group());
//        }

//        Задание 4
//        Напишите регулярные выражения, которые бы проверяли корректность введенных пользователем полей.
//        Для регистрации в приложении поля должны соответствовать таким требованиям:
//        логин - не более 10 символов большими или маленькими буквами
//        номер телефона - иметь шаблон +38(098)77 88 999 или +38(098)77-88-999
//        email - на ваше усмотрение

        System.out.println("Enter login (10 symbols or less): ");
        String login = scn.nextLine();
        if(!Pattern.matches("(\\w{3,10})", login)){
            System.err.println("No match pattern");
            System.exit(0);
        }
        System.out.println("Enter phone number (+38(098)77 88 999): ");
        String phoneN = scn.nextLine();
        if(!Pattern.matches("\\+38\\(0(\\d{2})\\)(\\d{2})[\\s|-](\\d{2})[\\s|-](\\d{3})", phoneN)){
            System.err.println("No match pattern");
            System.exit(0);
        }
        System.out.println("Enter email: ");
        String email = scn.nextLine();
        if(!Pattern.matches("(\\w+)@(\\w+\\.)(\\w+)",email)){
            System.err.println("No match pattern");
            System.exit(0);
        }

        System.out.println(" New user: \n" + "Login: " + login + "\n Phone number: " + phoneN + "\n Email: " + email);

    }
}
