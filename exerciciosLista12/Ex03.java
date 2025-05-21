package exerciciosLista12;
import java.util.Scanner;
public class Ex03 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite a quantidade de termos (N): ");
	        int n = scanner.nextInt();

	        System.out.println("Os primeiros " + n + " números triangulares são:");

	        for (int i = 1; i <= n; i++) {
	            int triangular = i * (i + 1) / 2;
	            System.out.print(triangular + " ");
	        }
	        System.out.println();

	        scanner.close();
	    }
}
