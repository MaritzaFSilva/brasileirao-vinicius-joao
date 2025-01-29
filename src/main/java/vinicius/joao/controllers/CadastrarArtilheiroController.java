package vinicius.joao.controllers;

import java.sql.SQLException;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import vinicius.joao.repositories.CadastrarArtilheiroRepository;


public class CadastrarArtilheiroController{
    @FXML
    private TextField BotaoADDNomeTimeAt;
    @FXML
    private TextField BotaoADDQuantidadeJogos;
    @FXML
    private TextField BotaoADDNomeArtilheiro;
    @FXML
    private TextField BotaoADDQuantidadeGols;

    CadastrarArtilheiroRepository cadastrarArtilheirosRepository;

public void adicionarArtilheiro() throws SQLException {

    cadastrarArtilheirosRepository = new CadastrarArtilheiroRepository();

    String nome = BotaoADDNomeTimeAt.getText();
    String quantidade_de_jogosString = BotaoADDQuantidadeJogos.getText();
    String nome_do_artilheiro = BotaoADDNomeArtilheiro.getText();
    String quantidade_de_golsString = BotaoADDQuantidadeGols.getText();

    int quantidade_de_jogos = -1;
    int quantidade_de_gols = -1;

    try{
        quantidade_de_jogos = Integer.parseInt(quantidade_de_jogosString);
        quantidade_de_gols = Integer.parseInt(quantidade_de_golsString);
    }catch(NumberFormatException e){
        System.out.println("Por favor, insira valores numéricos para quantidade de jogos e gols.");
        return;
    }

    }
}