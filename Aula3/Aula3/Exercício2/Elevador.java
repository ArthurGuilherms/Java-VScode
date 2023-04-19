package Aula3.Aula3.Exercício2;

public class Elevador { 
    private int AndarAtual = 0;
    private int TotalAndares;
    private int CapacidadePessoas;
    private int QtdPessoasPresentes = 0;
    private int PessoasEntrando;
    private int PessoasSaindo;
   
    //get
    public int getAndarAtual() {
        return AndarAtual; }
    public int getTotalAndares() {
        return TotalAndares; }
    public int getCapacidadePessoas() {
        return CapacidadePessoas; }
    public int getQtdPessoasPresentes() {
        return QtdPessoasPresentes; }
    
    //set
    public void setTotalAndares(int TotalAndares) {
        this.TotalAndares = TotalAndares;
    }
    public void setCapacidadePessoas(int CapacidadePessoas) {
        this.CapacidadePessoas = CapacidadePessoas;
    }
    public void setPessoasEntrando(int PessoasEntrando) {
        this.PessoasEntrando = PessoasEntrando;
    }
    public void setPessoasSaindo(int PessoasSaindo) {
        this.PessoasSaindo = PessoasSaindo;
    }

    public void setQtdPessoasPresentes() 
    {
        QtdPessoasPresentes = QtdPessoasPresentes + PessoasEntrando - PessoasSaindo;
        if (QtdPessoasPresentes < 0) {
            QtdPessoasPresentes = QtdPessoasPresentes - PessoasEntrando + PessoasSaindo;
            System.out.println("Número de pessoas inválido!.");
        }
        if ((QtdPessoasPresentes >= 0) && (QtdPessoasPresentes <= CapacidadePessoas)) {
            return;
        }
        else {
            QtdPessoasPresentes = QtdPessoasPresentes - PessoasEntrando + PessoasSaindo;
            System.out.println("Número de pessoas inválido!.");
        }
    }

    public void setAndarAtual(int AndarAtual) {
        if (AndarAtual < 0) {
            System.out.println("Andar inválido.");
        }
        if ((AndarAtual >= 0) & (AndarAtual <= TotalAndares)) {
            this.AndarAtual = AndarAtual;
        }
        else {
            System.out.println("Andar inválido.");
        }
    }
    
	public void imprimirDadosElevador() {
		System.out.println("Total de Andares: " + this.TotalAndares + "\n" +
							"Capacidade: " + this.CapacidadePessoas);
	}
}


/* Crie uma classe denominada Elevador para armazenar as informações
de um elevador dentro de um prédio. A classe deve armazenar o andar
atual (térreo = 0), total de andares no prédio (desconsiderando o
térreo), capacidade do elevador e quantas pessoas estão presentes
nele.
Na sequência implemente uma classe com método main para instanciar
o elevador e manipular seus dados.
Obs.: o método setAndarAtual deve validar a faixa de valores permitidos
para essa variável; o método setQtdPessoasPresentes deve validar se
está dentro da capacidade permitida. */