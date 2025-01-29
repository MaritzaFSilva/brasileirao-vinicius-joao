package vinicius.joao.controllers;

import java.sql.SQLException;
import vinicius.joao.repositories.CadastrarArtilheiroRepository;

public class ArtilheiroController {

   static CadastrarArtilheiroRepository repository;

    public ArtilheiroController() throws SQLException {
        this.repository = new CadastrarArtilheiroRepository();
    }

    public void cadastrarArtilheiro(String nome, int timeId, int gols) {
        try {
            repository.cadastrarArtilheiro(nome, timeId, gols);
            System.out.println("Artilheiro cadastrado com sucesso!");
        } catch (SQLException e) {
            System.err.println("Erro ao cadastrar artilheiro: " + e.getMessage());
        }
    }

    public static void main(String[] args) throws SQLException {
        ArtilheiroController controller = new ArtilheiroController();
        String nomeArtilheiro = "Gabigol";
        int timeId = 1;
        int gols = 10;

        controller.cadastrarArtilheiro(nomeArtilheiro, timeId, gols);
    }
}
