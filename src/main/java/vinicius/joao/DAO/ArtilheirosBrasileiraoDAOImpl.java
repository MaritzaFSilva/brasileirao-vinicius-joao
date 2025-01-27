package vinicius.joao.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import vinicius.joao.BD.FabricaConexoes;
public class ArtilheirosBrasileiraoDAOImpl {
    private Connection connection;

    public ArtilheirosBrasileiraoDAOImpl() throws SQLException {
         this.connection = FabricaConexoes.getInstance().getConnection();
    }

    public void adicionarArtilheiro(int timeId, String nomeJogador, int gols) throws SQLException {
        String sql = "INSERT INTO Artilheiros_Brasileirao (time_id, nome, gols) VALUES (?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, timeId);
            stmt.setString(2, nomeJogador);
            stmt.setInt(3, gols);
            stmt.executeUpdate();
        }
    }

    public void editarArtilheiro(int id, int timeId, String nomeJogador, int gols) throws SQLException {
        String sql = "UPDATE Artilheiros_Brasileirao SET time_id = ?, nome = ?, gols = ? WHERE id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, timeId);
            stmt.setString(2, nomeJogador);
            stmt.setInt(3, gols);
            stmt.setInt(4, id);
            stmt.executeUpdate();
        }
    }


    public void excluirArtilheiro(int id) throws SQLException {
        String sql = "DELETE FROM Artilheiros_Brasileirao WHERE id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        }
    }

    public List<String[]> listarArtilheiros() throws SQLException {
        List<String[]> artilheiros = new ArrayList<>();
        String sql = "SELECT a.id, a.nome, t.nome AS time_nome, a.gols " +
                     "FROM Artilheiros_Brasileirao a " +
                     "JOIN Times_Brasileirao t ON a.time_id = t.id " +
                     "ORDER BY a.gols DESC";
        try (Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                artilheiros.add(new String[]{
                    rs.getString("id"),
                    rs.getString("nome"),
                    rs.getString("time_nome"),
                    String.valueOf(rs.getInt("gols"))
                });
            }
        }
        return artilheiros;
    }
}

