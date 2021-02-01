import java.util.Scanner;

public class EntradaDeDadosParteDois {

    public static void main(String[] args) {
        
        //declarando o scanner
        Scanner sc = new Scanner(System.in);

        //declarando as variáveis
        String s1, s2, s3;

        //nextline pega a palavra digitada usando o enter
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();

        System.out.println("Dados digitados:");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        //fechando o scanner
        sc.close();
    }
    
}
