package vinicius.joao.models.entities;

import vinicius.joao.models.interfaces.TabelaDAO;

public class Tabela implements TabelaDAO {
    private int posicao;
    private String time;
    private int pontos;
    private int jogos;
    private int vitorias;
    private int empates;
    private int derrotas;

    public Tabela(int posicao, String time, int pontos, int jogos, int vitorias, int empates, int derrotas) {
        this.posicao = posicao;
        this.time = time;
        this.pontos = pontos;
        this.jogos = jogos;
        this.vitorias = vitorias;
        this.empates = empates;
        this.derrotas = derrotas;
    }

    @Override
    public int getPosicao() {
        return posicao;
    }

    @Override
    public void setPosicao(int posicao) {
        this.posicao = posicao;
    }

    @Override
    public String getTime() {
        return time;
    }

    @Override
    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public int getPontos() {
        return pontos;
    }

    @Override
    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    @Override
    public int getJogos() {
        return jogos;
    }

    @Override
    public void setJogos(int jogos) {
        this.jogos = jogos;
    }

    @Override
    public int getVitorias() {
        return vitorias;
    }

    @Override
    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    @Override
    public int getEmpates() {
        return empates;
    }

    @Override
    public void setEmpates(int empates) {
        this.empates = empates;
    }

    @Override
    public int getDerrotas() {
        return derrotas;
    }

    @Override
    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }
}
