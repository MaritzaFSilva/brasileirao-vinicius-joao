package vinicius.joao.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import vinicius.joao.BD.FabricaConexoes;
import vinicius.joao.models.entities.Artilheiro;
import vinicius.joao.models.interfaces.ArtilheiroDAO;

public class ArtilheiroDAOImpl implements ArtilheiroDAO {
    private Connection connection;

    public ArtilheiroDAOImpl() throws SQLException {
        this.connection = FabricaConexoes.getInstance().getConnection();
    }

    public void cadastrarArtilheiro(String nome, int timeId, int gols) throws SQLException {
        String sql = "INSERT INTO Artilheiros_Brasileirao (nome, time_id, gols) VALUES (?, ?, ?)";

        try (PreparedStatement stmt = connection.prepareStatement(sql)) {

            stmt.setString(1, nome);
            stmt.setInt(2, timeId);
            stmt.setInt(3, gols);
            stmt.executeUpdate();
        }
    }

    @Override
    public void editarArtilheiro(Artilheiro artilheiro) throws SQLException {
        String sql = "UPDATE Artilheiros SET nome = ?, time_id = ?, gols = ? WHERE id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, artilheiro.getNome());
            stmt.setInt(2, artilheiro.getTimeId());
            stmt.setInt(3, artilheiro.getGols());
            stmt.setInt(4, artilheiro.getId());
            stmt.executeUpdate();
        }
    }

    @Override
    public void excluirArtilheiro(int id) throws SQLException {
        String sql = "DELETE FROM Artilheiros WHERE id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        }
    }

    @Override
    public List<Artilheiro> listarArtilheiros() throws SQLException {
        List<Artilheiro> artilheiros = new ArrayList<>();
        String sql = "SELECT * FROM Artilheiros";
        try (Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Artilheiro artilheiro = new Artilheiro(
                    rs.getInt("id"),
                    rs.getString("nome"),
                    rs.getInt("gols"),
                    rs.getInt("time_id")
                );
                artilheiros.add(artilheiro);
            }
        }
        return artilheiros;
    }

    @Override
    public void adicionarArtilheiro(Artilheiro artilheiro) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
