package vinicius.joao.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import vinicius.joao.BD.FabricaConexoes;

public class TimesBrasileiraoDAOImpl {
    private Connection connection;

    public TimesBrasileiraoDAOImpl() throws SQLException {
         this.connection = FabricaConexoes.getInstance().getConnection();
    }

    public void adicionarTime(String nome, String estadio, String anoFundacao, String localOrigem) throws SQLException {
        String sql = "INSERT INTO Times_Brasileirao (nome, estadio, ano_fundacao, local_origem) VALUES (?, ?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, nome);
            stmt.setString(2, estadio);
            stmt.setString(3, anoFundacao);
            stmt.setString(4, localOrigem);
            stmt.executeUpdate();
        }
    }


    public void editarTime(int id, String nome, String estadio, String anoFundacao, String localOrigem) throws SQLException {
        String sql = "UPDATE Times_Brasileirao SET nome = ?, estadio = ?, ano_fundacao = ?, local_origem = ? WHERE id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, nome);
            stmt.setString(2, estadio);
            stmt.setString(3, anoFundacao);
            stmt.setString(4, localOrigem);
            stmt.setInt(5, id);
            stmt.executeUpdate();
        }
    }


    public void excluirTime(int id) throws SQLException {
        String sql = "DELETE FROM Times_Brasileirao WHERE id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        }
    }


    public List<String[]> listarTimes() throws SQLException {
        List<String[]> times = new ArrayList<>();
        String sql = "SELECT id, nome, estadio, ano_fundacao, local_origem FROM Times_Brasileirao ORDER BY nome ASC";
        try (Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                times.add(new String[]{
                    rs.getString("id"),
                    rs.getString("nome"),
                    rs.getString("estadio"),
                    rs.getString("ano_fundacao"),
                    rs.getString("local_origem")
                });
            }
        }
        return times;
    }
}