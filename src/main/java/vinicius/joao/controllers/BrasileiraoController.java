package vinicius.joao.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;

public class BrasileiraoController {

    @FXML
    private TabPane tabPane; // Referência ao TabPane no FXML

    @FXML
    private Tab BotaoADDTabela;
    @FXML
    private Tab BotaoADDArtilheiros;
    @FXML
    private Tab BotaoADDTimesCadastrados;
    @FXML
    private Tab BotaoADDCadastroTimes;
    @FXML
    private Tab BotaoADDCadastroJogos;

    // Método para alternar as abas programaticamente
    public void switchTab(Tab tab) {
        tabPane.getSelectionModel().select(tab); // Troca para a aba especificada
    }

    // Método para ir para a aba "Tabela"
    @FXML
    private void onSwitchToTabela() {
        switchTab(BotaoADDTabela); // Alterna para a aba "Tabela"
    }

    // Método para ir para a aba "Artilheiros"
    @FXML
    private void onSwitchToArtilheiros() {
        switchTab(BotaoADDArtilheiros); // Alterna para a aba "Artilheiros"
    }

    // Método para ir para a aba "Times"
    @FXML
    private void onSwitchToTimes() {
        switchTab(BotaoADDTimesCadastrados); // Alterna para a aba "Times"
    }

    // Método para ir para a aba "Cadastrar Times"
    @FXML
    private void onSwitchToCadastroTimes() {
        switchTab(BotaoADDCadastroTimes); // Alterna para a aba "Cadastrar Times"
    }

    // Método para ir para a aba "Cadastrar Jogos"
    @FXML
    private void onSwitchToCadastroJogos() {
        switchTab(BotaoADDCadastroJogos); // Alterna para a aba "Cadastrar Jogos"
    }
}
