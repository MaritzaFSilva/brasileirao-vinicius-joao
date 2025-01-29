package vinicius.joao.DAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

import vinicius.joao.BD.FabricaConexoes;
import vinicius.joao.models.interfaces.JogoDAO;

public class CadastrarJogoDAOImpl implements JogoDAO {

    private Connection connection;

    public CadastrarJogoDAOImpl() throws SQLException {
        this.connection = FabricaConexoes.getInstance().getConnection();
    }

    @Override
    public void adicionarJogo(int timeCasa, int timeVisitante, int golsCasa, int golsVisitante, String estadio, Date dataJogo, Time horaJogo) throws SQLException {
        String sql = "INSERT INTO Jogos_Brasileirao (time_casa, time_visitante, gols_casa, gols_visitante, estadio, data_jogo, hora_jogo) VALUES (?, ?, ?, ?, ?, ?, ?)";

        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, timeCasa);
            stmt.setInt(2, timeVisitante);
            stmt.setInt(3, golsCasa);
            stmt.setInt(4, golsVisitante);
            stmt.setString(5, estadio);
            stmt.setDate(6, dataJogo);
            stmt.setTime(7, horaJogo);
            stmt.executeUpdate();
        }
    }

    @Override
    public void editarJogo(int id, int timeCasa, int timeVisitante, int golsCasa, int golsVisitante, String estadio, Date dataJogo, Time horaJogo) throws SQLException {
        String sql = "UPDATE Jogos_Brasileirao SET time_casa = ?, time_visitante = ?, gols_casa = ?, gols_visitante = ?, estadio = ?, data_jogo = ?, hora_jogo = ? WHERE id = ?";

        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, timeCasa);
            stmt.setInt(2, timeVisitante);
            stmt.setInt(3, golsCasa);
            stmt.setInt(4, golsVisitante);
            stmt.setString(5, estadio);
            stmt.setDate(6, dataJogo);
            stmt.setTime(7, horaJogo);
            stmt.setInt(8, id);
            stmt.executeUpdate();
        }
    }

    @Override
    public boolean excluirJogo(int id) throws SQLException {
        String sql = "DELETE FROM Jogos_Brasileirao WHERE id = ?";

        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, id);
            return stmt.executeUpdate() > 0;
        }
    }

    @Override
    public List<String[]> listarJogos() throws SQLException {
        List<String[]> jogos = new ArrayList<>();
        String sql = "SELECT j.id, tc.nome AS time_casa, tv.nome AS time_visitante, j.gols_casa, j.gols_visitante, j.estadio, j.data_jogo, j.hora_jogo " +
                     "FROM Jogos_Brasileirao j " +
                     "JOIN Times_Brasileirao tc ON j.time_casa = tc.id " +
                     "JOIN Times_Brasileirao tv ON j.time_visitante = tv.id " +
                     "ORDER BY j.data_jogo DESC";

        try (Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                jogos.add(new String[] {
                    String.valueOf(rs.getInt("id")),
                    rs.getString("time_casa"),
                    rs.getString("time_visitante"),
                    String.valueOf(rs.getInt("gols_casa")),
                    String.valueOf(rs.getInt("gols_visitante")),
                    rs.getString("estadio"),
                    rs.getString("data_jogo"),
                    rs.getString("hora_jogo")
                });
            }
        }
        return jogos;
    }
}
