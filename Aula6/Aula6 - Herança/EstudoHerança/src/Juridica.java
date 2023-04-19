public class Juridica extends Pessoas {
    private String cnpj, inscricaoEstadual, inscricaoMunicipal;

    //set
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }
    public void setInscricaoMunicipal(String inscricaoMunicipal) {
        this.inscricaoMunicipal = inscricaoMunicipal;
    }

    //get
    public String getCnpj() {
        return cnpj;
    }
    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }
    public String getInscricaoMunicipal() {
        return inscricaoMunicipal;
    }

}
