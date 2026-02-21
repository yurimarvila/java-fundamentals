import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // codigo padrão para capitura do teclado

        try {
            System.out.print("Digite á temperatura atual em Celsius: ");

            if (!scanner.hasNextDouble()) { // se o usuario digitar algo que não seja um numero inteiro, o programa vai
                // pedir para digitar novamente
                System.out.println("Informaçoes invalidas. Digite numero valido!");
                scanner.next();

                System.out.print("Digite á temperatura atual em Celsius: ");

            }

            double temperatura = scanner.nextDouble();

            double tempfarenheit = (temperatura * 9.0 / 5.0) + 32.0; // fórmula de conversão de Celsius para Farenheit
            System.out.println("Temperatura em Farenheit: " + tempfarenheit + "°F");

            double tempkelvin = temperatura + 273.15; // fórmula de conversão de Celsius para Kelvin
            System.out.println("Temperatura em Kelvin: " + tempkelvin + "K");

            scanner.close();

        } finally {
            scanner.close();
        }
    }
}