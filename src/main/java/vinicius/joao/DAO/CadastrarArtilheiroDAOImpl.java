package vinicius.joao.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import vinicius.joao.BD.FabricaConexoes;

public class CadastrarArtilheiroDAOImpl {
    private Connection connection;

    public CadastrarArtilheiroDAOImpl() throws SQLException {
        this.connection = FabricaConexoes.getInstance().getConnection();
    }

    // Método para listar todos os artilheiros
    public List<String[]> listar() throws SQLException {
        List<String[]> artilheiros = new ArrayList<>();
        String sql = "SELECT id, nome, time_nome, gols, jogos FROM Artilheiros_Brasileirao";
        try (Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                artilheiros.add(new String[]{
                    String.valueOf(rs.getInt("id")),
                    rs.getString("nome"),
                    rs.getString("time_nome"),
                    String.valueOf(rs.getInt("gols")),
                    String.valueOf(rs.getInt("jogos"))
                });
            }
        }
        return artilheiros;
    }

    // Método para cadastrar um artilheiro
    public void cadastrarArtilheiro(String nome, int timeId, int gols) throws SQLException {
        String sql = "INSERT INTO Artilheiros_Brasileirao (nome, time_id, gols) VALUES (?, ?, ?)";

        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, nome); // Nome do artilheiro
            stmt.setInt(2, timeId);  // ID do time do artilheiro
            stmt.setInt(3, gols);    // Número de gols do artilheiro

            stmt.executeUpdate();
        }
    }

    // Método para deletar um artilheiro
    public boolean deletar(int id) throws SQLException {
        String sql = "DELETE FROM Artilheiros_Brasileirao WHERE id = ?";
        try (PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            int rowsAffected = pstmt.executeUpdate();
            return rowsAffected > 0;
        }
    }
}
