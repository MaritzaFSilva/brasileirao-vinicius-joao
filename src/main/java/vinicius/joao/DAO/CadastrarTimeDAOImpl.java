package vinicius.joao.DAO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import vinicius.joao.BD.FabricaConexoes;

public class CadastrarTimeDAOImpl {
    private Connection connection;

    public CadastrarTimeDAOImpl() throws SQLException {
         this.connection = FabricaConexoes.getInstance().getConnection();
    }

    public List<String[]> listar() throws SQLException {
        List<String[]> times = new ArrayList<>();
        String sql = "SELECT id, nome, estadio, ano_fundacao, local_origem FROM Times_Brasileirao";
        try (Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                times.add(new String[]{
                    String.valueOf(rs.getInt("id")),
                    rs.getString("nome"),
                    rs.getString("estadio"),
                    String.valueOf(rs.getInt("ano_fundacao")),
                    rs.getString("local_origem")
                });
            }
        }
        return times;
    }

    public void adicionar(String nome, String estadio, int anoFundacao, String localOrigem) throws SQLException {
        String sql = "INSERT INTO Times_Brasileirao (nome, estadio, ano_fundacao, local_origem) VALUES (?, ?, ?, ?)";
        try (PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setString(1, nome);
            pstmt.setString(2, estadio);
            pstmt.setInt(3, anoFundacao);
            pstmt.setString(4, localOrigem);
            pstmt.executeUpdate();
        }
    }

    public void atualizar(int id, String nome, String estadio, int anoFundacao, String localOrigem) throws SQLException {
        String sql = "UPDATE Times_Brasileirao SET nome = ?, estadio = ?, ano_fundacao = ?, local_origem = ? WHERE id = ?";
        try (PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setString(1, nome);
            pstmt.setString(2, estadio);
            pstmt.setInt(3, anoFundacao);
            pstmt.setString(4, localOrigem);
            pstmt.setInt(5, id);
            pstmt.executeUpdate();
        }
    }

    // Método para deletar um time
    public boolean deletar(int id) throws SQLException {
        String sql = "DELETE FROM Times_Brasileirao WHERE id = ?";
        try (PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            int rowsAffected = pstmt.executeUpdate();
            return rowsAffected > 0;
        }
    }
}
