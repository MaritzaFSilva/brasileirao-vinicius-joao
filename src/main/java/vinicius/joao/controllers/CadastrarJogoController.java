package vinicius.joao.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

public class CadastrarJogoController {

    @FXML
    private TextField BotaoADDTimesMandante;
    @FXML
    private TextField BotaoADDTimeVisitante;
    @FXML
    private TextField BotaoADDPlacarMandante;
    @FXML
    private TextField BotaoADDPlacarVisitante;
    @FXML
    private DatePicker BotaoADDData;
    @FXML
    private TextField BotaoADDEstadio;
    @FXML
    private TextField BotaoADDHorario;

    // Método de inicialização que é chamado assim que o controlador é carregado
    public void initialize() {
        System.out.println("A aba Cadastrar Jogo foi inicializada.");
        // Aqui você pode inicializar valores padrão nos campos, se necessário.
    }

    // Método para o botão "Cadastrar Jogo"
    @FXML
    void BotaoADDCadastrarJogo(ActionEvent event) {
        // Coletar os dados inseridos pelo usuário
        String timeMandante = BotaoADDTimesMandante.getText();
        String timeVisitante = BotaoADDTimeVisitante.getText();
        String placarMandante = BotaoADDPlacarMandante.getText();
        String placarVisitante = BotaoADDPlacarVisitante.getText();
        String estadio = BotaoADDEstadio.getText();
        String horario = BotaoADDHorario.getText();
        String dataJogo = BotaoADDData.getValue() != null ? BotaoADDData.getValue().toString() : "";

        // Verificar se todos os campos estão preenchidos
        if (timeMandante.isEmpty() || timeVisitante.isEmpty() || placarMandante.isEmpty() || placarVisitante.isEmpty() || estadio.isEmpty() || horario.isEmpty() || dataJogo.isEmpty()) {
            // Exibir um alerta de erro caso algum campo esteja vazio
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Erro");
            alert.setHeaderText(null);
            alert.setContentText("Por favor, preencha todos os campos.");
            alert.showAndWait();
        } else {
            // Exibir mensagem de sucesso se o cadastro foi feito corretamente
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Sucesso");
            alert.setHeaderText(null);
            alert.setContentText("Jogo cadastrado com sucesso!");
            alert.showAndWait();
            // Limpar os campos após o cadastro
            limparCampos();
        }
    }

    // Método para limpar os campos do formulário
    private void limparCampos() {
        BotaoADDTimesMandante.clear();
        BotaoADDTimeVisitante.clear();
        BotaoADDPlacarMandante.clear();
        BotaoADDPlacarVisitante.clear();
        BotaoADDEstadio.clear();
        BotaoADDHorario.clear();
        BotaoADDData.setValue(null);
    }
}
