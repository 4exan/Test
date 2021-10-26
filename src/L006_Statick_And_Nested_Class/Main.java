package L006_Statick_And_Nested_Class;

import java.util.Scanner;

//Задание 2
//        Создайте проект, используя IntelliJ IDEA.
//        Требуется:
//        Создать класс Vehicle с методом print. В классе Vehicle, создайте внутренний класс Wheel и Door,
//        которые также должны содержать метод print. Создайте экземпляры классов Wheel и Door.
//
//        Задание 3
//        Создайте проект, используя IntelliJ IDEA.
//        Требуется:
//        Создать класс Distance с полем distance типа double и методом print. В классе Distance, создайте
//        статический класс Converter с методами, которые будут конвертировать расстояние в разные единицы
//        измерения (к примеру, из метров в километры, из километров в мили, и так далее).
//
//        Задание 4
//        Зайдите на сайт Oracle.
//        Используя поисковые механизмы Oracle, найдите самостоятельно описание темы по каждому примеру,
//        который был рассмотрен на уроке, так, как это представлено ниже, в разделе «Рекомендуемые
//        ресурсы», описания данного урока. Сохраните ссылки и дайте им короткое описание.

public class Main {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        Vehicle.Wheel wheel = new Vehicle().new Wheel();
        Vehicle.Door door = new Vehicle().new Door();

        wheel.print();
        door.print();
//---------------------------------------------------------------------------------

        System.out.println("Enter distance (meter): ");
        Distance.distance = scn.nextDouble();

        Distance.Converter conv = new Distance.Converter();
        conv.meterToKilometer(Distance.distance);
        conv.meterToMiles(Distance.distance);
        conv.meterToSantimeter(Distance.distance);
    }
}
                        //Не уверен что правильно понял, но вроде всё работает как надо.