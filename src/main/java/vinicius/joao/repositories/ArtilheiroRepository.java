package vinicius.joao.repositories;

import java.sql.SQLException;

import vinicius.joao.DAO.CadastrarArtilheiroDAOImpl;

public class ArtilheiroRepository {

    static CadastrarArtilheiroDAOImpl cadastrarArtilheiroDAO;

    public ArtilheiroRepository() throws SQLException {
        this.cadastrarArtilheiroDAO = new CadastrarArtilheiroDAOImpl();
    }

    // Método para cadastrar um artilheiro
    public void cadastrarArtilheiro(String nome, int timeId, int gols) throws SQLException {
                cadastrarArtilheiroDAO.cadastrarArtilheiro(nome, timeId, gols);
    }
}
