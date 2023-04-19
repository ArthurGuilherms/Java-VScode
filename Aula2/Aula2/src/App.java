import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        double preco1 = 0.30;
        double preco2 = 0.25;

        System.out.print("Quantas maçãs você deseja comprar?");
        try (Scanner entrada = new Scanner(System.in)) {
            int maçãs = entrada.nextInt();

            if (maçãs < 12) {
                double valorfinal = maçãs * preco1;
                System.out.print("Você comprou " + maçãs + " maçãs pelo preço de " + valorfinal + " reais.");
            }

            else {
                double valorfinal = maçãs * preco2;
                System.out.print("Você comprou " + maçãs + " maçãs pelo preço de " + valorfinal + " reais.");
            }
        }

    }
}
