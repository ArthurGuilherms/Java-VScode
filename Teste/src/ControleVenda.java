class ControleVenda {
    private String data;
    private ControleLivro livro;
    private double preco;
    private double desconto;
    public ControleVenda(String data, ControleLivro livroVenda, double preco, double desconto) {
    }
    public void Venda(String data, ControleLivro livro, double preco, double desconto) {
     this.data = data;
     this.livro = livro;
     this.preco = preco;
     this.desconto = desconto;
    }
    public String getData() {
     return data;
    }
    public ControleLivro getLivro() {
     return livro;
    }
    public double getPreco() {
     return preco;
    }
    public double getDesconto() {
     return desconto;
    }
    public double getTotalArrecadado() {
     return preco - desconto;
    }
    public String toString() {
     return "Data: " + data + ", ISBN: " + livro.getIsbn() + ", Título: " + livro.getTitulo() + ", Preço: " + preco + ", Desconto: " + desconto + ", Total arrecadado: " + getTotalArrecadado();
    }
}