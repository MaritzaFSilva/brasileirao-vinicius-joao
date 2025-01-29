package vinicius.joao.models.entities;

import java.sql.Date;
import java.sql.Time;

public class Jogo {
    private String timeCasa;
    private String timeVisitante;
    private int golsCasa;
    private int golsVisitante;
    private String estadio;
    private Date dataJogo;
    private Time horarioJogo;

    // Construtor ajustado
    public Jogo(String timeCasa, String timeVisitante, int golsCasa, int golsVisitante, String estadio, Date dataJogo, Time horarioJogo) {
        this.timeCasa = timeCasa;
        this.timeVisitante = timeVisitante;
        this.golsCasa = golsCasa;
        this.golsVisitante = golsVisitante;
        this.estadio = estadio;
        this.dataJogo = dataJogo;
        this.horarioJogo = horarioJogo;
    }

    // Getters e Setters
    public String getTimeCasa() {
        return timeCasa;
    }

    public void setTimeCasa(String timeCasa) {
        this.timeCasa = timeCasa;
    }

    public String getTimeVisitante() {
        return timeVisitante;
    }

    public void setTimeVisitante(String timeVisitante) {
        this.timeVisitante = timeVisitante;
    }

    public int getGolsCasa() {
        return golsCasa;
    }

    public void setGolsCasa(int golsCasa) {
        this.golsCasa = golsCasa;
    }

    public int getGolsVisitante() {
        return golsVisitante;
    }

    public void setGolsVisitante(int golsVisitante) {
        this.golsVisitante = golsVisitante;
    }

    public String getEstadio() {
        return estadio;
    }

    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }

    public Date getDataJogo() {
        return dataJogo;
    }

    public void setDataJogo(Date dataJogo) {
        this.dataJogo = dataJogo;
    }

    public Time getHorarioJogo() {
        return horarioJogo;
    }

    public void setHorarioJogo(Time horarioJogo) {
        this.horarioJogo = horarioJogo;
    }
}
