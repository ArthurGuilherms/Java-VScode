import java.util.ArrayList;

public class Cidade extends Pessoa {
    private static ArrayList<Cidade> cidades = new ArrayList<Cidade>();
    private Integer codigoC;
    private String nomeC, uf;
    
    

    //set
    public void setCodigoC(Integer codigoC) {
        this.codigoC = codigoC;
    }
    public void setNomeC(String nomeC) {
        this.nomeC = nomeC;
    }
    public void setUf(String uf) {
        this.uf = uf;
    }
    public void setCidades(Cidade cidade) {
        Cidade.cidades.add(cidade);
    }

    //get
    public Integer getCodigoC() {
        return codigoC;
    }
    public String getNomeC() {
        return nomeC;
    }
    public String getUf() {
        return uf;
    }
    public static ArrayList<Cidade> getListaCidade() {
        return cidades;
    }

    //metodo
    public void dellCidades(Cidade cidade) {
        Cidade.cidades.remove(cidade);
    }
}
