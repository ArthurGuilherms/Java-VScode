import java.util.ArrayList;

public class Vendas extends Livros{
    private String data;
    private double preco, desconto; 
    private static ArrayList<Vendas> listaVendas = new ArrayList<Vendas>();

    //get
    public String getData() {
        return data;
    }
    public double getPreco() {
        return preco;
    }
    public double getDesconto() {
        return desconto;
    }
    public static ArrayList<Vendas> getListaVendas() {
        return listaVendas;
    }
   
    

    //set
    public void setData(String data) {
        this.data = data;
    }
    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public static void addListaVendas(Vendas venda) {
        Vendas.listaVendas.add(venda);
    }
}
    