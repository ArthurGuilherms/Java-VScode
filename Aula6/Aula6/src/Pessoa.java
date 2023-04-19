import java.util.Date;

public class Pessoa {
    private Integer codigo;
    private String nome;
    private double salario;

    //get
    public Integer getCodigo() {
        return codigo;
    }
    public Date getNascimento() {
        return nascimento;
    }
    public String getNome() {
        return nome;
    }
    public double getSalario() {
        return salario;
    }

    //set
    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }
    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }

}   
