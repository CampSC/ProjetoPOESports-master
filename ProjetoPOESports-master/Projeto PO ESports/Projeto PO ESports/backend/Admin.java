package backend;

public class Admin {

    private String idAdmin;
    private String nomeAdmin;
    private String passAdmin;
    private Torneios idTorneio;

    public Admin(Torneios idTorneio) {
        this.idAdmin = "a1234";
        this.nomeAdmin = "admin";
        this.passAdmin = "admin";
        this.idTorneio = idTorneio;
    }

    public String getIdAdmin() {
        return idAdmin;
    }

    public void setIdAdmin(String idAdmin) {
        this.idAdmin = idAdmin;
    }

    public String getNomeAdmin() {
        return nomeAdmin;
    }

    public void setNomeAdmin(String nomeAdmin) {
        this.nomeAdmin = nomeAdmin;
    }

    public String getPassAdmin() {
        return passAdmin;
    }

    public void setPassAdmin(String passAdmin) {
        this.passAdmin = passAdmin;
    }

    public Torneios getIdTorneio() {
        return idTorneio;
    }

    public void setIdTorneio(Torneios idTorneio) {
        this.idTorneio = idTorneio;
    }

}
