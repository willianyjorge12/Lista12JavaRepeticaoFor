package exerciciosLista12;
import java.util.Scanner;
public class Ex04 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Quantos números você vai digitar? ");
	        int quantidade = scanner.nextInt();

	        int contadorPares = 0;
	        int contadorImpares = 0;

	        for (int i = 1; i <= quantidade; i++) {
	            System.out.print("Digite o número " + i + ": ");
	            int num = scanner.nextInt();

	            if (num % 2 == 0) {
	                contadorPares++;
	            } else {
	                contadorImpares++;
	            }
	        }

	        System.out.println("Quantidade de números pares: " + contadorPares);
	        System.out.println("Quantidade de números ímpares: " + contadorImpares);

	        scanner.close();
	    }
}
