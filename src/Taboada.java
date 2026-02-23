import java.util.Scanner;

public class Taboada {
    public static void executar(Scanner scanner) {

        try {

            System.out.print("Digite um numero inteiro: ");

            if (!scanner.hasNextInt()) { // se o usuario digitar algo que não seja um numero inteiro, o programa vai
                                         // pedir para digitar novamente
                System.out.println("Informaçoes invalidas. Digite numero valido!");
                scanner.next();

                System.out.print("Digite um numero inteiro: ");

            }

            int numinteiro = scanner.nextInt(); //
            String tabuada = "Tabuada de 1 a 10 do " + numinteiro + "(Para números pares) é:";

            for (int i = 1; i <= 10; i++) {
                int resultadotaboada = numinteiro * i;
                if (resultadotaboada % 2 == 0) {
                    tabuada += "\n" + numinteiro + " x " + i + " = " + resultadotaboada;
                }
            }

            System.out.println(tabuada);
        } finally {
        }
    }

}