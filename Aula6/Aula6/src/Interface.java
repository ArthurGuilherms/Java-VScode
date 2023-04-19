import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class Interface extends JFrame {

    private JButton btRegistroPessoa;
    private JButton btRegistroCidade;

    public Interface () {
        this.setTitle("Cadastros da cidade");
        setBounds(0, 0, 250, 250);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        btRegistroCidade = new JButton();
        btRegistroCidade.setText("Somar");
        btRegistroCidade.setBounds(20, 100, 100, 50);
        this.add(btRegistroCidade);

        btRegistroCidade = new JButton();
        btRegistroCidade.setText("Somar");
        btRegistroCidade.setBounds(40, 100, 100, 50);
        this.add(btRegistroCidade);
    }
}
