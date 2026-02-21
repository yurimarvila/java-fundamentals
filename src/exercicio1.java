import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // codigo padrão para capitura do teclado

        // Lendo uma string - pegando a informação (system.out)
        System.out.print("Digite seu nome: ");
        String name = scanner.nextLine(); // ler linhas inteiras (scanner.nextLine)
        System.out.println("Prazer... " + name);
        // ler numeros inteiros (int / scanner.nextInt)

        System.out.println("Obrigado pelas informação! Mas agora me responda");

        try {

            System.out.print("Digite um numero inteiro: ");

            if (!scanner.hasNextInt()) { // se o usuario digitar algo que não seja um numero inteiro, o programa vai
                                         // pedir para digitar novamente
                System.out.println("Informaçoes invalidas. Digite numero valido!");
                scanner.next();

                System.out.print("Digite um numero inteiro: ");

            }

            int numinteiro = scanner.nextInt(); //
            String resultado = "Esse número é ";

            if (numinteiro > 0)
                resultado += "Positivo e ";

            else if (numinteiro < 0)
                resultado += "Negativo e ";

            else
                resultado += "Zero e ";

            if (numinteiro % 2 == 0)
                resultado += "é par";

            else
                resultado += "é impar";

            if (numinteiro % 3 == 0)
                resultado += ", é divisivel por 3";

            else
                resultado += ", não é divisivel por 3";

            System.out.println(resultado);
        } finally {
        }

        scanner.close();
    }

}