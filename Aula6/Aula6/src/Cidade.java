import java.util.ArrayList;

public class Cidade {
    private Integer codigo;
    private String nome;
    private String uf;
    private ArrayList listaPessoa;

    //get
    public Integer getCodigo() {
        return codigo;
    }
    public String getNome() {
        return nome;
    }
    public String getUf() {
        return uf;
    }
    public ArrayList getListaPessoa() {
        return listaPessoa;
    }

    //set
    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setUf(String uf) {
        this.uf = uf;
    }
    public void setListaPessoa(Cidade pessoa) {
        this.listaPessoa.add(pessoa);
    }
}
