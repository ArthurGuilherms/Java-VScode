package Aula3.Aula3.Exercício2;

import java.util.Scanner;

public class Main  {
    public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String verificador = "Continuar";
		Elevador elevador = new Elevador();
        System.out.println("Vamos configurar o Elevador!");
		System.out.println("Total de Andares: ");
		elevador.setTotalAndares(entrada.nextInt());
		System.out.println("Capacidade: ");
		elevador.setCapacidadePessoas(entrada.nextInt());
        System.out.println("Elevador configurado!!");

        while (verificador.equalsIgnoreCase("Continuar")) {
            System.out.println("\n*Blim* A porta se abriu!");
		    System.out.println("Quantidade de Pessoas Presentes: " + elevador.getQtdPessoasPresentes());
		    System.out.println("Andar atual: " + elevador.getAndarAtual());
            System.out.println("\nQual ação você deseja realizar?\n" +
                                "1- Adcionar ou retirar pessoas.\n" +
                                "2- Subir ou descer de andar.\n" +
                                "3- Finalizar.");
            int comando = entrada.nextInt();

            if (comando == 1) {
                System.out.println("Quantas pessoas estão entrando?");
                elevador.setPessoasEntrando(entrada.nextInt());
                System.out.println("Quantas pessoas estão saindo?");
                elevador.setPessoasSaindo(entrada.nextInt());
                elevador.setQtdPessoasPresentes();
            }

            if (comando == 2) {
                System.out.println("Digite o numero do andar que deseja ir.");
                elevador.setAndarAtual(entrada.nextInt());
            }
            
            if (comando == 3) {
                verificador = "sair";
            }
        }
    
		entrada.close();
	}

}
