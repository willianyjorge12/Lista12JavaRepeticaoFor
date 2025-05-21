package exerciciosLista12;
import java.util.Scanner;
public class Ex05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int num = scanner.nextInt();

        if (num <= 0) {
            System.out.println("Por favor, digite um número positivo.");
        } else {
            int somaDivisores = 0;
            for (int i = 1; i <= num / 2; i++) {
                if (num % i == 0) {
                    somaDivisores += i;
                }
            }

            if (somaDivisores == num) {
                System.out.println(num + " é um número perfeito.");
            } else {
                System.out.println(num + " não é um número perfeito.");
            }
        }

        scanner.close();
    }

}
