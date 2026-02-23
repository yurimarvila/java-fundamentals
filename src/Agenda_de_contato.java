import java.util.ArrayList;
import java.util.Scanner;

public class Agenda_de_contato {
    public static void executar(Scanner scanner) {
        ArrayList<String> contatos = new ArrayList<>(); // Cria uma lista para armazenar os contatos

        System.out.println("Bem-vindo à Agenda de Contatos!");

        while (true) {
            System.out.println("\n" + "Escolha uma opção:");
            System.out.println("1 - Adicionar contato (nome e telefone)");
            System.out.println("2 - Buscar contato por nome");
            System.out.println("3 - Listar todos os contatos");
            System.out.println("0 - Sair");

            System.out.print("Digite a opção desejada: ");
            int opcao = scanner.nextInt(); // Lê a opção escolhida pelo usuário
            scanner.nextLine(); // Limpa o buffer do scanner

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do contato: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite o telefone do contato: ");
                    String telefone = scanner.nextLine();
                    contatos.add(nome + " - " + telefone);// Adiciona o contato à lista
                    System.out.println("Contato adicionado com sucesso!" + "\n");
                    break;

                case 2:
                    System.out.print("Digite o nome do contato que deseja buscar: ");
                    String nomebuscado = scanner.nextLine();
                    boolean encontrado = false; // Variável para verificar se o contato foi encontrado

                    for (String contato : contatos) { // Percorre a lista de contatos
                        if (contato.toLowerCase().contains(nomebuscado.toLowerCase())) { // Verifica se o contato contém o nome buscado (ignora maiúsculas/minúsculas)
                            System.out.println("Contato encontrado: " + contato);
                            encontrado = true; // Define encontrado como true se o contato for encontrado
                            break;
                        }
                    }
                    if (!encontrado) {// Se o contato não for encontrado, exibe uma mensagem
                        System.out.println("Contato não encontrado.");
                    }
                    break;

                case 3:
                    System.out.println("Lista de contatos:");
                    for (String contato : contatos) {
                        System.out.println(contato);
                    }
                    break;

                case 0:
                    System.out.println("Saindo...");
                    scanner.close(); // Fecha o scanner antes de sair
                    return; // Encerra o programa

                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
    }
}