import java.util.Scanner;

public class Exercicio {
    public static void main (String[] args) {
        System.out.println("Qual nome? [sair]");
        Scanner scanner = new Scanner(System.in);
        String nome = scanner.nextLine();
        double alturaMAX = 0, alturaMin = 10000, alturaHomens = 0, media = 0, altura;
        int numeroMulheres = 0, numeroHomens = 0;

        while (!nome.equalsIgnoreCase("sair")) {
            System.out.println("Qual a altura?");
            altura = scanner.nextDouble();
            scanner.nextLine();

            alturaMAX = Math.max(alturaMAX, altura);
            alturaMin = Math.min(alturaMin, altura);

            System.out.println("Qual o sexo? [M/F]");
            String sexo = scanner.nextLine();
            
            System.out.println("\nA maior altura do grupo é de " + alturaMAX + " metros");
            System.out.println("A menor altura do grupo é de " + alturaMin + " metros");

            if (sexo.equalsIgnoreCase("M")) {
                numeroHomens++;
                alturaHomens = alturaHomens + altura;
                media = (alturaHomens / numeroHomens);
            }

            if (sexo.equalsIgnoreCase("F")) {
                numeroMulheres++;
            }
            
            if (numeroHomens > 0) {
                System.out.println("A media de altura dos homens é de " + media + " metros");
            };

            if (numeroMulheres > 0) {
                System.out.println("Há "+ numeroMulheres + " mulheres no grupo");
            };

            System.out.println("\nQual nome? [sair]");
            nome = scanner.nextLine();

        }
        
        scanner.close();

    }
}

