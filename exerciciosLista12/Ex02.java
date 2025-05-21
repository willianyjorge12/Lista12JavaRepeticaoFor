package exerciciosLista12;
import java.util.Scanner;
public class Ex02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        int soma = 0;
        int valor = Math.abs(numero); // para lidar com números negativos

        while (valor > 0) {
            soma += valor % 10;  // pega o último dígito
            valor /= 10;         // remove o último dígito
        }

        System.out.println("A soma dos dígitos do número é: " + soma);

        scanner.close();
    }

}
