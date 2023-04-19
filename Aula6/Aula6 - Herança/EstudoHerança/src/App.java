import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            System.out.println("\nRegistro de Pessoas");
            System.out.println("1- Física\n2- Jurídica\n3- Sair");
            int opcao = scanner.nextInt();

            if (opcao == 1) {
            Fisica pFisica = new Fisica();
            System.out.println("Nome:");
            scanner.nextLine();
            pFisica.setNome(scanner.next());
            System.out.println("Endereço:");
            pFisica.setEndereço(scanner.next());
            System.out.println("Telefone:");
            pFisica.setTelefone(scanner.next());
            System.out.println("Cpf:");
            pFisica.setCpf(scanner.next());
            System.out.println("RG:");
            pFisica.setRg(scanner.next());
            System.out.println("Data de nascimento (dd/MM/yyyy):");
            pFisica.setDataNascimento(formato.parse(scanner.next()));
            }
    
            if (opcao == 2) {
            Juridica pJuridica = new Juridica();
            System.out.println("Nome:");
            pJuridica.setNome(scanner.next());
            System.out.println("Endereço:");
            pJuridica.setEndereço(scanner.next());
            System.out.println("Telefone:");
            pJuridica.setTelefone(scanner.next());
            System.out.println("CNPJ:");
            pJuridica.setCnpj(scanner.next());
            System.out.println("Inscrição Estadual:");
            pJuridica.setInscricaoEstadual(scanner.next());
            System.out.println("Inscrição Municipal:");
            pJuridica.setInscricaoMunicipal(scanner.next());
            }

            //encerramento
            if (opcao == 3) {
            break;
            }
        } 
    
        scanner.close();

    }
}
