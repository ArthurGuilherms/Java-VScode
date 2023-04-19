import java.util.Date;
import java.util.ArrayList;

public class Consulta {
    private Medico medico = new Medico();
    private Paciente paciente = new Paciente();
    private static ArrayList<Consulta> consulta = new ArrayList<Consulta>();
    private Date dataconsulta;
    private String hora, status;
    private int valor;
    
    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
    
    public Paciente getPaciente() {
        return this.paciente;
    }
    
    public void setMedico(Medico medico) {
        this.medico = medico;
    }
    
    public Medico getMedico() {
        return this.medico;
    }
    
    public static ArrayList<Consulta> getConsulta() {
        return consulta;
    }

    public void setConsulta(Consulta consulta) {
        Consulta.consulta.add(consulta);
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

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    
    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }
}