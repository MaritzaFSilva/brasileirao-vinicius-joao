package vinicius.joao.models.entities;

public class Artilheiro {
    private int id;
    private String nome;
    private int gols;
    private int timeId;

    // Construtor
    public Artilheiro(int id, String nome, int gols, int timeId) {
        this.id = id;
        this.nome = nome;
        this.gols = gols;
        this.timeId = timeId;
    }

    // Getter e Setter para id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Getter e Setter para nome
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getter e Setter para gols
    public int getGols() {
        return gols;
    }

    public void setGols(int gols) {
        this.gols = gols;
    }

    // Getter e Setter para timeId (Esse é o método que parece faltar)
    public int getTimeId() {
        return timeId;
    }

    public void setTimeId(int timeId) {
        this.timeId = timeId;
    }
}
