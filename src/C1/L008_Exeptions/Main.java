package C1.L008_Exeptions;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);
        int a = 0, b = 0;
        int val;

        System.out.println("Enter first number: ");
        if(scn.hasNextInt()) {
            a = scn.nextInt();
        } else {
            System.out.println("Вы ввели не целое число");
        }
        System.out.println("Enter second number: ");
        b = scn.nextInt();
        System.out.println("Enter symbol: ");
        val = scn.nextInt();

        Calculator calculator = new Calculator();

        switch(val){
            case 1 : calculator.add(a, b);
            break;
            case 2 : calculator.sub(a, b);
            break;
            case 3 : calculator.mul(a, b);
            break;
            case 4 : calculator.div(a, b);
            break;
        }

    }
}
