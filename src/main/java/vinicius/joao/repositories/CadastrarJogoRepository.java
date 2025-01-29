package vinicius.joao.repositories;

import java.sql.SQLException;
import java.util.List;

import vinicius.joao.DAO.CadastrarJogoDAOImpl;

public class CadastrarJogoRepository {

   static CadastrarJogoDAOImpl jogoDAO;

    public CadastrarJogoRepository() throws SQLException {
        this.jogoDAO = new CadastrarJogoDAOImpl();
    }

    // Método para listar todos os jogos
    public List<String[]> listarJogos() throws SQLException {
        return jogoDAO.listarJogos();
    }

    // Método para cadastrar um novo jogo
    public void cadastrarJogo(int timeCasa, int timeVisitante, int golsCasa, int golsVisitante, String estadio, java.sql.Date dataJogo, java.sql.Time horaJogo) throws SQLException {
        jogoDAO.adicionarJogo(timeCasa, timeVisitante, golsCasa, golsVisitante, estadio, dataJogo, horaJogo);
    }

    // Método para editar um jogo
    public void editarJogo(int id, int timeCasa, int timeVisitante, int golsCasa, int golsVisitante, String estadio, java.sql.Date dataJogo, java.sql.Time horaJogo) throws SQLException {
        jogoDAO.editarJogo(id, timeCasa, timeVisitante, golsCasa, golsVisitante, estadio, dataJogo, horaJogo);
    }

    // Método para excluir um jogo
    public boolean excluirJogo(int id) throws SQLException {
        return jogoDAO.excluirJogo(id);
    }
}
