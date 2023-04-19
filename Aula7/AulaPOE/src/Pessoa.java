import java.util.Calendar;
import java.util.ArrayList;

public class Pessoa {
    private static ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
    private int codigoP;
    private String nomeP, cidadeResidida;
    private Double salario;
    private Calendar nascimento;

    //set
    public void setCodigoP(int codigoP) {
        this.codigoP = codigoP;
    }
    public void setNomeP(String nomeP) {
        this.nomeP = nomeP;
    }
    public void setNascimento(Calendar nascimento) {
        this.nascimento = nascimento;
    }
    public void setSalario(Double salario) {
        this.salario = salario;
    }
    public static void setPessoas(Pessoa pessoas) {
        Pessoa.pessoas.add(pessoas);
    }
    public void setCidadeResidida(String cidadeResidida) {
        this.cidadeResidida = cidadeResidida;
    }

    //get 
    public int getCodigoP() {
        return codigoP;
    }
    public Calendar getNascimento() {
        return nascimento;
    }
    public String getNomeP() {
        return nomeP;
    }
    public Double getSalario() {
        return salario;
    } 
    public static ArrayList<Pessoa> getPessoas() {
        return pessoas;
    }
    public String getCidadeResidida() {
        return cidadeResidida;
    }

    //metodo
    public void dellPessoas(Pessoa pessoas) {
        Pessoa.pessoas.remove(pessoas);
    }
}
