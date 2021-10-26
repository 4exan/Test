package L006_Statick_And_Nested_Class.L006_Statick_And_Nested_Class_LR;

import java.util.Scanner;

//Задание 1
//        - Создать класс User, содержащий private переменные login, password.
//        - Создать внутренний класс Query в классе User. Класс Query содержит метод printToLog(),
//        который распечатывает на консоль сообщение о том что пользователь с таким то логином и паролем отправил запрос.
//        - Класс User, содержит метод createQuery(), в котором создается объект класса Query и вызывается метод printToLog().
//
//        В методе main():
//        1) - создать экземпляр класса User и вызвать метод createQuery();
//        2) - создать экземпляр класса Query и вызвать метод printToLog() используя конструкцию user.new Query();
//        3) - создать экземпляр класса Query и вызвать метод printToLog() используя конструкцию new User().new Query();
//
//        Задание 2
//        Переписать предыдущее задание, используя локальный класс

public class Main {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter login: ");
        String login = scn.nextLine();
        System.out.println("Enter password: ");
        String password = scn.nextLine();

//        User user = new User(login, password);                            1) ...
//        user.createQuery();

//        User.Query query = new User(login, password). new Query();        3) ...
//        query.printToLog();                                                               Второе я не понял как сделать.

        User user = new User(login, password);                              //Задание 2, я там в Юзере код переворотил вроде как под локальный класс
        user.createQuery();                                                 // Впринципе там всё то же самое, только класс Query отдельно стоит.
                                                                            // Кстате очень велика вероятность что я неправильно понимаю задание, за это уже простите если что.

    }
}
