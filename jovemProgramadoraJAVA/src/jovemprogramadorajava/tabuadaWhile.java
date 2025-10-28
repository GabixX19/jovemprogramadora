
package jovemprogramadorajava;

import java.util.Scanner;

public class tabuadaWhile {
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         int numero, tamanho,contador = 0;
         
         System.out.println("QUAL TABUADA VC QUER");
         numero = scan.nextInt();
         
         System.out.println("DIGITE O TAMANHO DA SUA TABUADA");
         tamanho = scan.nextInt();
         
         while (contador <= tamanho) {
             System.out.println(numero + " x " + contador + " = " + (contador * numero));
             contador++;
         }
    }

}
