package vinicius.joao.controllers;

import java.util.ArrayList;
import java.util.List;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class TimesController {

    @FXML
    private TableView<Time> tableViewTimes;

    @FXML
    private TableColumn<Time, String> colunaNomeTime;

    @FXML
    private TableColumn<Time, String> colunaLocalOrigem;

    @FXML
    private TableColumn<Time, String> colunaEstadio;

    @FXML
    private TableColumn<Time, Integer> colunaAnoFundacao;

    @FXML
    private TextField BotaoADDPesquisarTime;

    private List<Time> timesCadastrados = new ArrayList<>();

    // Método para inicializar as colunas e adicionar dados fictícios
    @FXML
    private void initialize() {
        // Inicializando as colunas com os atributos da classe Time (sem usar uma classe externa)
        colunaNomeTime.setCellValueFactory(cellData -> cellData.getValue().nomeProperty());
        colunaLocalOrigem.setCellValueFactory(cellData -> cellData.getValue().localOrigemProperty());
        colunaEstadio.setCellValueFactory(cellData -> cellData.getValue().estadioProperty());
        colunaAnoFundacao.setCellValueFactory(cellData -> cellData.getValue().anoFundacaoProperty().asObject());
        
        // Carregando alguns times cadastrados diretamente no controlador
        carregarTimesCadastrados();
        
        // Atualizando a TableView
        tableViewTimes.getItems().setAll(timesCadastrados);
    }

    // Método para carregar os times cadastrados com dados fictícios
    private void carregarTimesCadastrados() {
        timesCadastrados.add(new Time("Time A", "São Paulo", "Morumbi", 1930));
        timesCadastrados.add(new Time("Time B", "Rio de Janeiro", "Maracanã", 1900));
        timesCadastrados.add(new Time("Time C", "Belo Horizonte", "Mineirão", 1910));
    }

    // Método para pesquisar o time no campo de texto
    @FXML
    private void BotaoADDPesquisarTime(ActionEvent event) {
        String searchTerm = BotaoADDPesquisarTime.getText().toLowerCase();
        List<Time> filteredTimes = new ArrayList<>();
        
        // Filtrando os times com base no termo de pesquisa
        for (Time time : timesCadastrados) {
            if (time.getNome().toLowerCase().contains(searchTerm) || 
                time.getLocalOrigem().toLowerCase().contains(searchTerm) || 
                time.getEstadio().toLowerCase().contains(searchTerm)) {
                filteredTimes.add(time);
            }
        }
        
        // Atualizando a TableView com os times filtrados
        tableViewTimes.getItems().setAll(filteredTimes);
    }

    // Classe interna para representar um Time (dados fictícios)
    public static class Time {

        private final String nome;
        private final String localOrigem;
        private final String estadio;
        private final int anoFundacao;

        // Construtor
        public Time(String nome, String localOrigem, String estadio, int anoFundacao) {
            this.nome = nome;
            this.localOrigem = localOrigem;
            this.estadio = estadio;
            this.anoFundacao = anoFundacao;
        }

        // Getters
        public String getNome() {
            return nome;
        }

        public String getLocalOrigem() {
            return localOrigem;
        }

        public String getEstadio() {
            return estadio;
        }

        public int getAnoFundacao() {
            return anoFundacao;
        }

        // Propriedades para as colunas da TableView
        public javafx.beans.property.StringProperty nomeProperty() {
            return new javafx.beans.property.SimpleStringProperty(nome);
        }

        public javafx.beans.property.StringProperty localOrigemProperty() {
            return new javafx.beans.property.SimpleStringProperty(localOrigem);
        }

        public javafx.beans.property.StringProperty estadioProperty() {
            return new javafx.beans.property.SimpleStringProperty(estadio);
        }

        public javafx.beans.property.IntegerProperty anoFundacaoProperty() {
            return new javafx.beans.property.SimpleIntegerProperty(anoFundacao);
        }
    }
}
