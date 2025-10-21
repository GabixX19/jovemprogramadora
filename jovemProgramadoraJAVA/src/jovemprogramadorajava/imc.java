
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
 
        imc = peso / (altura * altura);
        
        System.out.println("SEU IMC CALCULADO EH: " + imc);
        if (sexo == 'H' || sexo == 'h') {
            
            if (imc > 39.0) {
                System.out.println("SEU INDICE EH OBESIDADE MORBITAQA");
            }
        }
    }
    
}
