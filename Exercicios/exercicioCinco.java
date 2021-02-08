package Exercicios;

import java.util.Scanner;

public class exercicioCinco {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int A, B, C, D, dif;

        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        D = sc.nextInt();

        dif = A * B - C * D;

        System.out.println("DIFERENÇA = " + dif);

        sc.close();
    }
}
