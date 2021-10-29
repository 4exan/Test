package BattleShip;

import java.util.Scanner;
import java.util.concurrent.ExecutionException;

public class Methods {

    static public void ShowGround(char[][] ground){
        for(int i = 0; i < ground.length; i++){
            System.out.println(" ");
            for(int j = 0; j < ground.length; j++){
                System.out.print(ground[i][j] + " ");
            }
        }
    }

    static public void GroundBuild(char[][] ground){
        Scanner scn = new Scanner(System.in);


        for(int i = 0; i < ground.length; i++){
            for(int j = 0; j < ground.length; j++){
                ground[i][j] = '~';
            }
        }
        char[][] ground2 = new char[10][10];
        int posX = 0;
        int posY = 0;
        int rotate;
        int shipCount1 = 0, shipCount2 = 0, shipCount3 = 0, shipCount4 = 0;
        int shipCount1max = 4, shipCount2max = 3, shipCount3max = 2, shipCount4max = 1;

        for(int i = shipCount1; i < shipCount1max; i++) {                                   //Ставим однопалубные
            System.out.println("\nWhere you wanna place your 1x1 ship? ( [] - horizontal, [] - vertical) Already placed: " + shipCount1 + " of 4");
            posX = scn.nextInt();
            posY = scn.nextInt();
            ground[posY][posX] = '*';
            shipCount1++;
            ShowGround(ground);
        }
        for(int i = shipCount2; i < shipCount2max; i++){                                    //Ставим двухпалубные
            System.out.println("\nWhere you wanna place your 1x2 ship? ( [] - horizontal, [] - vertical) Already placed: " + shipCount2 + " of 3");
            posX = scn.nextInt();
            posY = scn.nextInt();
            ground[posY][posX] = '#';
            System.out.println("How rotate? (Horizontal left - 4, Horizontal right - 6, Vertical up - 8, Vertical down - 2");
            rotate = scn.nextInt();
            switch(rotate){
                case 4 : ground[posY][posX-1] = '#';
                    break;
                case 6 : ground[posY][posX+1] = '#';
                    break;
                case 8 : ground[posY-1][posX] = '#';
                    break;
                case 2 : ground[posY+1][posX] = '#';
                    break;
            }
            ShowGround(ground);
        }
        for(int i = shipCount3; i < shipCount3max; i++){
            System.out.println("\nWhere you wanna place your 1x3 ship? ( [] - horizontal, [] - vertical) Already placed: " + shipCount3 + " of 2");
            posX = scn.nextInt();
            posY = scn.nextInt();
            ground[posY][posX] = '$';
            System.out.println("How rotate? (Horizontal left - 4, Horizontal right - 6, Vertical up - 8, Vertical down - 2");
            rotate = scn.nextInt();
            switch(rotate){
                case 4 : ground[posY][posX-1] = '$';
                    ground[posY][posX-2] = '$';
                    break;
                case 6 : ground[posY][posX+1] = '$';
                    ground[posY][posX+2] = '$';
                    break;
                case 8 : ground[posY-1][posX] = '$';
                    ground[posY-2][posX] = '$';
                    break;
                case 2 : ground[posY+1][posX] = '$';
                    ground[posY+2][posX] = '$';
                    break;
            }
            ShowGround(ground);
        }
        for(int i = shipCount4; i < shipCount4max; i++){
            System.out.println("\nWhere you wanna place your 1x3 ship? ( [] - horizontal, [] - vertical) Already placed: " + shipCount4 + " of 1");
            posX = scn.nextInt();
            posY = scn.nextInt();
            ground[posY][posX] = '@';
            System.out.println("How rotate? (Horizontal left - 4, Horizontal right - 6, Vertical up - 8, Vertical down - 2");
            rotate = scn.nextInt();
            switch(rotate){
                case 4 : ground[posY][posX-1] = '@';
                    ground[posY][posX-2] = '@';
                    ground[posY][posX-3] = '@';
                    break;
                case 6 : ground[posY][posX+1] = '@';
                    ground[posY][posX+2] = '@';
                    ground[posY][posX+3] = '@';
                    break;
                case 8 : ground[posY-1][posX] = '@';
                    ground[posY-2][posX] = '@';
                    ground[posY-3][posX] = '@';
                    break;
                case 2 : ground[posY+1][posX] = '@';
                    ground[posY+2][posX] = '@';
                    ground[posY+3][posX] = '@';
                    break;
            }
            ShowGround(ground);
        }
    }
    }


