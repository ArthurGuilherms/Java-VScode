import java.util.Date;

public class Fisica extends Pessoas {
    private String cpf, rg;
    private Date dataNascimento;

    //set
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public void setRg(String rg) {
        this.rg = rg;
    }
    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    //get
    public String getCpf() {
        return cpf;
    }
    public String getRg() {
        return rg;
    }
    public Date getDataNascimento() {
        return dataNascimento;
    }
}
