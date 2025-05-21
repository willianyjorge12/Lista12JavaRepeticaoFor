package exerciciosLista12;
import java.util.Scanner;
public class Ex09 {
	  public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Quantos números deseja inserir? ");
	        int n = scanner.nextInt();

	        int[] lista = new int[n];

	        System.out.println("Digite os números:");

	        for (int i = 0; i < n; i++) {
	            lista[i] = scanner.nextInt();
	        }

	        System.out.println("Elementos em ordem inversa:");

	        for (int i = n - 1; i >= 0; i--) {
	            System.out.print(lista[i] + " ");
	        }

	        System.out.println();

	        scanner.close();
	    }
}
