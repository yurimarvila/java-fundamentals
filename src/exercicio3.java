import java.util.Scanner;

public class Exercicio3SegSenha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // codigo padrão para capitura do teclado

            System.out.print("Digite uma senha:");
            String password = scanner.nextLine();

            String mensagemErro = null; // Armazena a mensagem de erro, se houver

            while (true) { // Loop para validar a senha até que seja forte
                
            // Verificações
            if (password.length() < 8) { // Verifica se a senha tem pelo menos 8 caracteres
                mensagemErro = "Senha fraca! A senha deve conter no mínimo 8 caracteres.";
            } else if (!password.matches(".*[A-Z].*")) { // Verifica se a senha contém pelo menos uma letra maiúscula
                mensagemErro = "Senha fraca! A senha deve conter pelo menos uma letra maiúscula.";
            } else if (!password.matches(".*[a-z].*")) { // Verifica se a senha contém pelo menos uma letra minúscula
                mensagemErro = "Senha fraca! A senha deve conter pelo menos uma letra minúscula.";
            } else if (!password.matches(".*\\d.*")) { // Verifica se a senha contém pelo menos um número
                mensagemErro = "Senha fraca! A senha deve conter pelo menos um número.";
            } else if (!password.matches(".*[!@#$%^&*()].*")) { // Verifica se a senha contém pelo menos um caractere especial
                mensagemErro = "Senha fraca! A senha deve conter pelo menos um caractere especial.";
            }

            // Exibe resultado
            if (mensagemErro != null) { 
                System.out.println(mensagemErro);
                System.out.print("Tente novamente: ");
                password = scanner.nextLine();
            } else {
                System.out.println("Tamanho: OK"+"\n"+"Número: OK"+"\n"+"Maiúscula: OK"+"\n"+"Senha forte: OK");
                break;
            }
        }

        scanner.close();
    }
}