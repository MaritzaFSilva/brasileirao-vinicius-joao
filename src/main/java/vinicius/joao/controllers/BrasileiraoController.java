package vinicius.joao.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class BrasileiraoController {

    @FXML
    private TableColumn<?, ?> colunaPontos;

    @FXML
    private TextField BotaoADDLocalOrigem;

    @FXML
    private TableColumn<?, ?> colunaLocalOrigem;

    @FXML
    private TableColumn<?, ?> colunaJogador;

    @FXML
    private TableColumn<?, ?> colunaPosicao;

    @FXML
    private TableColumn<?, ?> colunaGols;

    @FXML
    private TableColumn<?, ?> colunaJogo;

    @FXML
    private TableColumn<?, ?> colunaDerrotas;

    @FXML
    private TextField BotaoADDCorUniforme;

    @FXML
    private TableColumn<?, ?> colunaEstadio;

    @FXML
    private TableColumn<?, ?> colunaJogos;

    @FXML
    private Button BotaoADDCadastrarTime;

    @FXML
    private Tab BotaoADDTimesCadastrados;

    @FXML
    private TableView<?> tableViewTimes;

    @FXML
    private TextField BotaoADDPlacarMandante;

    @FXML
    private TableView<?> tableViewArtilheiros;

    @FXML
    private TextField BotaoADDTimeVisitante;

    @FXML
    private Tab BotaoADDTabela;

    @FXML
    private TableColumn<?, ?> colunaNomeTime;

    @FXML
    private TextField BotaoADDNomeTime;

    @FXML
    private TextField BotaoADDHorario;

    @FXML
    private TextField BotaoADDTimesMandante;

    @FXML
    private Tab BotaoADDCadastroTimes;

    @FXML
    private TextField BotaoADDPlacarVisitante;

    @FXML
    private TableColumn<?, ?> colunaTimes;

    @FXML
    private TableView<?> tableView;

    @FXML
    private TextField BotaoADDABVNomeTime;

    @FXML
    private TextField BotaoADDEstadio;

    @FXML
    private Button BotaoADDCadastrarJogo;

    @FXML
    private TextField BotaoADDAnoFundacao;

    @FXML
    private Tab BotaoADDCadastroJogos;

    @FXML
    private TableColumn<?, ?> colunaAnoFundacao;

    @FXML
    private DatePicker BotaoADDData;

    @FXML
    private TabPane tabPane;

    @FXML
    private Tab BotaoADDArtilheiros;

    @FXML
    private TableColumn<?, ?> colunaVitorias;

    @FXML
    private TableColumn<?, ?> colunaEmpates;

    @FXML
    void onCadastrarTime(ActionEvent event) {
        System.out.println("cadastrar time funcionando");
    }

    @FXML
    void onCadastrarJogo(ActionEvent event) {
        System.out.println("cadastrar jogo funcionando");
    }

}
