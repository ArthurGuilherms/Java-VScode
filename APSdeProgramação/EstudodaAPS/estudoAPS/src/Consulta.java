import java.util.ArrayList;
import java.util.Date;

public class Consulta {
    private static ArrayList<Consulta> consultas = new ArrayList<Consulta>();
    private String medico, paciente, statusConsulta;
    private Date dataConsulta , horaConsulta;
    private int valorConsulta;

    //get
    public static ArrayList<Consulta> getConsulta() {
        return consultas;
    }
    public String getMedico() {
        return medico;
    }
    public String getPaciente() {
        return paciente;
    }
    public String getStatusConsulta() {
        return statusConsulta;
    }
    public Date getDataConsulta() {
        return dataConsulta;
    }
    public Date getHoraConsulta() {
        return horaConsulta;
    }
    public int getValorConsulta() {
        return valorConsulta;
    }

    //set
    public void setConsulta(Consulta consulta) {
        Consulta.consultas.add(consulta);
    }
    public void setMedico(String medico) {
        this.medico = medico;
    }
    public void setPaciente(String paciente) {
        this.paciente = paciente;
    }
    public void setStatusConsulta(String statusConsulta) {
        this.statusConsulta = statusConsulta;
    }
    public void setDataConsulta(Date dataConsulta) {
        this.dataConsulta = dataConsulta;
    }
    public void setHoraConsulta(Date horaConsulta) {
        this.horaConsulta = horaConsulta;
    }
    public void setValorConsulta(int valorConsulta) {
        this.valorConsulta = valorConsulta;
    }

}
