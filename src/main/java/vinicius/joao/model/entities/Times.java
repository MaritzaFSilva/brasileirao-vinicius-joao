package vinicius.joao.model.entities;

public class Times {
    private Long id;
    private String nome;
    private String localOrigem;
    private String estadio;
    private int anoFundacao;
    private String corUniforme;
    private String abreviacao;

    public Times(Long id, String nome, String localOrigem, String estadio, int anoFundacao, String corUniforme, String abreviacao) {
        this.id = id;
        this.nome = nome;
        this.localOrigem = localOrigem;
        this.estadio = estadio;
        this.anoFundacao = anoFundacao;
        this.corUniforme = corUniforme;
        this.abreviacao = abreviacao;
    }

    public Times() {}

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

    public String getLocalOrigem() {
        return localOrigem;
    }

    public void setLocalOrigem(String localOrigem) {
        this.localOrigem = localOrigem;
    }

    public String getEstadio() {
        return estadio;
    }

    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }

    public int getAnoFundacao() {
        return anoFundacao;
    }

    public void setAnoFundacao(int anoFundacao) {
        this.anoFundacao = anoFundacao;
    }

    public String getCorUniforme() {
        return corUniforme;
    }

    public void setCorUniforme(String corUniforme) {
        this.corUniforme = corUniforme;
    }

    public String getAbreviacao() {
        return abreviacao;
    }

    public void setAbreviacao(String abreviacao) {
        this.abreviacao = abreviacao;
    }
}
