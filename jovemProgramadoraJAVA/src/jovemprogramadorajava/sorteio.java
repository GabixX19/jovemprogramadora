
package jovemprogramadorajava;

import java.util.Random;
import java.util.Scanner;


public class sorteio {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
                
        Random gerador = new Random();
        String[] alunas = new String[9];
        int numeroAleatorio;
        
        alunas[0] = "GABRIELLE";
        alunas[1] = "SARA";
        alunas[2] = "MONIQUE";
 alunas[3] = "JULIANA";
 alunas[4] = "LAYSSA";
 alunas[5] = "LAYARA";
 alunas[6] = "LAURA";
 alunas[7] = "KEROLYN";
 alunas[8] = "MILENA";
 
 numeroAleatorio = gerador.nextInt(8);
        System.out.println("A SORTEADA FOI: " + alunas[numeroAleatorio]);
    }
}
