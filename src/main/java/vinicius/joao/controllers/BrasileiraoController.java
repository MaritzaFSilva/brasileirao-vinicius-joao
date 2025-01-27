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
    private TextField BotaoADDQuantidadeJogos;

    @FXML
    private TableColumn<?, ?> colunaJogador;

    @FXML
    private TextField BotaoADDNomeArtilheiro;

    @FXML
    private TableColumn<?, ?> colunaPosicao;

    @FXML
    private TableColumn<?, ?> colunaGols;

    @FXML
    private TableColumn<?, ?> colunaJogo;

    @FXML
    private Button BotaoADDExcluirJogo;

    @FXML
    private TableColumn<?, ?> colunaDerrotas;

    @FXML
    private Button BotaoADDEditarTime;

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
    private Button BotaoADDEditarArtilheiro;

    @FXML
    private TextField BotaoADDPlacarMandante;

    @FXML
    private TableView<?> tableViewArtilheiros;

    @FXML
    private Button BotaoADDExcluirArtilheiro;

    @FXML
    private TextField BotaoADDTimeVisitante;

    @FXML
    private Tab BotaoADDCadastrarArtilheiros;

    @FXML
    private Tab BotaoADDTabela;

    @FXML
    private TableColumn<?, ?> colunaNomeTime;

    @FXML
    private TextField BotaoADDQuantidadeGols;

    @FXML
    private TextField BotaoADDNomeTime;

    @FXML
    private TextField BotaoADDHorario;

    @FXML
    private TextField BotaoADDTimesMandante;

    @FXML
    private Tab BotaoADDCadastroTimes;

    @FXML
    private Button BotaoADDCadastrarArtilheiro1;

    @FXML
    private TextField BotaoADDPlacarVisitante;

    @FXML
    private TableColumn<?, ?> colunaTimes;

    @FXML
    private TableView<?> tableView;

    @FXML
    private TextField BotaoADDEstadio;

    @FXML
    private Button BotaoADDCadastrarJogo;

    @FXML
    private TextField BotaoADDAnoFundacao;

    @FXML
    private TextField BotaoADDNomeTimeAt;

    @FXML
    private Button BotaoADDEditarJogo;

    @FXML
    private Tab BotaoADDCadastroJogos;

    @FXML
    private TableColumn<?, ?> colunaAnoFundacao;

    @FXML
    private Button BotaoADDExcluirTime;

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
    void BotaoADDNomeTimeAt(ActionEvent event) {

    }

    @FXML
    void BotaoADDNomeArtilheiro(ActionEvent event) {

    }

    @FXML
    void BotaoADDQuantidadeJogos(ActionEvent event) {

    }

    @FXML
    void BotaoADDQuantidadeGols(ActionEvent event) {

    }

    @FXML
    void onEditarArtilheiro(ActionEvent event) {
        System.out.println("Editar Artilheiro Funcionando !");
    }

    @FXML
    void onCadastrarArtilheiro(ActionEvent event) {
        System.out.println("Cadastrar Artilheiro Funcionando !");
    }

    @FXML
    void onExcluirArtilheiro(ActionEvent event) {
        System.out.println("Excluir Artilheiro funcionando !");
    }

    @FXML
    void onExcluirTime(ActionEvent event) {
        System.out.println("Excluir Time funcionando !");
    }

    @FXML
    void onCadastrarTime(ActionEvent event) {
        System.out.println("Cadastrar Time funcionando !");
    }

    @FXML
    void onEditarTime(ActionEvent event) {
        System.out.println("Editar Time funcionando !");
    }

    @FXML
    void onExcluirJogo(ActionEvent event) {
        System.out.println("Excluir Jogo funcionando !");
    }

    @FXML
    void onCadastrarJogo(ActionEvent event) {
        System.out.println("Cadastrar jogo funcionando !");
    }

    @FXML
    void onEditarJogo(ActionEvent event) {
        System.out.println("Editar jogo funcionando !");
    }

}


