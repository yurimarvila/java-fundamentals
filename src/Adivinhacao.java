import java.util.Random;
import java.util.Scanner;

public class Adivinhacao {
    private static Random geracaoRandom = new Random();

    public static void executar(Scanner scanner) {

        int numeroSorteado = geracaoRandom.nextInt(100) + 1; // 1 a 100
        int tentativas = 0;

        System.out.println("Bem-vindo ao jogo de adivinhação! Tente adivinhar o número entre 1 e 100.");

        while (true) {
            System.out.print("Digite um numero de 0 a 100: ");
            int chute = scanner.nextInt();
            tentativas++;

            if (chute < numeroSorteado) {
                System.out.println("Muito baixo! Tente novamente.");
            } else if (chute > numeroSorteado) {
                System.out.println("Muito alto! Tente novamente.");
            } else {
                System.out.println("Parabéns! Você acertou o número em " + tentativas + " tentativas.");
                break;
            }
        }
    }
}