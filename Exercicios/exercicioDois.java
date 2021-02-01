package Exercicios;

import java.util.Scanner;

public class exercicioDois {
    
    public static void main(String[] args) {
        
        /*
        Fazer um programa para ler as medidas da largura e comprimento de um terreno retangular 
        com uma casa decimal, bem como o valor do metro quadrado do terreno co, duas casas decimais.
        Em seguida, o programa deve mostrar o valor da área do terreno, 
        bem como o valor do preço de terreno ambas com duas casas decimais, conforme o exemplo:

        Exemplo:
        |-----------------------------|
        |Entrada:   | Saída:          |
        |-----------|-----------------|
        |10.0       |AREA = 300.00    |
        |30.0       |PREÇO = 60000.00 |
        |200.00     |                 |
        |___________|_________________|
        */

        Scanner sc = new Scanner(System.in);

        double largura = sc.nextDouble();
        double comprimento = sc.nextDouble();
        double metroQuadrado = sc.nextDouble();

        double area = largura * comprimento;
        double preco = area * metroQuadrado;

        System.out.println("AREA = " + area);
        System.out.println("PREÇO = " + preco);

        sc.close();
    }
}
