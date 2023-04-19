import java.util.Date;
import java.util.ArrayList;

public class Consulta {
    private ArrayList<Consulta> consulta;
    private Date dataconsulta;
    private String hora;
    private boolean primeira_c;
    private int valor;

    public ArrayList<Consulta> getConsulta() {
        return consulta;
    }

    public void setConsulta(ArrayList<Consulta> consulta) {
        this.consulta = consulta;
    }

    public Date getDataconsulta() {
        return dataconsulta;
    }

    public void setDataconsulta(Date dataconsulta) {
        this.dataconsulta = dataconsulta;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public boolean isPrimeira_c() {
        return primeira_c;
    }

    public void setPrimeira_c(boolean primeira_c) {
        this.primeira_c = primeira_c;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
}