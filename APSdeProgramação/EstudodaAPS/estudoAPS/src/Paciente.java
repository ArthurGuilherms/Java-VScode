import java.util.ArrayList;
import java.util.Date;

public class Paciente {
    private static ArrayList<Paciente> pacientes = new ArrayList<Paciente>();
    private int cpf;
    private String nome_p, endereco;
    private Date nascimento_p, cadastro_p;
    private boolean primeiraConsulta = true;

   //get
   public int getCpf() {
       return cpf;
   }
   public String getNome_p() {
       return nome_p;
   }
   public Date getNascimento_p() {
       return nascimento_p;
   }
   public Date getCadastro_p() {
       return cadastro_p;
   }
   public String getEndereco() {
       return endereco;
   }
   public static ArrayList<Paciente> getPacientes() {
       return pacientes;
   } 
   public boolean getPrimeiraConsulta() {
    return primeiraConsulta;
    }

   //set
   public void setCpf(int cpf) {
       this.cpf = cpf;
   }
   public void setNome_p(String nome_p) {
       this.nome_p = nome_p;
   }
   public void setNascimento_p(Date nascimento_p) {
       this.nascimento_p = nascimento_p;
   }
   public void setCadastro_p(Date cadastro_p) {
       this.cadastro_p = cadastro_p;
   }
   public void setEndereco(String endereco) {
       this.endereco = endereco;
   }
   public void setPacientes(Paciente paciente) {
       Paciente.pacientes.add(paciente);
   }
   public void setPrimeiraConsulta(boolean primeiraConsulta) {
    this.primeiraConsulta = primeiraConsulta;
   }
}
