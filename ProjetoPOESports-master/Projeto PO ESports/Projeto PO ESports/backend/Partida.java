package backend;

import java.time.LocalDate;
public class Partida {
    private static int proximoId = 1; // Gerador automático de IDs
    private int idPartida;
    private Equipa equipaA;
    private Equipa equipaB;
    private LocalDate dataPartida;

    // Construtor
    public Partida(Equipa equipaA, Equipa equipaB, LocalDate dataPartida) {
        this.idPartida = proximoId++;
        this.equipaA = equipaA;
        this.equipaB = equipaB;
        this.dataPartida = dataPartida;
    }

    // Getters e Setters
    public int getIdPartida() {
        return idPartida;
    }

    public Equipa getEquipaA() {
        return equipaA;
    }

    public Equipa getEquipaB() {
        return equipaB;
    }

    public LocalDate getDataPartida() {
        return dataPartida;
    }

    public void setDataPartida(LocalDate dataPartida) {
        this.dataPartida = dataPartida;
    }


    @Override
    public String toString() {
        return "Partida{" +
                "idPartida=" + idPartida +
                ", equipaA=" + equipaA.getNomeEquipa() +
                ", equipaB=" + equipaB.getNomeEquipa() +
                ", dataPartida=" + dataPartida +
                '}';
    }
}
