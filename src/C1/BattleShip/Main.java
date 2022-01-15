package C1.BattleShip;

import java.util.Scanner;

import static C1.BattleShip.Methods.GroundBuild;

public class Main {


    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        char[][] ground1 = new char[10][10];

        GroundBuild(ground1);

        System.out.println("\n\nInvite second player, and let him build his ground (press *Enter* when ready)");

        char[][] ground2 = new char[10][10];

        GroundBuild(ground2);

    }
}
