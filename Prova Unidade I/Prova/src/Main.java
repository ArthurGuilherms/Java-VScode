import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner entradaNumero = new Scanner(System.in);
        Scanner entrada = new Scanner(System.in);
        while (true) {

            System.out.println("\nMenu: \n1- Cadastro de livros\n2- Consulta de livros\n3- Registro de vendas\n4- Relatório de vendas\n5- Sair");
            
            int opcao = entradaNumero.nextInt();
            if (opcao < 1 || opcao > 5) {
                System.out.println("Opcao invalida!");
            }
            else if (opcao == 1) {
                Livros livro = new Livros();
                System.out.println("Insira o ISBN: ");
                String isbn = entrada.nextLine();
                Boolean isbnValido = true;
                for (Livros i : Livros.getListaLivros()) {
                    if (i.getIsbn().equals(isbn)) {
                        System.out.println("ISBN já existe!");
                        isbnValido = false;
                    }
                }
                if (isbnValido == true) {
                    livro.setIsbn(isbn);

                    System.out.println("Insira o titulo: ");
                    livro.setTitulo(entrada.nextLine());
    
                    System.out.println("Insira o autor: ");
                    livro.setAutor(entrada.nextLine());
    
                    System.out.println("Insira a editora: ");
                    livro.setEditora(entrada.nextLine());
    
                    System.out.println("Insira a edicao: ");
                    livro.setEdicao(entrada.nextLine());
    
                    Livros.addListaLivros(livro);
                }
            }

            else if (opcao == 2) {
                ArrayList<Livros> listaLivros = Livros.getListaLivros();
                System.out.println("\nDados dos livros cadastrados:");
                for (Livros l : listaLivros) {
                    System.out.println("\nTítulo: " + l.getTitulo() + "\nISBN: " + l.getIsbn() + "\nAutor: " + l.getAutor() + "\nEditora: " + l.getEditora() + "\nEdição: " + l.getEdicao() + "\nStatus: " + l.getStatus());
                }
            }

            else if (opcao == 3) {
                Vendas venda = new Vendas();

                System.out.println("Insira a ISBN: ");
                String isbn = entrada.nextLine();
                Boolean livroExiste = false;
                for (Livros l : Livros.getListaLivros()) {
                    if (l.getIsbn().equals(isbn)) {
                        if (l.getStatus().equals("Disponível")) {
                            livroExiste = true;
                            venda.setIsbn(isbn);
                            venda.setTitulo(l.getTitulo());
                            System.out.println("Insira a data de venda (dd/MM/yyyy): ");
                            venda.setData(entrada.nextLine());
                            System.out.println("Preço do livro: ");
                            venda.setPreco(entradaNumero.nextDouble());
                            System.out.println("Valor de desconto: ");
                            venda.setDesconto(entradaNumero.nextDouble());
                            l.setStatus(false);
                            Vendas.addListaVendas(venda);
                        }
                        else
                        System.out.println("Livro já vendido!");
                        break;
                    }
                }
                
                if (livroExiste == false) {
                    System.out.println("Livro não encontrado!");
                }
            }
            
            else if (opcao == 4) {
                double totalVendas = 0;
                for (Vendas i : Vendas.getListaVendas()) {
                    totalVendas += i.getPreco();
                    totalVendas -= i.getDesconto();
                    System.out.println("\nTítulo: " + i.getTitulo() + "\nData de venda: " + i.getData() + "\nISBN: " + i.getIsbn() + "\nPreço: " + i.getPreco() + "\nDesconto: " + i.getDesconto() + "\nTotal arrecadado: " + (i.getPreco() - i.getDesconto()) );
                }
                System.out.println("\nTotal arrecadado com TODOS os livros: " + totalVendas);
            }

            else if (opcao == 5) {
                System.out.println("Obrigado pela atenção, o nosso código foi feito com muito carinho :D S2 !");
                break;
            }
            }
           
            entrada.close();
            entradaNumero.close();
        }
       
    }
   

