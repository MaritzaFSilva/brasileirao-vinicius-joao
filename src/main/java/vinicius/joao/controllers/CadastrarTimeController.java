package vinicius.joao.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import vinicius.joao.models.entities.Time;
import vinicius.joao.repositories.CadastrarTimeRepository;

import java.sql.SQLException;
import java.time.LocalDate;

public class CadastrarTimeController {

    @FXML
    private TextField BotaoADDCadastrarNomeTime;

    @FXML
    private TextField BotaoADDCadastrarNomeEstadio;

    @FXML
    private DatePicker BotaoADDCadastrarDataFundacao;

    @FXML
    private TextField BotaoADDCadastrarLocalOrigem;

    @FXML
    private Button BotaoADDCadastrarTime;

    private static CadastrarTimeRepository cadastrarTimeRepository;

    static {
        try {
            cadastrarTimeRepository = new CadastrarTimeRepository();
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Erro ao conectar com o banco de dados.");
        }
    }

    @FXML
    public void cadastrarTime(ActionEvent event) {
        String nome = BotaoADDCadastrarNomeTime.getText();
        String estadio = BotaoADDCadastrarNomeEstadio.getText();
        LocalDate dataFundacao = BotaoADDCadastrarDataFundacao.getValue();
        String localOrigem = BotaoADDCadastrarLocalOrigem.getText();

        if (nome.isEmpty() || estadio.isEmpty() || localOrigem.isEmpty()) {
            System.out.println("Todos os campos obrigatórios devem ser preenchidos.");
            return;
        }

        Time time = new Time(nome, estadio, dataFundacao, localOrigem);

  }
}
