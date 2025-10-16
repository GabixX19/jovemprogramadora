
package jovemprogramadorajava;

import java.util.Scanner;

public class imc {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        double peso, altura, imc;
        char sexo;
        
        System.out.println("QUAL O SEU PESO?");
        peso = scan.nextDouble();
        
        System.out.println("QUAL SUA ALTURA?");
        altura = scan.nextDouble();
        
        System.out.println("QUAL O SEU GENERO - H PARA HOMEM E M PARA MULHER");
        sexo = scan.next().charAt(0);
        
        if(sexo != 'h' || sexo != 'm');
        System.err.println("VOCE DIGITOU UM SEXO INVALIDO");
        System.exit(0);
    }
    
}
