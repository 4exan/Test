package C1.ArrayList;

//Используя Intelij IDEA создать проект, пакет.
//        Создать class Main, в нем создать список, добавить учителей, которых вы только сможете вспомнить со
//        школы. И получить индекс самого лучшего учителя и самого не очень. Вывести список в консоль.

import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("Ирина Мандариновна");
        arr.add("Юлия Велериевна");
        arr.add("Оксана Викторовна");
        arr.add("Кристина Сергеевна");
        arr.add("Евгения Викторовна");

        System.out.println("Best: " + arr.indexOf("Кристина Сергеевна"));
        System.out.println("Worst: " + arr.indexOf("Ирина Мандариновна"));

//        Пользователь вводит с клавиатуры набор чисел. Полученные числа необходимо сохранить в список. После
//        чего нужно показать меню, в котором предложить пользователю набор пунктов:
//        1. Добавить элемент в список;
//        2. Удалить элемент из списка;
//        3. Показать содержимое списка;
//        4. Проверить есть ли значение в списке;
//        5. Заменить значение в списке.
//        В зависимости от выбора пользователя выполняется
//        действие, после чего меню отображается снова.

//        Scanner scn = new Scanner(System.in);
//        C1.ArrayList<Integer> arr2 = new C1.ArrayList<>();
//        int val;
//        int oper;
//
//        System.out.println("Enter number for continue or *0* to exit: ");
//
//        do{
//            val = scn.nextInt();
//            if(val == 0){
//                break;
//            }
//            arr2.add(val);
//        } while(val != 0);
//
//            System.out.println("Enter number of operation: ");
//            System.out.println("1 - add element; 2 - Delete element; 3 - show list; 4 - search element in list; 5 - replace element");
//            oper = scn.nextInt();
//
//            switch (oper) {
//                case 1:
//                    System.out.println("Add element: ");
//                    int a = scn.nextInt();
//                    arr2.add(a);
//                    System.out.println("Element " + a + " has added");
//                    System.out.println(arr2.toString());
//                    break;
//                case 2:
//                    System.out.println("Delete element(Index): ");
//                    int b = scn.nextInt();
//                    arr2.remove(b);
//                    System.out.println("Element has been removed");
//                    System.out.println(arr2.toString());
//                    break;
//                case 3:
//                    System.out.println("List: ");
//                    System.out.println(arr2.toString());
//                    break;
//                case 4:
//                    System.out.println("Enter element to search: ");
//                    int c = scn.nextInt();
//                    System.out.println(arr2.get(c));
//                    break;
//                case 5:
//                    System.out.println("Enter index of element u want replace: ");
//                    int rep1 = scn.nextInt();
//                    System.out.println("Enter new element: ");
//                    int rep2 = scn.nextInt();
//                    arr2.set(rep1, rep2);
//                    System.out.println(arr2.toString());
//                    break;
//            }

//        Используя Intelij IDEA создать проект, пакет. Создать класс Zoo.
//        В классе создать список, в который записать 8 животных через метод add(index, element).
//        Вывести список в консоль.

        ArrayList<String> zoo = new ArrayList<>();
        zoo.add(0, "Cat");
        zoo.add(1, "Dog");
        zoo.add(2, "Elephant");
        zoo.add(3, "Hippo");
        zoo.add(4, "Parrot");
        zoo.add(5, "Monki");
        zoo.add(6, "Lion");
        zoo.add(7, "Zebra");
        System.out.println(zoo);

//        Задание 3 Используя Intelij IDEA создать проект, пакет.
//        Используя класс Zoo Задания 2, удалить 3, 5, 7 животные, узнать размер списка и вывести в консоль.

        zoo.remove(6);
        zoo.remove(4);
        zoo.remove(2);
        System.out.println(zoo.size());
        System.out.println(zoo);

//        Создать класс Main, создать список целых чисел и используя ListIterator пройтись по списку и увеличить значения на 1;

        ArrayList<Integer> num = new ArrayList<>();
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);
        num.add(5);




    }
}
