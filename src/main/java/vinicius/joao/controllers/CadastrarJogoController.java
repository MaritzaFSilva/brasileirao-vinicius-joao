package vinicius.joao.controllers;

import java.sql.Date;
import java.sql.SQLException;
import java.sql.Time;
import java.time.LocalDate;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import vinicius.joao.repositories.JogoRepository;

public class CadastrarJogoController {

    @FXML
    private TextField BotaoADDTimeCasa;

    @FXML
    private TextField BotaoADDTimeVisitante;

    @FXML
    private TextField BotaoADDPlacarCasa;

    @FXML
    private TextField BotaoADDPlacarVisitante;

    @FXML
    private TextField BotaoADDEstadio;

    @FXML
    private DatePicker BotaoADDDataJogo;

    @FXML
    private TextField BotaoADDHoraJogo;

    private JogoRepository jogoRepository;

    public CadastrarJogoController() {
        try {
            this.jogoRepository = new JogoRepository();
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Erro ao conectar com o banco de dados.");
        }
    }

    @FXML
    public void cadastrarJogo(ActionEvent event) {
        try {
            // Recuperando dados do formulário
            String timeCasa = BotaoADDTimeCasa.getText();
            String timeVisitante = BotaoADDTimeVisitante.getText();
            int placarCasa = Integer.parseInt(BotaoADDPlacarCasa.getText());
            int placarVisitante = Integer.parseInt(BotaoADDPlacarVisitante.getText());
            String estadio = BotaoADDEstadio.getText();
            LocalDate dataJogo = BotaoADDDataJogo.getValue();
            String horaJogo = BotaoADDHoraJogo.getText();

            // Validando dados
            if (timeCasa.isEmpty() || timeVisitante.isEmpty() || estadio.isEmpty() || dataJogo == null || horaJogo.isEmpty()) {
                System.out.println("Todos os campos obrigatórios devem ser preenchidos.");
                return;
            }

            // Convertendo LocalDate e String para os tipos adequados para o banco
            Date data = Date.valueOf(dataJogo);
            Time hora = Time.valueOf(horaJogo + ":00"); // Supondo que a hora seja inserida como "HH:MM"

            // Cadastrando o jogo
            jogoRepository.cadastrarJogo(Integer.parseInt(timeCasa), Integer.parseInt(timeVisitante), placarCasa, placarVisitante, estadio, data, hora);

            // Limpar os campos após o cadastro
            limparCampos();

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Erro ao cadastrar o jogo.");
        } catch (NumberFormatException e) {
            e.printStackTrace();
            System.out.println("Erro ao converter os dados numéricos.");
        }
    }

    private void limparCampos() {
        BotaoADDTimeCasa.clear();
        BotaoADDTimeVisitante.clear();
        BotaoADDPlacarCasa.clear();
        BotaoADDPlacarVisitante.clear();
        BotaoADDEstadio.clear();
        BotaoADDHoraJogo.clear();
        BotaoADDDataJogo.setValue(null);
    }
}
