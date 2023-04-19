import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class App extends JFrame{ 

private JButton btRegistroPessoa;
private JButton btRegistroCidade;

public App () {
        this.setTitle("Cadastros da cidade");
        setBounds(0, 0, 250, 250);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        btRegistroCidade = new JButton();
        btRegistroCidade.setText("Cidade");
        btRegistroCidade.setBounds(70, 100, 100, 50);
        this.add(btRegistroCidade);

        btRegistroPessoa = new JButton();
        btRegistroPessoa.setText("Pessoas");
        btRegistroPessoa.setBounds(70, 150, 100, 50);
        this.add(btRegistroPessoa); 

        btRegistroCidade.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                String codigo
            }
        });
    }
    public static void main(String[] args) throws Exception {
        App exemplo = new App();
        exemplo.setVisible(true);
    } 

}
