package vinicius.joao.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Tab;
import javafx.scene.control.TableView;

public class TabelaController {
    @FXML
    private Tab BotaoADDTabela;

    @FXML
    private TableView<?> tableView;

    public void initialize() {
        System.out.println("A aba Tabela foi inicializada.");
    }

}
