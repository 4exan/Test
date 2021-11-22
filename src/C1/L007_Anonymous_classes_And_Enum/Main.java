package C1.L007_Anonymous_classes_And_Enum;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.println("How old is animal?");
        int yearsOld = scn.nextInt();

        Animal animal = new Animal(yearsOld);

        switch(animal.yearsOld){
            case 1 :
                System.out.println("This animal is: " + Animals.Cat + ", " + yearsOld + " years old");
                break;
            case 2 :
                System.out.println("This animal is: " + Animals.Dog + ", " + yearsOld + " years old");
                break;
            case 3 :
                System.out.println("This animal is: " + Animals.Hamster + ", " + yearsOld + " years old");
                break;
            case 4 :
                System.out.println("This animal is: " + Animals.Lion + ", " + yearsOld + " years old");
                break;
            case 5 :
                System.out.println("This animal is: " + Animals.Jaguar + ", " + yearsOld + " years old");
                break;
            case 6 :
                System.out.println("This animal is: " + Animals.Puma + ", " + yearsOld + " years old");
                break;
        }

    }
}
class Animal{
    int yearsOld;

    Animal(int yearsOld){
        this.yearsOld = yearsOld;
    }

}
enum Animals{
    Cat, Dog, Hamster, Lion, Jaguar, Puma

}