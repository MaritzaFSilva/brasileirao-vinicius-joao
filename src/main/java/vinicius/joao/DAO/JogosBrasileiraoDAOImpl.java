package vinicius.joao.DAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
;

public class JogosBrasileiraoDAOImpl {
    private Connection connection;

    public JogosBrasileiraoDAOImpl(Connection connection) {
        this.connection = connection;
    }

    // Método para listar os jogos
    public List<String[]> listarJogos() throws SQLException {
        List<String[]> jogos = new ArrayList<>();
        String sql = "SELECT j.id, tc.nome AS time_casa, tv.nome AS time_visitante, j.gols_casa, j.gols_visitante, j.data_jogo " +
                     "FROM Jogos_Brasileirao j " +
                     "JOIN Times_Brasileirao tc ON j.time_casa = tc.id " +
                     "JOIN Times_Brasileirao tv ON j.time_visitante = tv.id";
        try (Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                jogos.add(new String[]{
                    rs.getString("id"),
                    rs.getString("time_casa"),
                    rs.getString("time_visitante"),
                    String.valueOf(rs.getInt("gols_casa")),
                    String.valueOf(rs.getInt("gols_visitante")),
                    rs.getString("data_jogo")
                });
            }
        }
        return jogos;
    }

    // Método para cadastrar um novo jogo usando uma stored procedure
    public void cadastrarJogo(int timeCasa, int timeVisitante, int golsCasa, int golsVisitante, Date dataJogo) throws SQLException {
        String sql = "CALL CadastrarJogo(?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, timeCasa);
            stmt.setInt(2, timeVisitante);
            stmt.setInt(3, golsCasa);
            stmt.setInt(4, golsVisitante);
            stmt.setDate(5, dataJogo);
            stmt.executeUpdate();
        }
    }

    // Método para deletar um jogo
    public void deletarJogo(int jogoId) throws SQLException {
        String sql = "DELETE FROM Jogos_Brasileirao WHERE id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, jogoId);
            stmt.executeUpdate();
        }
    }
}

