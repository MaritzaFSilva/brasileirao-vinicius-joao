package vinicius.joao.model.interfaces;

import java.time.LocalDateTime;

public class CadastrarJogoDAO {

    private Long timeMandanteId;
    private Long timeVisitanteId;
    private int placarMandante;
    private int placarVisitante;
    private String estadio;
    private LocalDateTime dataHora;

    public Long getTimeMandanteId() {
        return timeMandanteId;
    }

    public void setTimeMandanteId(Long timeMandanteId) {
        this.timeMandanteId = timeMandanteId;
    }

    public Long getTimeVisitanteId() {
        return timeVisitanteId;
    }

    public void setTimeVisitanteId(Long timeVisitanteId) {
        this.timeVisitanteId = timeVisitanteId;
    }

    public int getPlacarMandante() {
        return placarMandante;
    }

    public void setPlacarMandante(int placarMandante) {
        this.placarMandante = placarMandante;
    }

    public int getPlacarVisitante() {
        return placarVisitante;
    }

    public void setPlacarVisitante(int placarVisitante) {
        this.placarVisitante = placarVisitante;
    }

    public String getEstadio() {
        return estadio;
    }

    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }
}
