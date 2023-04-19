import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class App extends JFrame {
    private JButton btAddPessoaCidade;
    private JButton btVerificarDados;
    private JButton btModificarDados;


    public App () {
        this.setTitle("Relatorio da Cidade");
        setBounds(500,250,340,260);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        btAddPessoaCidade = new JButton();
        btAddPessoaCidade.setText("Adicionar");
        btAddPessoaCidade.setBounds(10, 10, 150, 100);
        this.add(btAddPessoaCidade);

        btVerificarDados = new JButton();
        btVerificarDados.setText("Verificar");
        btVerificarDados.setBounds(90, 115, 150, 100);
        this.add(btVerificarDados);

        btModificarDados = new JButton();
        btModificarDados.setText("Modificar");
        btModificarDados.setBounds(165, 10, 150, 100);
        this.add(btModificarDados);
        
        
        btAddPessoaCidade.addActionListener(new ActionListener () {
            public void actionPerformed(ActionEvent evt) {
                Cidade cidade = new Cidade();
                int verificaCodigo = Integer.parseInt(JOptionPane.showInputDialog("Codigo da cidade:"));
                boolean existeCidade = false;
                for (Cidade i: Cidade.getListaCidade()) {
                    if (i.getCodigoC() == verificaCodigo) {
                    existeCidade = true;
                    cidade.setCidadeResidida(i.getNomeC());
                    JOptionPane.showMessageDialog(null, "Cidade já cadastrada!", "Resultado", JOptionPane.INFORMATION_MESSAGE);
                    cidade.setNomeP(JOptionPane.showInputDialog("Nome da pessoa:"));
                    String codigoP = (JOptionPane.showInputDialog("Codigo da Pessoa:"));
                    cidade.setCodigoP(Integer.parseInt(codigoP));
                    cidade.setSalario(Double.parseDouble(JOptionPane.showInputDialog("Salário:")));
                    Cidade.setPessoas(cidade);
                    //cidade.setNascimento(JOptionPane.showInputDialog("Data de Nascimento:"));
                    JOptionPane.showMessageDialog(null, "Cadastro da pessoa realizado com sucesso!", "Resultado", JOptionPane.INFORMATION_MESSAGE);
                    }
                }
                //Caso a cidade já tenha sido cadastrada: JOptionPane.showMessageDialog(null, "Cidade já cadastrada!", "Resultado", JOptionPane.INFORMATION_MESSAGE);

                if (existeCidade == false) {
                    cidade.setCodigoC(verificaCodigo);
                    cidade.setNomeC(JOptionPane.showInputDialog("Nome da cidade:"));
                    cidade.setUf((JOptionPane.showInputDialog("UF:")));
                    cidade.setCidades(cidade);
                    JOptionPane.showMessageDialog(null, "Cadastro da cidade realizado com sucesso!", "Resultado", JOptionPane.INFORMATION_MESSAGE);
                }

            }
        });
        
        btVerificarDados.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent evt) {
            int verificaOpcao = Integer.parseInt(JOptionPane.showInputDialog("O que voce deseja verificar?\n1- Cidade\n2- Pessoa\n3- Código"));
            if (verificaOpcao == 1) {
                for (Cidade i: Cidade.getListaCidade()) {
                    int numeroPessoas = 0;
                    int somaSalario = 0;
                    for (Pessoa j: Pessoa.getPessoas()) {
                        if (j.getCidadeResidida().equals(i.getNomeC())) {
                            numeroPessoas++;
                            somaSalario += j.getSalario();
                        }
                    }
                    
                    int mediaSalarial = somaSalario / numeroPessoas;

                    if (numeroPessoas > 0) {

                    JOptionPane.showInternalMessageDialog(null, "Cidade: " + i.getNomeC() +"\nCódigo: " + i.getCodigoC() + "\nUF: " + i.getUf() + "\nNúmero de pessoas registradas: " + numeroPessoas + "\nMédia Salarial: " + mediaSalarial, i.getNomeC(), JOptionPane.INFORMATION_MESSAGE);
                    }

                    else 
                    JOptionPane.showInternalMessageDialog(null, "Cidade: " + i.getNomeC() +"\nCódigo: " + i.getCodigoC() + "\nUF: " + i.getUf(), i.getNomeC(), JOptionPane.INFORMATION_MESSAGE);
                    
                }
            }
            if (verificaOpcao == 2) {
                verificaOpcao = Integer.parseInt(JOptionPane.showInputDialog("Qual o código da pessoa?"));
                for (Pessoa i : Pessoa.getPessoas()) {
                    if (verificaOpcao == i.getCodigoP()) {
                        JOptionPane.showInternalMessageDialog(null, "Nome: " + i.getNomeP() + "\nCidade: " + i.getCidadeResidida() + "\nSalário: " + i.getSalario() + " reais", i.getNomeP(), JOptionPane.INFORMATION_MESSAGE);
                    }
                }
            }
            if (verificaOpcao == 3) {
                int verificaOpcao2 = Integer.parseInt(JOptionPane.showInputDialog("Deseja verificar código das:\n1- Cidades\n2- Pessoas"));
                if (verificaOpcao2 == 1) {
                    for (Cidade i : Cidade.getListaCidade()) {
                        JOptionPane.showMessageDialog(null, "Nome: " + i.getNomeC() + "\nCódigo: " + i.getCodigoC(), i.getNomeC(), JOptionPane.INFORMATION_MESSAGE);
                    }
                }
                if (verificaOpcao2 == 2) {
                    for (Pessoa i : Pessoa.getPessoas()) {
                        JOptionPane.showMessageDialog(null, "Nome: " + i.getNomeP() + "\nCódigo: " + i.getCodigoP(), i.getNomeP() + "\nCidade Residida: " + i.getCidadeResidida(), JOptionPane.INFORMATION_MESSAGE);
                    }
                }
            }
        }
            
        });

        btModificarDados.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent evt) {
            int verificaOpcao = Integer.parseInt(JOptionPane.showInputDialog("O que você deseja modificar?\n1- Cidade\n2- Pessoa"));

            if (verificaOpcao == 1) {
                int verificaOpcao2 = Integer.parseInt(JOptionPane.showInputDialog("Você deseja: \n1- Apagar cidade\n2- Mudar o nome"));

                //Apagar dados da cidade
                if (verificaOpcao2 == 1) {
                    int verificaDados = Integer.parseInt(JOptionPane.showInputDialog("Qual o código da cidade?"));
                    for (Cidade i : Cidade.getListaCidade()) {
                        if (i.getCodigoC() == verificaDados) {
                            i.dellCidades(i);
                            for (Pessoa j: Cidade.getPessoas()) {
                                if (j.getCidadeResidida() == i.getNomeC()) {
                                    j.dellPessoas(j);
                                }
                            }
                        }
                    }
                }

                //Mudar o nome da cidade
                if (verificaOpcao2 == 2) {
                    int verificaDados = Integer.parseInt(JOptionPane.showInputDialog("Qual o código da cidade?"));
                    for (Cidade i : Cidade.getListaCidade()) {
                        if (i.getCodigoC() == verificaDados) {
                            String novoNome = JOptionPane.showInputDialog("Qual o novo nome?");
                            i.setNomeC(novoNome);
                            for (Pessoa j: Cidade.getPessoas()) {
                                if (j.getCidadeResidida() != i.getNomeC()) {
                                    j.setCidadeResidida(novoNome);
                                }
                            }
                        }
                    }
                }
            }

            if (verificaOpcao == 2) {
                verificaOpcao = Integer.parseInt(JOptionPane.showInputDialog("Você deseja: \n1- Retirar pessoa do sistema\n2- Mudar o nome\n3- Trocar de cidade"));

                //Apagar dados da pessoa
                if (verificaOpcao == 1) {
                    int verificaDados = Integer.parseInt(JOptionPane.showInputDialog("Qual o código da pessoa?"));
                    for (Pessoa i : Pessoa.getPessoas()) {
                        if (i.getCodigoP() == verificaDados) {
                            i.dellPessoas(i);
                        }
                    }

                }

                //Mudar o nome da pessoa
                if (verificaOpcao == 2) {
                    int verificaDados = Integer.parseInt(JOptionPane.showInputDialog("Qual o código da pessoa?"));
                    for (Pessoa i : Pessoa.getPessoas()) {
                        if (i.getCodigoP() == verificaDados) {
                            i.setNomeP(JOptionPane.showInputDialog("Qual o novo nome da pessoa?"));;
                        }
                    }
                }

                if (verificaOpcao == 3) {
                    int verificaDados = Integer.parseInt(JOptionPane.showInputDialog("Qual o código da pessoa?"));
                    for (Pessoa i : Pessoa.getPessoas()) {
                        boolean existeCidade = false;
                        if (i.getCodigoP() == verificaDados) {
                            String novaCidade = JOptionPane.showInputDialog("Nome da nova cidade");
                            for (Cidade j : Cidade.getListaCidade()) {
                                if (novaCidade.equalsIgnoreCase(j.getNomeC())) {
                                    existeCidade = true;
                                    i.setCidadeResidida(novaCidade);
                                    JOptionPane.showMessageDialog(null, "A cidade residida foi modificada", "Cidade", JOptionPane.INFORMATION_MESSAGE);
                                }
                            }

                            if (existeCidade == false) {
                                JOptionPane.showMessageDialog(null, "Cidade não existe!", "Erro", JOptionPane.INFORMATION_MESSAGE);
                            }
                        }
                    }
                }
            }
        }
        });
    }

    public static void main(String[] args) throws Exception {
        App Interface = new App();
        Interface.setVisible(true);
    }
}
