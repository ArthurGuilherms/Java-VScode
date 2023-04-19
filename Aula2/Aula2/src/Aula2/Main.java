package Aula2;

import javax.swing.JOptionPane;

public class Main {
    public static void main (String[] args) {

        String name = JOptionPane.showInputDialog("Enter your name!");
        JOptionPane.showMessageDialog(null,"Hello " + name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age.")
        );
        JOptionPane.showMessageDialog(null,"You are " + age + " years old");

        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height"));
        JOptionPane.showMessageDialog(null,"You are " + height + " cm tall");

    }
    
}

/* Crie uma classe para representar uma pessoa, com os atributos
privados de nome, data de nascimento e altura. Crie os métodos
públicos necessários para sets e gets e também um método para
imprimir todos dados de uma pessoa formatado com quebras de linhas.
Na sequência implemente uma classe com método main para instanciar
3 pessoas, solicitar seus dados e depois imprimi-los. */