package vinicius.joao.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class TimesBrasileiraoDAOImpl {
    private Connection connection;

    public TimesBrasileiraoDAOImpl(Connection connection) {
        this.connection = connection;
    }

        public List<String[]> listarTimes() throws SQLException {
        List<String[]> times = new ArrayList<>();
        String sql = "SELECT id, nome, estado, cidade, pontos FROM Times_Brasileirao ORDER BY pontos DESC";
        try (Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                times.add(new String[]{
                    rs.getString("id"),
                    rs.getString("nome"),
                    rs.getString("estado"),
                    rs.getString("cidade"),
                    String.valueOf(rs.getInt("pontos"))
                });
            }
        }
        return times;
    }

     public void adicionarTime(String nome, String estado, String cidade) throws SQLException {
        String sql = "INSERT INTO Times_Brasileirao (nome, estado, cidade) VALUES (?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, nome);
            stmt.setString(2, estado);
            stmt.setString(3, cidade);
            stmt.executeUpdate();
        }
    }

     public void atualizarPontos(int id, int pontos) throws SQLException {
        String sql = "UPDATE Times_Brasileirao SET pontos = ? WHERE id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, pontos);
            stmt.setInt(2, id);
            stmt.executeUpdate();
        }
    }

     public void deletarTime(int id) throws SQLException {
        String sql = "DELETE FROM Times_Brasileirao WHERE id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        }
    }
}
