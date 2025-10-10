
package jovemprogramadorajava;

import java.util.Scanner;


public class media {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        double nota1, nota2, nota3, media;
     
        
        System.out.println("DIGITE A PRIMEIRA NOTA");
        nota1 = scan.nextDouble();
        
        System.out.println("DIGITE A SEGUNDA NOTA");
        nota2 = scan.nextDouble();
        
        System.out.println("DIGITE A TERCEIRA NOTA");
        nota3 = scan.nextDouble();
        
        media = (nota1 + nota2 + nota3) / 3;
                
         System.out.println("A MEDIA DAS NOTAS EH: " + media);
    }
    
}
