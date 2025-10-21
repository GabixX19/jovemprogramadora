
package jovemprogramadorajava;

import java.util.Scanner;

public class desafiojavafunçoes {
    public static void main(String[] args) {
        Scanner scan = new Scanner ( System.in );
        
        int num1, num2;
       int multi;
       
        System.out.println("QUAL O PRIMEIRO NUMERO?");
        num1 = scan.nextInt();
                
        System.out.println("QUAL O SEGUNDO NUMERO?");
        num2 = scan.nextInt();
        
        multi = multiDoisNumeros(num1, num2);
        System.out.println("Resultado da multi: " + multi);
    }
    
    private static  int multiDoisNumeros(int num1, int num2){
        int resultado;
                
                resultado = num1 * num2;
                return resultado;
    }
}
