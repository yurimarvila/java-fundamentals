import java.util.Scanner;

public class Analisador_de_texto {
    public static void executar(Scanner sc) {

        System.out.println("Bem-vindo ao Analisador de Texto!");

        while (true) {
            System.out.print("Digite um texto ou 'sair' para encerrar o programa: ");
            String texto = sc.nextLine();

            if (texto.equalsIgnoreCase("sair")) { // Verifica se o usuário digitou "sair" (ignorando
                // maiúsculas/minúsculas)
                System.out.println("Encerrando o programa...");
                break; // sai do loop
            }

            System.out.print("\n" + "Texto digitada: " + texto + "\n");

            System.out.print("Digite uma letra para contar quantas vezes ela aparece no texto: ");
            String letra = sc.nextLine();

            System.out.println("Analisando o texto...");
            System.out.println("Quantidade de palavras: " + texto.trim().split("\\s+").length); // Divide o texto em
                                                                                                // palavras usando
                                                                                                // espaços como
                                                                                                // delimitadores e conta
                                                                                                // o número de palavras
            System.out.println("Quantidade de caracteres (sem espaços): " + texto.replace(" ", "").length()); // Remove
                                                                                                              // os
                                                                                                              // espaços
                                                                                                              // do
                                                                                                              // texto e
                                                                                                              // conta o
                                                                                                              // número
                                                                                                              // de
                                                                                                              // caracteres

            String[] palavras = texto.trim().split("\\s+"); // Divide o texto em palavras usando espaços como
                                                            // delimitadores
            String palavraMaisLonga = palavras[0]; // Inicializa a palavra mais longa com a primeira palavra do texto
            for (String palavra : palavras) { // Percorre cada palavra do texto
                if (palavra.length() > palavraMaisLonga.length()) { // Compara o comprimento da palavra atual com a
                                                                    // palavra mais longa encontrada até agora
                    palavraMaisLonga = palavra; // Se a palavra atual for mais longa, atualiza a palavra mais longa
                }
            }
            System.out.println("Palavra mais longa: " + palavraMaisLonga);

            int contagem = 0;
            for (int i = 0; i < texto.length(); i++) {
                if (texto.charAt(i) == letra.charAt(0)) {
                    contagem++;
                }
            }
            System.out.println("A letra " + letra + " aparece " + contagem + " vezes no texto.");

        }
    }
}
