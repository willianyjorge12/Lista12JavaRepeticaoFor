package exerciciosLista12;
import java.util.Scanner;
public class Ex01 {
	   public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite uma palavra ou frase: ");
	        String texto = scanner.nextLine();

	        System.out.print("Texto invertido: ");
	        for (int i = texto.length() - 1; i >= 0; i--) {
	            System.out.print(texto.charAt(i));
	        }
	        System.out.println();

	        scanner.close();
	    }
}
