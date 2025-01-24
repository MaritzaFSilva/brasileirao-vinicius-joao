package vinicius.joao.controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import vinicius.joao.model.entities.Jogos;

public class CadastrarJogoController {

    private String timeMandante;
    private String timeVisitante;
    private int placarMandante;
    private int placarVisitante;
    private String estadio;
    private String horario;
    private String data;

    @FXML
    private TableView<Jogos> tabelaJogos;
    @FXML
    private TableColumn<Jogos, String> colunaTimeMandante;
    @FXML
    private TableColumn<Jogos, String> colunaTimeVisitante;
    @FXML
    private TableColumn<Jogos, Integer> colunaPlacarMandante;
    @FXML
    private TableColumn<Jogos, Integer> colunaPlacarVisitante;
    @FXML
    private TableColumn<Jogos, String> colunaEstadio;
    @FXML
    private TableColumn<Jogos, String> colunaHorario;
    @FXML
    private TableColumn<Jogos, String> colunaData;

    @FXML
    private TextField BotaoADDTimesMandante;
    @FXML
    private TextField BotaoADDTimeVisitante;
    @FXML
    private TextField BotaoADDPlacarMandante;
    @FXML
    private TextField BotaoADDPlacarVisitante;
    @FXML
    private TextField BotaoADDEstadio;
    @FXML
    private TextField BotaoADDHorario;
    @FXML
    private DatePicker BotaoADDData;

    // Lista observável para armazenar os jogos cadastrados
    private ObservableList<Jogos> listaJogos = FXCollections.observableArrayList();

    @FXML
    void BotaoADDTimeMandante(ActionEvent event) {
        timeMandante = BotaoADDTimesMandante.getText();
    }

    @FXML
    void BotaoADDTimeVisitante(ActionEvent event) {
        timeVisitante = BotaoADDTimeVisitante.getText();
    }

    @FXML
    void BotaoADDPlacarMandante(ActionEvent event) {
        placarMandante = Integer.parseInt(BotaoADDPlacarMandante.getText());
    }

    @FXML
    void BotaoADDPlacarVisitante(ActionEvent event) {
        placarVisitante = Integer.parseInt(BotaoADDPlacarVisitante.getText());
    }

    @FXML
    void BotaoADDEstadio(ActionEvent event) {
        estadio = BotaoADDEstadio.getText();
    }

    @FXML
    void BotaoADDHorario(ActionEvent event) {
        horario = BotaoADDHorario.getText();
    }

    @FXML
    void BotaoADDData(ActionEvent event) {
        data = BotaoADDData.getValue().toString();
    }

    @FXML
    void BotaoADDCadastrarJogo(ActionEvent event) {
        // Verifica se os campos estão preenchidos corretamente
        if (timeMandante.isEmpty() || timeVisitante.isEmpty() || placarMandante == 0 || placarVisitante == 0 || estadio.isEmpty() || horario.isEmpty() || data.isEmpty()) {
            System.out.println("Por favor, preencha todos os campos.");
        } else {
            // Criando o objeto de Jogo
            Jogos jogo = new Jogos(timeMandante, timeVisitante, placarMandante, placarVisitante, estadio, horario, data);
            System.out.println("Jogo cadastrado com sucesso!");

            // Adicionando o jogo à lista observável
            listaJogos.add(jogo);

            // Atualizando a TableView
            tabelaJogos.setItems(listaJogos);
        }
    }

}
