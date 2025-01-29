package vinicius.joao.models.interfaces;

public class TimeDAO {

        private String nome;
        private String localOrigem;
        private String estadio;
        private int anoFundacao;

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

    }
