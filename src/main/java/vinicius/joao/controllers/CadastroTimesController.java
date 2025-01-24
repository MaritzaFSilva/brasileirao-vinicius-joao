package vinicius.joao.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Tab;
import javafx.scene.control.TextField;

public class CadastroTimesController {

  @FXML
  private Tab BotaoADDCadastroTimes;

  @FXML
  private TextField BotaoADDCadastrarNomeTime;

  @FXML
  private TextField BotaoADDCadastrarNomeEstadio;

  @FXML
  private TextField BotaoADDCadastroABVtimes;

  @FXML
  private DatePicker BotaoADDCadastrarDataFundacao;

  @FXML
  private TextField BotaoADDCadastrarLocalOrigem;

  @FXML
  private TextField BotaoADDCadastrarQuantidadeJogadores;

  @FXML
  private Button BotaoADDCadastrarTime;

  @FXML
  void BotaoADDCadastroTimes(ActionEvent event) {

  }

  @FXML
  void BotaoADDCadastrarDataFundacao(ActionEvent event) {

  }

  @FXML
  void BotaoADDCadastrarNomeEstadio(ActionEvent event) {
  }

  @FXML
  void BotaoADDCadastrarNomeTime(ActionEvent event) {

  }

  @FXML
  void BotaoADDCadastrarQuantidadeJogadores(ActionEvent event) {

  }

  @FXML
  void BotaoADDCadastrarTime(ActionEvent event) {
    // Método de ação para cadastrar um time
    String nomeTime = BotaoADDCadastrarNomeTime.getText();
    String nomeEstadio = BotaoADDCadastrarNomeEstadio.getText();
    String abvTime = BotaoADDCadastroABVtimes.getText();
    String localOrigem = BotaoADDCadastrarLocalOrigem.getText();
    String quantidadeJogadores = BotaoADDCadastrarQuantidadeJogadores.getText();
    String dataFundacao = BotaoADDCadastrarDataFundacao.getValue() != null ? BotaoADDCadastrarDataFundacao.getValue().toString() : "";

    if (nomeTime.isEmpty() || nomeEstadio.isEmpty() || abvTime.isEmpty() || localOrigem.isEmpty() || quantidadeJogadores.isEmpty() || dataFundacao.isEmpty()) {
        System.out.println("Todos os campos são obrigatórios!");
    } else {
        int jogadores = Integer.parseInt(quantidadeJogadores);
        salvarTime(nomeTime, nomeEstadio, abvTime, localOrigem, jogadores, dataFundacao);
    }
  }

  @FXML
  void BotaoADDCadastrarLocalOrigem(ActionEvent event) {
  }

  private void salvarTime(String nomeTime, String nomeEstadio, String abvTime, String localOrigem, int jogadores, String dataFundacao) {
    System.out.println("Time cadastrado: " + nomeTime);

  }

}
