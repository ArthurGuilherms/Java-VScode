import java.util.Date;
import java.util.ArrayList;

public class Medico {
    private static ArrayList<Medico> medicos = new ArrayList<Medico>();
    private String crm, nome_m;
    private Date datanascimento_m, datacadastro_m;

    public static ArrayList<Medico> getMedicos() {
        return medicos;
    }

    public void setMedicos(Medico medico) {
        Medico.medicos.add(medico);
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public String getNome_m() {
        return nome_m;
    }

    public void setNome_m(String nome_m) {
        this.nome_m = nome_m;
    }

    public Date getDatanascimento_m() {
        return datanascimento_m;
    }

    public void setDatanascimento_m(Date datanascimento_m) {
        this.datanascimento_m = datanascimento_m;
    }

    public Date getDatacadastro_m() {
        return datacadastro_m;
    }

    public void setDatacadastro_m(Date datacadastro_m) {
        this.datacadastro_m = datacadastro_m;
    }
}