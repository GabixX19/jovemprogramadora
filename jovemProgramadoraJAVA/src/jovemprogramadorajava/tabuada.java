
package jovemprogramadorajava;

import java.util.Scanner;


public class tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero;
        System.out.println("DIGITE O NUMERO QUE VC DESEJA MONTAR A TABUADA");
        numero = scan.nextInt();
        
        for(int i = 1; i <= 10; i++){
            System.out.println(numero * i);
        }
    }
}
