package Exercício1;

import java.text.SimpleDateFormat;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        Pessoa pessoa1 = new Pessoa();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual o nome?"); 
        pessoa1.setNome(scanner.next());
        System.out.println("Qual a altura?");
        pessoa1.setAltura(scanner.nextDouble());
        System.out.println("Data de nascimento [dd/MM/yyyy]");
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        pessoa1.setData(formato.parse(scanner.next()));

        Pessoa pessoa2 = new Pessoa();
        System.out.println("Qual o nome?"); 
        pessoa2.setNome(scanner.next());
        System.out.println("Qual a altura?");
        pessoa2.setAltura(scanner.nextDouble());
        System.out.println("Data de nascimento [dd/MM/yyyy]");
        pessoa2.setData(formato.parse(scanner.next()));

        Pessoa pessoa3 = new Pessoa();
        System.out.println("Qual o nome?"); 
        pessoa3.setNome(scanner.next());
        System.out.println("Qual a altura?");
        pessoa3.setAltura(scanner.nextDouble());
        System.out.println("Data de nascimento [dd/MM/yyyy]");
        pessoa3.setData(formato.parse(scanner.next()));

        pessoa1.imprimeTudo();
        pessoa2.imprimeTudo();
        pessoa3.imprimeTudo();
        scanner.close();
    }
}

/* Crie uma classe para representar uma pessoa, com os atributos
privados de nome, data de nascimento e altura. Crie os métodos
públicos necessários para sets e gets e também um método para
imprimir todos dados de uma pessoa formatado com quebras de linhas.
Na sequência implemente uma classe com método main para instanciar
3 pessoas, solicitar seus dados e depois imprimi-los. */