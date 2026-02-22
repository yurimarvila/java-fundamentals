import java.util.Scanner;

public class exercicio2_taboada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // codigo padrão para capitura do teclado

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

        scanner.close();
    }

}