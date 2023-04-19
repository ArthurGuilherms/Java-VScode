import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        //formatação da data e hora:
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat formatoHora = new SimpleDateFormat("HH:mm");

        //Data e hora atual
        Date agora = new Date();
        String dataFormatada = formato.format(agora);


    //menu de seleção do usuário em loop
        while (true) {
            System.out.println("Selecione uma opção:");
            System.out.println("1 - Cadastro de médicos");
            System.out.println("2 - Cadastro de pacientes");
            System.out.println("3 - Cadastro de consultas");
            System.out.println("4 - Cancelamento de consulta");
            System.out.println("5 - Relatório de consultas");
            System.out.println("6 - Sair");

            //Verificador de ecolha
            int escolha;
            escolha = scanner.nextInt();
            
            //Cadastro do médico
            if (escolha == 1) {
                Medico medico = new Medico();
                System.out.println("Qual o CRM do médico?");
                medico.setCrm(scanner.nextInt());
                scanner.nextLine();
                System.out.println("Qual o nome do médico?");
                medico.setNome_m(scanner.nextLine());
                System.out.println("Qual a data de nascimento? (dd/MM/yyyy)");
                medico.setNascimento_m(formato.parse(scanner.next()));
                
                //Salvar a data do cadastro automaticamente
                dataFormatada = formato.format(agora);
                medico.setCadastro_m(formato.parse(dataFormatada));

                medico.setMedicos(medico);
                System.out.println("Medico cadastrado!\n");
            }

             //Cadastro do paciente
            if (escolha == 2) {
                Paciente paciente = new Paciente();
                System.out.println("Qual o CPF do paciente?");
                paciente.setCpf(scanner.nextInt());
                scanner.nextLine();
                System.out.println("Qual o nome do paciente?");
                paciente.setNome_p(scanner.nextLine());
                System.out.println("Qual a data de nascimento?");
                paciente.setNascimento_p(formato.parse(scanner.next()));
                System.out.println("Qual o endereço?");
                scanner.next();
                paciente.setEndereco(scanner.nextLine());

                //Salvar a data do cadastro automaticamente
                dataFormatada = formato.format(agora);
                paciente.setCadastro_p(formato.parse(dataFormatada));

                paciente.setPacientes(paciente);
                System.out.println("Paciente cadastrado!\n");
            }

            //Cadastro da consulta
            if (escolha == 3) {
                Consulta consultas = new Consulta();
                System.out.println("Qual o CPF do paciente?");
                int procuraCPF = scanner.nextInt();

                //Verificação do CPF do Paciente
                for (Paciente p : Paciente.getPacientes()) {
                    if (p.getCpf() == (procuraCPF)) {
                        System.out.println("Paciente encontrado.");
                        consultas.setPaciente(p.getNome_p());
                
                         //Verificador de preço da consulta
                         for (Paciente i : Paciente.getPacientes())
                         if (i.getPrimeiraConsulta() == true) {
                            consultas.setValorConsulta(350);
                            i.setPrimeiraConsulta(false);
                         }
                         else
                            consultas.setValorConsulta(300);

                        // Verificação do CMV do Médico
                        System.out.println("Qual o CRM do médico?");
                        int procuraCRM = scanner.nextInt();
                        for (Medico j : Medico.getMedicos()) {
                            if (j.getCrm() == (procuraCRM)) {
                                System.out.println("Medico encontrado.");
                                consultas.setMedico(j.getNome_m());

                            //Seleção de data de consulta
                            System.out.println("Qual a data da consulta? (dd/MM/yyyy)");
                            consultas.setDataConsulta(formato.parse(scanner.next()));
                            System.out.println("Qual a hora da consulta? (HH:mm)");
                            consultas.setHoraConsulta(formatoHora.parse(scanner.next()));
                            System.out.println("Horário reservado no dia " + formato.format(consultas.getDataConsulta()) + " às " + formatoHora.format(consultas.getHoraConsulta()) + " horas.\n");
                            consultas.setStatusConsulta("Agendada");
                            consultas.setConsulta(consultas);
                            }

                            //Em caso de erros:
                            else
                                System.out.println("\nMedico não encontrado.");
                                break;
                        }
                    }
                    else
                        System.out.println("\nPaciente não encontrado.");
                        break;
                }
            }

            //Cancelamento de consulta
            if (escolha == 4) {

                //Filtro por CPF
                System.out.println("Qual o CPF do paciente?");
                int procuraCPF = scanner.nextInt();
                for (Paciente i : Paciente.getPacientes()) {
                    if (i.getCpf() == procuraCPF) {

                        //Filtro por CRM
                        for (Medico j : Medico.getMedicos()) {
                            System.out.println("Qual o CRM do médico?");
                            int procuraCRM = scanner.nextInt();
                            if (j.getCrm() == procuraCRM) {

                                //Filtro por Data
                                for (Consulta k : Consulta.getConsulta()) {
                                    System.out.println("Qual a data da consulta? (dd/MM/yyyy)");
                                    Date procuraData = formato.parse(scanner.next());
                                    
                                    //filtro por Hora
                                    if (k.getDataConsulta().equals(procuraData)) {
                                        System.out.println("Qual o horário da consulta? (HH:mm)");
                                        Date procuraHora = formatoHora.parse(scanner.next());
                                        if (k.getHoraConsulta().equals(procuraHora));
                                        k.setStatusConsulta("Cancelada");
                                        System.out.println("Consulta Cancelada\n");
                                        }

                                    else
                                        System.out.println("\nNenhuma consulta encontrada.");
                                        break;
                                }
                            }
                            else
                                System.out.println("\nCRM não encontrado.");
                                break;
                        }
                    }
                    else
                        System.out.println("\nCPF não encontrado.");
                        break;

                }
            }

            //Relatório de consultas
            if (escolha == 5) {
                //Filtro por data
                System.out.println("Qual a data da consulta? (dd/MM/yyyy)");
                Date procuraData = formato.parse(scanner.next());

                //Filtro por CRM
                System.out.println("Qual o CRM do médico?");
                int procuraCRM = scanner.nextInt();
                for (Consulta i : Consulta.getConsulta()) {
                    if (i.getDataConsulta().equals(procuraData)) {
                        for (Medico j : Medico.getMedicos()) {
                            if (j.getCrm() == procuraCRM) {
                                //Verificar se o nome do médico da classe Consulta é igual ao da classe Medico
                                if (i.getMedico() == j.getNome_m()) {
                                    System.out.println("Horário reservado no dia " + formato.format(i.getDataConsulta()) + " às " + formatoHora.format(i.getHoraConsulta()) + " horas:");
                                    System.out.println("Médico: " + j.getNome_m());
                                    System.out.println("Paciente: " + i.getPaciente());
                                    System.out.println("Valor: " + i.getValorConsulta());
                                    System.out.println("Status: " + i.getStatusConsulta() + "\n");
                                }
                                else
                                System.out.println("\nNenhuma consulta desse médico nessa data.");
                            }

                            else
                                System.out.println("\nNenhuma consulta desse médico nessa data.");
                        }
                    }
                    
                    else
                        System.out.println("\nNenhuma consulta encontrada.");
            }
        }
    

            //Encerrar programa
            if (escolha == 6) {
                scanner.close();
                break;
            }

            //Caso selecione outros números:
            if (escolha > 6 || escolha < 1) {
                System.out.println("\nNúmero Inválido");
            }
        }
    }
}


