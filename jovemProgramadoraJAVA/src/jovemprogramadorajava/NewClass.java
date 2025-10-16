
package jovemprogramadorajava;

import java.util.Scanner;

public class NewClass {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int numero1, numero2;
        
        System.out.println("QUAL O PRIMEIRO NUMERO?");
        numero1 = scan.nextInt();
        
        System.out.println("QUAL O SEGUNDO NUMERO");
        numero2 = scan.nextInt();
        
        if (numero1 == numero2) {
        System.out.println("O numero " + numero1 + " eh maior que o numero " + numero2);
    } else if (numero1 > numero2) {
    System.out.println("O numero " + numero2 + " eh maior do que o numero" + numero1);
    } else {
            System.out.println("O numero " + numero1 + " eh igual ao numero " + numero2); }
     }
    
}
