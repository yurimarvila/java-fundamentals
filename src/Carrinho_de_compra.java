import java.util.Scanner;
import java.util.ArrayList;

public class Carrinho_de_compra {
    public static void executar(Scanner sc) {
        ArrayList<String> carrinho = new ArrayList<>(); // criando uma lista para armazenar os itens do carrinho

        System.out.println("Bem-vindo ao carrinho de compras!");

        // 1 - Adicionar produto (nome e preço)
        // 2 - Listar produtos
        // 3 - Ver total
        // 4 - Aplicar desconto (%)
        // 0 - Finalizar compra

        while (true) {
            System.out.println("\n" + "Escolha uma opção:");
            System.out.println("1 - Adicionar produto (nome e preço)");
            System.out.println("2 - Listar produtos");
            System.out.println("3 - Ver total");
            System.out.println("4 - Aplicar desconto (%)");
            System.out.println("0 - Finalizar compra");

            System.out.print("Digite a opção desejada: ");
            int opcao = sc.nextInt(); // Lê a opção escolhida pelo usuário
            sc.nextLine(); // Limpa o buffer do scanner

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do produto: ");
                    String nome = sc.nextLine();
                    System.out.print("Digite o preço do produto: ");
                    double preco = sc.nextDouble();
                    sc.nextLine(); // Limpa o buffer do scanner
                    carrinho.add(nome + " - R$ " + preco); // Adiciona o produto ao carrinho
                    System.out.println("Produto adicionado com sucesso!" + "\n");
                    break;

                case 2:
                    System.out.println("Produtos no carrinho:");
                    for (String produto : carrinho) {
                        System.out.println(produto);
                    }
                    break;

                case 3:
                    double total = 0;
                    for (String produto : carrinho) {
                        String[] partes = produto.split(" - R\\$ ");
                        total += Double.parseDouble(partes[1]);
                    }
                    System.out.println("Total: R$ " + total);
                    break;

                case 4:
                    System.out.print("Digite o percentual de desconto: ");
                    double desconto = sc.nextDouble();
                    sc.nextLine(); // Limpa o buffer do scanner
                    double totalComDesconto = 0;
                    for (String produto : carrinho) {
                        String[] partes = produto.split(" - R\\$ ");
                        double precoProduto = Double.parseDouble(partes[1]);
                        totalComDesconto += precoProduto * (1 - desconto / 100);
                    }
                    System.out.println("Total com desconto: R$ " + totalComDesconto);
                    break;

                case 0:
                    System.out.println("Finalizando compra...");
                    sc.close(); // Fecha o scanner antes de sair
                    return; // Encerra o programa

                default:
                    System.out.println("Opção inválida. Por favor, tente novamente.");
            }
        }
    }
}