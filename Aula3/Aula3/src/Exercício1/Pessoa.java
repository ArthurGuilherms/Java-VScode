package Exercício1;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Pessoa {

    // atributos
    private String nome;
    private Date dataNascimento;
    private double altura;

    //get
    public String getNome() {
        return nome;
    }
    public Date getDataNascimento() {
        return dataNascimento;
    }
    public double getAltura() {
        return altura;
    }

    //set
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public void setData(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    //metodos
    public void imprimeTudo() {
        System.out.println(" ");
        System.out.println("Nome: "+ this.nome);
        System.out.println("Altura: " + this.altura);
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Data de nascimento: " + formato.format(dataNascimento));
    }

}

/* Crie uma classe para representar uma pessoa, com os atributos
privados de nome, data de nascimento e altura. Crie os métodos
públicos necessários para sets e gets e também um método para
imprimir todos dados de uma pessoa formatado com quebras de linhas.
Na sequência implemente uma classe com método main para instanciar
3 pessoas, solicitar seus dados e depois imprimi-los. */