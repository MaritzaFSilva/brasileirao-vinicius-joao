package vinicius.joao.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Tab;
import javafx.scene.control.TableView;

public class TabelaController {
    @FXML
    private Tab BotaoADDTabela;

    @FXML
    private TableView<?> tableView;  // Supondo que a tabela seja generica, você pode definir o tipo conforme necessário

    public void initialize() {
        // Ações para a aba Tabela, como carregar dados na TableView
        System.out.println("A aba Tabela foi inicializada.");
    }

    // Outros métodos específicos para a aba Tabela
}
