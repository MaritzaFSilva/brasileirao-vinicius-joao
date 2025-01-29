package vinicius.joao.repositories;

import java.sql.SQLException;

import vinicius.joao.DAO.CadastrarArtilheiroDAOImpl;

public class CadastrarArtilheiroRepository {

    private CadastrarArtilheiroDAOImpl dao;

    public CadastrarArtilheiroRepository() throws SQLException {
        this.dao = new CadastrarArtilheiroDAOImpl();
    }

    public void cadastrarArtilheiro(String nome, int timeId, int gols) throws SQLException {
        dao.cadastrarArtilheiro(nome, timeId, gols); // Passando os parâmetros corretamente
    }
}
