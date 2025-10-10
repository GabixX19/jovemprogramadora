
package jovemprogramadorajava;

import java.util.Scanner;


public class nome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String nome;
        int idade;
         
        System.out.println("Qual o seu nome");
        nome = scan.nextLine();
                
        System.out.println("Qual sua idade? ");
        idade = scan.nextInt();
        
        System.out.println("Seu nome eh " + nome + ", e sua idade eh " + idade + " anos");
    }
}
