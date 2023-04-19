import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int Verificador = 0;
        int i = 0;
        Scanner scanner = new Scanner(System.in);
        ArrayList<Cliente> lista = new ArrayList<Cliente>();
            
        while (Verificador >= 0) {
            Cliente cliente = new Cliente();
            System.out.println("Qual o id? [Valor negativo para encerrar]");
            cliente.setid(scanner.nextInt());
            if (cliente.getid() <= 0) {
                break;
            }
            System.out.println("Qual o nome?");
            cliente.setNome(scanner.next());
            System.out.println("Qual a idade?");
            cliente.setIdade(scanner.nextInt());
            System.out.println("Qual o telefone?");
            cliente.setTelefone(scanner.nextInt());
            lista.add(cliente);
        }

        System.out.println("\n Informações dos clientes:");

        while (i <= lista.size()) {
            System.out.println("Id: " + lista.get(i).getid() + " Nome: " + lista.get(i).getNome() + " Idade: " + lista.get(i).getIdade() + " Telefone: " + lista.get(i).getTelefone());
            ++i;
        };

    scanner.close();
    }
}

/* Crie um objeto chamado Cliente com os atributos: id, nome, idade,
telefone. Faça um programa para solicitar os dados de vários clientes e
armazenar em um ArrayList até que se digite um número de ID
negativo. Em seguida exiba os dados de todos os clientes, formatando
cada objeto separado por linhas. */