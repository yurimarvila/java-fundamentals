import java.util.Scanner;

public class Exercicio6_Calculadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // codigo padrão para capitura do teclado

        System.out.println("Bem vindo à calculatora!");

        while (true) {
            System.out.println("\n" + "Escolha a operação desejada:");
            System.out.println("1 - Adição");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println("0 - Sair");
            System.out.print("Digite a opção desejada: ");
            int opcao = scanner.nextInt();

            switch (opcao) { // Exibe a operação escolhida pelo usuário
                case 1:
                    System.out.println("Você escolheu Adição");
                    break;
                case 2:
                    System.out.println("Você escolheu Subtração");
                    break;
                case 3:
                    System.out.println("Você escolheu Multiplicação");
                    break;
                case 4:
                    System.out.println("Você escolheu Divisão");
                    break;
                case 0:
                    System.out.println("Saindo...");
                    scanner.close(); // Fecha o scanner antes de sair
                    return; // Encerra o programa

                default:
                    System.out.println("Opção inválida!");
                    break;
            }

            System.out.print("Digite o primeiro numero: ");
            double num1 = scanner.nextDouble();

            System.out.print("Digite o segundo numero: ");
            double num2 = scanner.nextDouble();

            double resultado = 0;

            switch (opcao) { // Realiza a operação escolhida pelo usuário
                case 1:
                    resultado = num1 + num2;
                    System.out.println("Resultado da adição: " + resultado);
                    break;

                case 2:
                    resultado = num1 - num2;
                    System.out.println("Resultado da subtração: " + resultado);
                    break;

                case 3:
                    resultado = num1 * num2;
                    System.out.println("Resultado da multiplicação: " + resultado);
                    break;

                case 4:
                    if (num2 != 0) {
                        resultado = num1 / num2;
                        System.out.println("Resultado da divisão: " + resultado);
                    } else {
                        System.out.println("Erro: Divisão por zero não é permitida!");
                    }

                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
    }
}
