package vinicius.joao.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import vinicius.joao.model.entities.Artilheiro;

public class ArtilheiroDAOImpl {
    private Connection connection;

    public ArtilheiroDAOImpl(Connection connection) {
        this.connection = connection;
    }

    public void cadastrarArtilheiro(int timeId, String nome, int gols) throws SQLException {
        String sql = "INSERT INTO Artilheiros_Brasileirao (nome, time_id, gols) VALUES (?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, nome);
            stmt.setInt(2, timeId);
            stmt.setInt(3, gols);
            stmt.executeUpdate();
        }
    }

    public List<Artilheiro> listarArtilheiros() throws SQLException {
        List<Artilheiro> artilheiros = new ArrayList<>();
        String sql = "SELECT * FROM Artilheiros_Brasileirao";
        try (Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                artilheiros.add(new Artilheiro(rs.getLong("id"), rs.getString("nome"),
                        rs.getInt("gols"), rs.getInt("jogos")));
            }
        }
        return artilheiros;
    }
    public List<Artilheiro> listarArtilheirosPorTime(int timeId) throws SQLException {
        List<Artilheiro> artilheiros = new ArrayList<>();
        String sql = "SELECT * FROM Artilheiros_Brasileirao WHERE time_id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, timeId);
            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    artilheiros.add(new Artilheiro(rs.getLong("id"), rs.getString("nome"),
                            rs.getInt("gols"), rs.getInt("jogos")));
                }
            }
        }
        return artilheiros;
    }
}
