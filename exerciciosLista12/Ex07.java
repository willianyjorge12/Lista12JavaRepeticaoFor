package exerciciosLista12;
import java.util.Scanner;
public class Ex07 {
	   public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite o início do intervalo: ");
	        int inicio = scanner.nextInt();

	        System.out.print("Digite o fim do intervalo: ");
	        int fim = scanner.nextInt();

	        System.out.println("Números primos entre " + inicio + " e " + fim + ":");

	        for (int num = Math.max(inicio, 2); num <= fim; num++) {
	            if (ehPrimo(num)) {
	                System.out.print(num + " ");
	            }
	        }

	        System.out.println();
	        scanner.close();
	    }

	    public static boolean ehPrimo(int n) {
	        if (n < 2) return false;

	        for (int i = 2; i <= Math.sqrt(n); i++) {
	            if (n % i == 0) {
	                return false;
	            }
	        }

	        return true;
	    }
}
