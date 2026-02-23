import java.util.Scanner;

public class Menu_principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // codigo padrão para capitura do teclado

        while (true) {
            System.out.println("=== MENU PRINCIPAL ===");
            System.out.println("1 - Verificador de número");
            System.out.println("2 - Tabuada personalizada");
            System.out.println("3 - Analisador de senha");
            System.out.println("4 - Conversor de temperatura");
            System.out.println("5 - Jogo de adivinhação");
            System.out.println("6 - Calculadora");
            System.out.println("7 - Agenda de contatos");
            System.out.println("8 - Analisador de texto");
            System.out.println("9 - Carrinho de compras");
            System.out.println("0 - Sair");

            System.out.print("Digite a opção desejada: ");
            int opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    Numeros.executar(sc);
                    break;
                case 2:
                    Taboada.executar(sc);
                    break;
                case 3:
                    Seguranca_Senha.executar(sc);
                    break;
                case 4:
                    Temperatura.executar(sc);
                    break;
                case 5:
                    Adivinhacao.executar(sc);
                    break;
                case 6:
                    Calculadora.executar(sc);
                    break;
                case 7:
                    Agenda_de_contato.executar(sc);
                    break;
                case 8:
                    Analisador_de_texto.executar(sc);
                    break;
                case 9:
                    Carrinho_de_compra.executar(sc);
                    break;
                case 0:
                    System.out.println("Saindo...");
                    sc.close();
                    return; // Encerra o programa

                default:
                    System.out.println("Opção inválida! Por favor, escolha uma opção válida.");
            }
        }
    }
}