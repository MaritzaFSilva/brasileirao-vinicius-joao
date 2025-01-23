package vinicius.joao.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextField;

public class CadastroTimesController {

    @FXML
    private TextField BotaoADDNomeTime;

    @FXML
    private TextField BotaoADDLocalOrigem;  // Corrigido para "LocalOrigem"

    @FXML
    private TextField BotaoADDEstadio;

    @FXML
    private TextField BotaoADDAnoFundacao;

    @FXML
    private TextField BotaoADDCorUniforme;

    @FXML
    private TextField BotaoADDABVNomeTime;

    // Método de inicialização para a aba
    public void initialize() {
        System.out.println("A aba Cadastro Times foi inicializada.");
    }

    // Método para lidar com o evento de cadastro de time
    @FXML
    void BotaoADDCadastrarTime() {
        // Recuperando os valores inseridos nos campos de texto
        String nomeTime = BotaoADDNomeTime.getText();
        String localOrigem = BotaoADDLocalOrigem.getText(); // Corrigido para "localOrigem"
        String estadio = BotaoADDEstadio.getText();
        String anoFundacao = BotaoADDAnoFundacao.getText();
        String corUniforme = BotaoADDCorUniforme.getText();

        // Validando se todos os campos foram preenchidos
        if (nomeTime.isEmpty() || localOrigem.isEmpty() || estadio.isEmpty() || anoFundacao.isEmpty() || corUniforme.isEmpty()) {
            // Exibindo um alerta caso algum campo esteja vazio
            Alert alert = new Alert(AlertType.WARNING);
            alert.setTitle("Campos obrigatórios");
            alert.setHeaderText("Preencha todos os campos");
            alert.setContentText("Todos os campos devem ser preenchidos para cadastrar o time.");
            alert.showAndWait();
        } else {
            // Caso todos os campos sejam preenchidos, exibe um alerta de sucesso
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("Cadastro realizado");
            alert.setHeaderText("Time cadastrado com sucesso!");
            alert.setContentText("Time: " + nomeTime + "\nLocal de Origem: " + localOrigem + "\nEstádio: " + estadio + "\nAno de Fundação: " + anoFundacao + "\nCor do Uniforme: " + corUniforme);
            alert.showAndWait();

            // Limpa os campos após cadastro (opcional)
            BotaoADDNomeTime.clear();
            BotaoADDLocalOrigem.clear();
            BotaoADDEstadio.clear();
            BotaoADDAnoFundacao.clear();
            BotaoADDCorUniforme.clear();
        }
    }
}
