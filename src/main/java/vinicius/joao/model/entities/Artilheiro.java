package vinicius.joao.model.entities;

public class Artilheiro {
    private Long id;
    private String nome;
    private int gols;
    private int jogos;
    
    public Artilheiro(Long id, String nome, int gols, int jogos) {
        this.id = id;
        this.nome = nome;
        this.gols = gols;
        this.jogos = jogos;
    }

    public Artilheiro() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getGols() {
        return gols;
    }

    public void setGols(int gols) {
        this.gols = gols;
    }

    public int getJogos() {
        return jogos;
    }

    public void setJogos(int jogos) {
        this.jogos = jogos;
    }
}
