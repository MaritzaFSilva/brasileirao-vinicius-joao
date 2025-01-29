package vinicius.joao.models.entities;

import java.time.LocalDate;

public class Time {

    private String nome;
    private String estadio;
    private LocalDate dataFundacao;
    private String localOrigem;

    public Time(String nome, String estadio, LocalDate dataFundacao, String localOrigem) {
        this.nome = nome;
        this.estadio = estadio;
        this.dataFundacao = dataFundacao;
        this.localOrigem = localOrigem;
    }

    public String getNome() {
        return nome;
    }

    public String getEstadio() {
        return estadio;
    }

    public LocalDate getDataFundacao() {
        return dataFundacao;
    }

    public String getLocalOrigem() {
        return localOrigem;
    }
}
