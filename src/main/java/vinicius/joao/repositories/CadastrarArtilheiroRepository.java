package vinicius.joao.repositories;

import vinicius.joao.DAO.CadastrarArtilheiroDAOImpl;

public class CadastrarArtilheiroRepository {

    // Implementar métodos para cadastrar artilheiros no banco de dados
    CadastrarArtilheiroDAOImpl CadastrarArtilheiroDAOImpl;

    public CadastrarArtilheiroRepository(vinicius.joao.DAO.CadastrarArtilheiroDAOImpl cadastrarArtilheiroDAOImpl) {
        CadastrarArtilheiroDAOImpl = cadastrarArtilheiroDAOImpl;
    }

    
}