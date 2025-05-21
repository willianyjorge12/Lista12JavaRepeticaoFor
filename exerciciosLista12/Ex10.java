package exerciciosLista12;
import java.util.Scanner;
public class Ex10 {
	  public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite um número inteiro: ");
	        String numero = scanner.nextLine();

	        int contadorZeros = 0;

	        for (int i = 0; i < numero.length(); i++) {
	            if (numero.charAt(i) == '0') {
	                contadorZeros++;
	            }
	        }

	        System.out.println("O número digitado possui " + contadorZeros + " dígito(s) zero.");

	        scanner.close();
	    }
}
