public class Pessoas {
    private String nome, endereço, telefone;

    //set
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    //get
    public String getEndereço() {
        return endereço;
    }
    public String getNome() {
        return nome;
    }
    public String getTelefone() {
        return telefone;
    }
}
