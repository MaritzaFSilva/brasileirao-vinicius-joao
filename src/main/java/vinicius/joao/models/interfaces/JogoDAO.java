package vinicius.joao.models.interfaces;

import java.sql.Date;
import java.sql.SQLException;
import java.sql.Time;
import java.util.List;

public interface JogoDAO {

    // Método para adicionar um jogo
    void adicionarJogo(int timeCasa, int timeVisitante, int golsCasa, int golsVisitante, String estadio, Date dataJogo, Time horaJogo) throws SQLException;

    // Método para editar um jogo
    void editarJogo(int id, int timeCasa, int timeVisitante, int golsCasa, int golsVisitante, String estadio, Date dataJogo, Time horaJogo) throws SQLException;

    // Método para excluir um jogo
    boolean excluirJogo(int id) throws SQLException;

    // Método para listar jogos
    List<String[]> listarJogos() throws SQLException;
}
