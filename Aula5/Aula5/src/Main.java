import java.util.ArrayList;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner entrada = new Scanner(System.in);
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        ArrayList<Medico> lista_m = new ArrayList<Medico>();
        ArrayList<Paciente> lista_p = new ArrayList<Paciente>();
        ArrayList<Consulta> consulta = new ArrayList<Consulta>();

        System.out.println("Escolha um tipo de conversão: ");
        System.out.println("1 - Cadastro de Médicos");
        System.out.println("2 - Cadastro de Pacientes");
        System.out.println("3 - Cadastro de Consultas");
        System.out.println("4 - Cancelamento de Consultas");
        System.out.println("5 - Relatório de Consultas Agendadas");
        System.out.println("Outro número  - Sair");
        int escolha = entrada.nextInt();

        if(escolha == 1){
        }
        
        if (escolha == 2){

        }
        if (escolha == 3){

        }
        if (escolha== 4){

        }
        if (escolha == 5){

        }
    entrada.close();
}
}