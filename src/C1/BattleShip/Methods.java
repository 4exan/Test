package C1.BattleShip;

import java.util.Scanner;

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
        int posX = 0;
        int posY = 0;
        int rotate;
        int shipCount1 = 0, shipCount2 = 0, shipCount3 = 0, shipCount4 = 0;
        int shipCount1max = 4, shipCount2max = 3, shipCount3max = 2, shipCount4max = 1;

        for (int i = shipCount1; i < shipCount1max; i++) {
            System.out.println("\nWhere you wanna place your 1x1 ship? ( [] - horizontal, [] - vertical) Already placed: " + shipCount1 + " of 4");
            if (!scn.hasNextInt()) {
                System.err.println("Enter only numbers!");
                GroundBuild(ground);
            }
            if (scn.nextInt() > 9 || scn.nextInt() < 0) {
                System.err.println("Number must be between 0 and 9");
                GroundBuild(ground);
            }
            posX = scn.nextInt();
            if (!scn.hasNextInt()) {
                System.err.println("Enter only numbers!");
                GroundBuild(ground);
            }
            if (scn.nextInt() > 9 || scn.nextInt() < 0) {
                System.err.println("Number must be between 0 and 9");
                GroundBuild(ground);
            }
                posY = scn.nextInt();
                ground[posY][posX] = '*';
                shipCount1++;
                ShowGround(ground);

            for (int i1 = shipCount2; i1 < shipCount2max; i1++) {                                    //Ставим двухпалубные
                System.out.println("\nWhere you wanna place your 1x2 ship? ( [] - horizontal, [] - vertical) Already placed: " + shipCount2 + " of 3");
                posX = scn.nextInt();
                posY = scn.nextInt();
                ground[posY][posX] = '#';
                System.out.println("How rotate? (Horizontal left - 4, Horizontal right - 6, Vertical up - 8, Vertical down - 2");
                rotate = scn.nextInt();
                switch (rotate) {
                    case 4:
                        ground[posY][posX - 1] = '#';
                        break;
                    case 6:
                        ground[posY][posX + 1] = '#';
                        break;
                    case 8:
                        ground[posY - 1][posX] = '#';
                        break;
                    case 2:
                        ground[posY + 1][posX] = '#';
                        break;
                }
                ShowGround(ground);
            }
            for (int i2 = shipCount3; i2 < shipCount3max; i2++) {
                System.out.println("\nWhere you wanna place your 1x3 ship? ( [] - horizontal, [] - vertical) Already placed: " + shipCount3 + " of 2");
                posX = scn.nextInt();
                posY = scn.nextInt();
                ground[posY][posX] = '$';
                System.out.println("How rotate? (Horizontal left - 4, Horizontal right - 6, Vertical up - 8, Vertical down - 2");
                rotate = scn.nextInt();
                switch (rotate) {
                    case 4:
                        ground[posY][posX - 1] = '$';
                        ground[posY][posX - 2] = '$';
                        break;
                    case 6:
                        ground[posY][posX + 1] = '$';
                        ground[posY][posX + 2] = '$';
                        break;
                    case 8:
                        ground[posY - 1][posX] = '$';
                        ground[posY - 2][posX] = '$';
                        break;
                    case 2:
                        ground[posY + 1][posX] = '$';
                        ground[posY + 2][posX] = '$';
                        break;
                }
                ShowGround(ground);
            }
            for (int i3 = shipCount4; i3 < shipCount4max; i3++) {
                System.out.println("\nWhere you wanna place your 1x3 ship? ( [] - horizontal, [] - vertical) Already placed: " + shipCount4 + " of 1");
                posX = scn.nextInt();
                posY = scn.nextInt();
                ground[posY][posX] = '@';
                System.out.println("How rotate? (Horizontal left - 4, Horizontal right - 6, Vertical up - 8, Vertical down - 2");
                rotate = scn.nextInt();
                switch (rotate) {
                    case 4:
                        ground[posY][posX - 1] = '@';
                        ground[posY][posX - 2] = '@';
                        ground[posY][posX - 3] = '@';
                        break;
                    case 6:
                        ground[posY][posX + 1] = '@';
                        ground[posY][posX + 2] = '@';
                        ground[posY][posX + 3] = '@';
                        break;
                    case 8:
                        ground[posY - 1][posX] = '@';
                        ground[posY - 2][posX] = '@';
                        ground[posY - 3][posX] = '@';
                        break;
                    case 2:
                        ground[posY + 1][posX] = '@';
                        ground[posY + 2][posX] = '@';
                        ground[posY + 3][posX] = '@';
                        break;
                }
                ShowGround(ground);
            }
        }
    }
}


