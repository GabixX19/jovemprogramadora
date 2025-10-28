
package jovemprogramadorajava;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class sorteionovo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random gerador = new Random();
        ArrayList<String> alunas = new ArrayList<>();

int numeroAleatorio, opcao = 0;

while (opcao != 3) {
    System.out.println("DIGITE A OPCAO DESEJADA");
System. out.println ("1 - ADICIONAR PESSOA NO SORTEIO");
System. out.println ("2 - EXECUTAR SORTEIO");
System. out.println ("3 - SAIR");

opcao = scan. nextInt ();
scan.nextLine();

switch (opcao) {
case 1:
String nomeAluna;
System.out.println ("DIGITE O NOME DA ALUNA");
nomeAluna = scan.nextLine();
alunas.add(nomeAluna);
break;

case 2:
numeroAleatorio = gerador.nextInt(alunas.size());
System.out.println("A ALUNA SORTEADA FOI A: " + alunas.get(numeroAleatorio));
break;

case 3:
System.out.println ("SBU SISTEM SERA ENCERRADO");
break;

default:
System.err. println ("OPCAO INVALIDA");
break;
    }}
}
}

