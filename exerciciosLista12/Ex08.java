package exerciciosLista12;
import java.util.Scanner;
public class Ex08 {
	   public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite o início do intervalo: ");
	        int inicio = scanner.nextInt();

	        System.out.print("Digite o fim do intervalo: ");
	        int fim = scanner.nextInt();

	        int somaTotal = 0;

	        for (int num = inicio; num <= fim; num++) {
	            if (num % 2 == 0) {
	                somaTotal += somaDigitos(num);
	            }
	        }

	        System.out.println("A soma dos dígitos de todos os números pares no intervalo é: " + somaTotal);

	        scanner.close();
	    }

	    // Função para somar os dígitos de um número
	    public static int somaDigitos(int numero) {
	        int soma = 0;
	        int n = Math.abs(numero); // para garantir que funciona com números negativos

	        while (n > 0) {
	            soma += n % 10;
	            n /= 10;
	        }

	        return soma;
	    }
}
