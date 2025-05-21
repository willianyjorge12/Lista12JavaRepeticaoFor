package exerciciosLista12;
import java.util.Scanner;
public class Ex06 {
	   public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        int soma = 0;
	        int contador = 0;

	        while (true) {
	            System.out.print("Digite um número (negativo para parar): ");
	            int num = scanner.nextInt();

	            if (num < 0) {
	                break;
	            }

	            soma += num;
	            contador++;
	        }

	        if (contador > 0) {
	            double media = (double) soma / contador;
	            System.out.println("A média aritmética dos números digitados é: " + media);
	        } else {
	            System.out.println("Nenhum número válido foi digitado.");
	        }

	        scanner.close();
	    }
}
