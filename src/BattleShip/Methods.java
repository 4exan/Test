package BattleShip;

import java.util.Scanner;
import java.util.concurrent.ExecutionException;

public class Methods {

    static public void ShowGround(char[][] ground) {
        for (int i = 0; i < ground.length; i++) {
            System.out.println(" ");
            for (int j = 0; j < ground.length; j++) {
                System.out.print(ground[i][j] + " ");
            }
        }
    }

    static public void GroundBuild(char[][] ground) {
        Scanner scn = new Scanner(System.in);


        for (int i = 0; i < ground.length; i++) {
            for (int j = 0; j < ground.length; j++) {
                ground[i][j] = '~';
            }
        }
        char[][] ground2 = new char[10][10];
        int posX = 0;
        int posY = 0;
        int rotate;
        int shipCount1 = 0, shipCount2 = 0, shipCount3 = 0, shipCount4 = 0;
        int shipCount1max = 4, shipCount2max = 3, shipCount3max = 2, shipCount4max = 1;

        for (int i = shipCount1; i < shipCount1max; i++) {
            do {                                                                        //Ставим однопалубные
                System.out.println("\nWhere you wanna place your 1x1 ship? ( [] - horizontal, [] - vertical) Already placed: " + shipCount1 + " of 4");
                if (!scn.hasNextInt()) {
                    System.err.println("Enter number between 0 and 9");
                }
                posX = scn.nextInt() ;
                if (posX > 9 || posX < 0) {
                    System.err.println("Enter number between 0 and 9");
                    posX = 0;
                }
            } while (posX == 0);
            if (!scn.hasNextInt()) {
                System.err.println("Enter number between 0 and 9");
            }
            posY = scn.nextInt() ;
            if (posY > 9 || posY < 0) {
                System.err.println("Enter number between 0 and 9");
                posY = 0;
            }

            while (posY == 0) ;
            ground[posY][posX] = '*';
            shipCount1++;
        }
        ShowGround(ground);

        for (int i = shipCount2; i < shipCount2max; i++) {
            do {                                                                        //Ставим 2p
                System.out.println("\nWhere you wanna place your 1x1 ship? ( [] - horizontal, [] - vertical) Already placed: " + shipCount2 + " of 3");
                if (!scn.hasNextInt()) {
                    System.err.println("Enter number between 0 and 9");
                }
                posX = scn.nextInt();
                if (posX > 9 || posX < 0) {
                    System.err.println("Enter number between 0 and 9");
                    posX = 0;
                }
            } while (posX == 0);
            if (!scn.hasNextInt()) {
                System.err.println("Enter number between 0 and 9");
            }
            posY = scn.nextInt();
            if (posY > 9 || posY < 0) {
                System.err.println("Enter number between 0 and 9");
                posY = 0;
            }

            while (posY == 0) ;
            ground[posY][posX] = '#';
            do{
            System.out.println("Which side rotate? 4 - left; 2 - down; 6 - right; 8 - up: ");
            if(!scn.hasNextInt()) {
                System.err.println("Enter 2, 4, 6, 8!");
            }
            rotate = scn.nextInt();
            switch (rotate){
                case 2 : ground[posY + 1][posX] = '#';
                    break;
                case 4 : ground[posY][posX - 1] = '#';
                    break;
                case 6 : ground[posY][posX + 1] = '#';
                    break;
                case 8 : ground[posY - 1][posX] = '#';
                    break;
                default :
                    System.err.println("Enter correct number!");
            }
            }while( rotate != 2 && rotate != 4 && rotate != 8 && rotate != 6);
            shipCount1++;
            ShowGround(ground);
        }
    }
}