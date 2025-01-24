package vinicius.joao.model.interfaces;

public class TimesDAO {

        private String nome;
        private String localOrigem;
        private String estadio;
        private int anoFundacao;
        private String corUniforme;
        private String abreviacao;

        // Getters e Setters
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
