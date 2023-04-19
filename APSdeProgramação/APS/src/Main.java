import java.util.Scanner;
import java.util.ArrayList;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class Main {
    public static void main(String[] args) throws ParseException {
        try (Scanner entrada = new Scanner(System.in)) {
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
          

            while (true) {
                System.out.println("Escolha um tipo de conversão: ");
                System.out.println("1 - Cadastro de Médicos");
                System.out.println("2 - Cadastro de Pacientes");
                System.out.println("3 - Cadastro de Consultas");
                System.out.println("4 - Cancelamento de Consultas");
                System.out.println("5 - Relatório de Consultas Agendadas");
                System.out.println("Outro número  - Sair");
                int escolha = entrada.nextInt();
                entrada.nextLine();

                if(escolha == 1){
                    Medico medico = new Medico();
                    System.out.println("CRM: ");
                    medico.setCrm(entrada.nextLine());
                    System.out.println("Nome do Medico: ");
                    medico.setNome_m(entrada.nextLine());
                    System.out.println("Data de nascimento (dd/MM/yyyy): ");
                    medico.setDatanascimento_m(formato.parse(entrada.nextLine()));
                    System.out.println("Data de cadastro (dd/MM/yyyy): ");
                    medico.setDatacadastro_m(formato.parse(entrada.nextLine()));
                    medico.setMedicos(medico);
                    System.out.println("Medico Cadastrado!!");
                }
                else if (escolha == 2){
                    Paciente paciente = new Paciente();
                    System.out.println("CPF: ");
                    paciente.setCpf(entrada.nextLine());
                    System.out.println("Nome: ");
                    paciente.setNome_p(entrada.nextLine());
                    System.out.println("Data de nascimento (dd/MM/yyyy): ");
                    paciente.setDatanascimento_p(formato.parse(entrada.nextLine()));
                    System.out.println("Data de cadastro (dd/MM/yyyy): ");
                    paciente.setDatacadastro_p(formato.parse(entrada.nextLine()));
                    System.out.println("Endereço (CEP): ");
                    paciente.setEndereco(entrada.nextLine());
                    paciente.setPaciente(paciente);
                    System.out.println("Paciente Cadastrado!!");
                }
                else if (escolha == 3){
                    Consulta consulta = new Consulta();
                    System.out.println("Informe o CRM do médico: ");
                    boolean existeMedico = false;
                    String crm = entrada.nextLine();
                    ArrayList<Medico> lista_m2 = Medico.getMedicos();
                    for (Medico medico : lista_m2) {
                        if (crm.equals(medico.getCrm())) {
                            consulta.setMedico(medico);
                            existeMedico = true;
                        }
                    }
                    if (existeMedico == false) {
                        System.out.println("Não há médico com este CRM");
                    }
                    else
                    {
                        System.out.println("Informe o CPF do paciente: ");
                        boolean existePaciente = false;
                        String cpf = entrada.nextLine();
                        ArrayList<Paciente> lista_p2 = Paciente.getPaciente();
                        for (Paciente paciente : lista_p2) {
                            if (cpf.equals(paciente.getCpf())) {
                                consulta.setPaciente(paciente);
                                existePaciente = true;
                            }
                        }
                        if (existePaciente == false) {
                            System.out.println("Não há paciente com este CPF");
                        }
                        else
                        {
                            System.out.println("Informe a data da consulta (dd/MM/yyyy): ");
                            consulta.setDataconsulta(formato.parse(entrada.nextLine()));
                            System.out.println("Informe a hora da consulta (HH:mm:ss): ");
                            consulta.setHora(entrada.nextLine());
                            consulta.setStatus("Agendada");
                            if (consulta.getPaciente().isPrimeira_c() == true) {
                                consulta.setValor(350);
                                consulta.getPaciente().setPrimeira_c(false);
                            }
                            else
                            {
                                consulta.setValor(300);
                            }
                            consulta.setConsulta(consulta);
                            System.out.println("Consulta Agendada!!");
                        }
                    }
                }
                else if (escolha== 4){
                    ArrayList<Paciente> lista_p3 = Paciente.getPaciente();
                    ArrayList<Medico> lista_m3 = Medico.getMedicos();
                    ArrayList<Consulta> lista_consulta = Consulta.getConsulta();

                    boolean pExiste = false, mExiste = false, cExiste = false, cExiste2 = false;

                    System.out.println("Insira o CPF do paciente: ");
                    String cpf = entrada.nextLine();
                    for (Paciente p : lista_p3) {
                        if (p.getCpf().equals(cpf)){
                            pExiste = true;
                        }
                    }
                    if (pExiste == false) {
                        System.out.println("CPF inválido");
                    }
                    else
                    {
                        System.out.println("Insira a CRM do médico: ");
                        String crm = entrada.nextLine();
                        for (Medico m : lista_m3) {
                            if (m.getCrm().equals(crm)){
                                mExiste = true;
                            }
                        }
                        if (mExiste == false) {
                            System.out.println("CRM inválido");
                        }
                        else
                        {
                           System.out.println("Insira a data da consulta (dd/MM/yyyy): ");
                           String data = entrada.nextLine();
                           for (Consulta c : lista_consulta) {
                               if (c.getDataconsulta().equals(formato.parse(data))){
                                   cExiste = true;
                               }
                           }

                           if (cExiste == false) {
                               System.out.println("Data inválida");
                           }
                           else
                           {
                               System.out.println("Insira o horário da consulta: ");
                               String hora = entrada.nextLine();
                               for (Consulta c : lista_consulta) {
                                   if (c.getHora().equals(hora)) {
                                       cExiste2 = true;
                                   }
                               }

                               if (cExiste2 == false) {
                                   System.out.println("Horário inválido");
                               }
                               else
                               {
                                   for (Consulta c : lista_consulta) {
                                       if (c.getPaciente().getCpf().equals(cpf))
                                       {
                                           if (c.getMedico().getCrm().equals(crm))
                                           {
                                               if (c.getDataconsulta().equals(formato.parse(data))){
                                                   if (c.getHora().equals(hora)) {
                                                       c.setStatus("Cancelada");
                                                   }
                                               }
                                           }
                                       }
                                   }

                                   System.out.println("Consulta cancelada"); 
                               }
                           }   
                        }
                    }
                }
                else if (escolha == 5){
                    ArrayList<Medico> lista_m3 = Medico.getMedicos();
                    ArrayList<Consulta> lista_consulta = Consulta.getConsulta();
                    boolean mExiste = false, cExiste = false;

                    System.out.println("Insira a CRM do médico: ");
                    String crm = entrada.nextLine();
                    for (Medico m : lista_m3) {
                        if (m.getCrm().equals(crm)){
                            mExiste = true;
                        }
                    }
                    if (mExiste == false) {
                        System.out.println("CRM inválido");
                    }

                    System.out.println("Insira a data da consulta: ");
                    String data = entrada.nextLine();
                    for (Consulta c : lista_consulta) {
                        if (c.getDataconsulta().equals(formato.parse(data))){
                            cExiste = true;
                        }
                    }

                    if (cExiste == false) {
                        System.out.println("Data inválida");
                    }

                    for (Consulta c : lista_consulta) {
                        if (c.getMedico().getCrm().equals(crm))
                        {
                            if (c.getDataconsulta().equals(formato.parse(data))){
                                System.out.println("Consulta:");
                                System.out.println("Médico: " + c.getMedico().getNome_m());
                                System.out.println("Paciente: " + c.getPaciente().getNome_p());
                                System.out.println("Data da consulta: " + c.getDataconsulta());
                                System.out.println("Hora da consulta: " + c.getHora());
                                System.out.println("Status: " + c.getStatus());
                                System.out.println("Valor:" + c.getValor());
                            }
                        }
                    }
                }
                else {
                    break;
                }
            }
        }
    }
}