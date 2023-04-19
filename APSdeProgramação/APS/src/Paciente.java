import java.util.Date;
import java.util.ArrayList;

public class Paciente {
    private static ArrayList<Paciente> paciente = new ArrayList<Paciente>();
    private String cpf, nome_p, endereco;
    private Date datanascimento_p, datacadastro_p;
    private boolean primeira_c = true;

    public static ArrayList<Paciente> getPaciente() {
        return paciente;
    }
    
    public void setPaciente(Paciente paciente) {
        Paciente.paciente.add(paciente);
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome_p() {
        return nome_p;
    }

    public void setNome_p(String nome_p) {
        this.nome_p = nome_p;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Date getDatanascimento_p() {
        return datanascimento_p;
    }

    public void setDatanascimento_p(Date datanascimento_p) {
        this.datanascimento_p = datanascimento_p;
    }

    public Date getDatacadastro_p() {
        return datacadastro_p;
    }

    public void setDatacadastro_p(Date datacadastro_p) {
        this.datacadastro_p = datacadastro_p;
    }
    
    public boolean isPrimeira_c() {
        return primeira_c;
    }

    public void setPrimeira_c(boolean primeira_c) {
        this.primeira_c = primeira_c;
    }
}

// Galera, não será mais necessário eleições para a atlética pois duas das chapas que concorriam desistiram. Então a chapa vencedora é a composta por George e Paulo. 