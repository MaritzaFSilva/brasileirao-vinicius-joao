package vinicius.joao.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
;

public class ArtilheirosBrasileiraoDAOImpl {

     private Connection connection;

    public ArtilheirosBrasileiraoDAOImpl(Connection connection) {
        this.connection = connection;
    }

    public List<String[]> listarArtilheiros() throws SQLException {
        List<String[]> artilheiros = new ArrayList<>();
        String sql = "SELECT * FROM ViewArtilheirosDetalhados";
        try (Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                artilheiros.add(new String[]{
                    rs.getString("artilheiro_id"),
                    rs.getString("artilheiro_nome"),
                    rs.getString("time_nome"),
                    String.valueOf(rs.getInt("gols"))
                });
            }
        }
        return artilheiros;
    }

    public void adicionarArtilheiro(String nome, int timeId, int gols) throws SQLException {
        String sql = "INSERT INTO Artilheiros_Brasileirao (nome, time_id, gols) VALUES (?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, nome);
            stmt.setInt(2, timeId);
            stmt.setInt(3, gols);
            stmt.executeUpdate();
        }
    }

    public void atualizarGols(int artilheiroId, int gols) throws SQLException {
        String sql = "CALL AtualizarArtilheiro(?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, artilheiroId);
            stmt.setInt(2, gols);
            stmt.executeUpdate();
        }
    }

    public void deletarArtilheiro(int artilheiroId) throws SQLException {
        String sql = "DELETE FROM Artilheiros_Brasileirao WHERE id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, artilheiroId);
            stmt.executeUpdate();
        }
    }
}

