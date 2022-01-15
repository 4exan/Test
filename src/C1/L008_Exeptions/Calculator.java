package C1.L008_Exeptions;

import java.util.Scanner;

public class Calculator {

    Scanner scn = new Scanner(System.in);

    void add(int a, int b){
        System.out.println(a+b);
    }
    void sub(int a, int b){
        System.out.println(a-b);
    }
    void mul(int a, int b){
        System.out.println(a*b);
    }
    void div(int a, int b){
        try{
            if(b == 0){
                throw new Exception("/ by 0");
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            System.out.println("Try enter another number: ");
            b = scn.nextInt();
        }
        System.out.println(a/b);
    }
}

