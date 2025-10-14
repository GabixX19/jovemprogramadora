
package jovemprogramadorajava;

import java.util.Scanner;


public class imparPar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero;
        
        System.out.println("DIGITE QUAL O NUMERO QUE VOCE QUER VERIFICAR");
        numero = scan.nextInt();
        
        if(numero % 2 == 0){
            System.out.println("SEU NUMERO EH PAR");
        }
        else{
            System.out.println("SEU NUMERO EH IMPAR");
        }
    }
    
}
