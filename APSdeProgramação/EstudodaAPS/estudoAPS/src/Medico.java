import java.util.ArrayList;
import java.util.Date;

public class Medico {
    private static ArrayList<Medico> medicos = new ArrayList<Medico>();
    private int crm;
    private String nome_m;
    private Date nascimento_m, cadastro_m;

    //get
    public int getCrm() {
        return crm;
    }
    public String getNome_m() {
        return nome_m;
    }
    public Date getNascimento_m() {
        return nascimento_m;
    }
    public Date getCadastro_m() {
        return cadastro_m;
    }
    public static ArrayList<Medico> getMedicos() {
        return medicos;
    }


    //set
    public void setCrm(int crm) {
        this.crm = crm;
    }
    public void setNome_m(String nome_m) {
        this.nome_m = nome_m;
    }
    public void setNascimento_m(Date nascimento_m) {
        this.nascimento_m = nascimento_m;
    }
    public void setCadastro_m(Date cadastro_m) {
        this.cadastro_m = cadastro_m;
    }
    public void setMedicos(Medico medico) {
        Medico.medicos.add(medico);
    }
}
