import java.util.ArrayList;

public class Livros {
    private String isbn, titulo, autor, editora, edicao;
    private Boolean status = true;
    private static ArrayList<Livros> listaLivros = new ArrayList<Livros>();

    //get
    public String getIsbn() {
        return isbn;
    }
    public String getTitulo() {
        return titulo;
    }
    public String getAutor() {
        return autor;
    }
    public String getEditora() {
        return editora;
    }
    public String getEdicao() {
        return edicao;
    }
    public String getStatus() {
        String stringStatus;
        if (status == true) {
            stringStatus = "Disponível";
            return stringStatus;
        }
        else 
        stringStatus = "Vendido";
        return stringStatus;
        
    }
    public static ArrayList<Livros> getListaLivros() {
        return listaLivros;
    }

    //set
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public void setEditora(String editora) {
        this.editora = editora;
    }
    public void setEdicao(String edicao) {
        this.edicao = edicao;
    }
    public void setStatus(Boolean status) {
        this.status = status;
    }
    public static void addListaLivros(Livros livro) {
       Livros.listaLivros.add(livro);
    }
}
