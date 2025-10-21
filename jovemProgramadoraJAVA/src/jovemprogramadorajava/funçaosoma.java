
package jovemprogramadorajava;


public class funçaosoma {
    public static void main(String[] args) {
        int numero1 = 10;
        int numero2 = 20;
        int soma;
        
        soma = SomaDoisNumeros (numero1, numero2);
        
        System.out.println("Resultado da soma: " + soma);
    }
    
    private static int SomaDoisNumeros(int num1, int num2) {
        int resultado;
        
        resultado = num1 + num2;
        return resultado;
        
    }
}
