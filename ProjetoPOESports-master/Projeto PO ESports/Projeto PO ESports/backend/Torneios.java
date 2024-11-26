package backend;

import java.util.*;

public class Torneios {
    private static final Set<String> generatedIds = new HashSet<>(); // Gerador automático de IDs
    private int idTorneio;
    private String nomeTorneio;
    private String jogo; // Jogo (CS2, eFootball, LoL)
    private List<Equipa> equipasParticipantes;
    private List<Partida> listaDePartidas;
    private TabelaClassificacao tabelaClassificacao;
    private int resultado;

    // Construtor
    public Torneios(int idTorneio, String nomeTorneio, String jogo) {
        this.idTorneio = idTorneio;
        this.nomeTorneio = nomeTorneio;
        this.jogo = jogo;
        this.equipasParticipantes = new ArrayList<>();
        this.listaDePartidas = new ArrayList<>();
        this.tabelaClassificacao = new TabelaClassificacao();
    }

    // Getters e Setters
    public int getIdTorneio() {
        return idTorneio;
    }

    public String getNomeTorneio() {
        return nomeTorneio;
    }

    public void setNomeTorneio(String nomeTorneio) {
        this.nomeTorneio = nomeTorneio;
    }

    public String getJogo() {
        return jogo;
    }

    public void setJogo(String jogo) {
        this.jogo = jogo;
    }

    public List<Equipa> getEquipasParticipantes() {
        return equipasParticipantes;
    }

    public List<Partida> getListaDePartidas() {
        return listaDePartidas;
    }

    public int getResultado(){
        return resultado;
    }

    public void setResultado(int resultado){
        this.resultado = resultado;
    }



    // Métodos

    public String generateUniqueId() {
        Random random = new Random();
        String newId;

        do {
            int number = random.nextInt(1000000);
            newId = "l" + number;
        } while (generatedIds.contains(newId));

        generatedIds.add(newId);
        return newId;
    }
    public void adicionarEquipa(Equipa equipa) {
        if (!equipasParticipantes.contains(equipa)) {
            equipasParticipantes.add(equipa);
            tabelaClassificacao.adicionarEquipa(equipa);
        } else {
            System.out.println("A equipa já está inscrita no torneio.");
        }
    }

    public void removerEquipa(Equipa equipa) {
        if (equipasParticipantes.contains(equipa)) {
            equipasParticipantes.remove(equipa);
            tabelaClassificacao.removerEquipa(equipa);
        } else {
            System.out.println("A equipa não está inscrita no torneio.");
        }
    }

    public void agendarPartida(Partida partida) {
        listaDePartidas.add(partida);
    }

    public void registrarResultado(Partida partida, String resultado) {
        partida.setResultado(resultado);
        tabelaClassificacao.atualizarClassificacao(partida);
    }

    @Override
    public String toString() {
        return "Torneio{" +
                "idTorneio=" + idTorneio +
                ", nomeTorneio='" + nomeTorneio + '\'' +
                ", jogo='" + jogo + '\'' +
                ", equipasParticipantes=" + equipasParticipantes +
                ", listaDePartidas=" + listaDePartidas +
                ", tabelaClassificacao=" + tabelaClassificacao +
                '}';
    }
}
