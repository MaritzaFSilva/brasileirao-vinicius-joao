package vinicius.joao.DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import vinicius.joao.BD.FabricaConexoes;

    public class ViewArtilheirosDAOImpl {
        private Connection connection;

     public ViewArtilheirosDAOImpl() throws SQLException {
          this.connection = FabricaConexoes.getInstance().getConnection();
        }

        public List<String[]> listarArtilheiros() throws SQLException {
            List<String[]> artilheiros = new ArrayList<>();
            String sql = "SELECT * FROM ViewArtilheiros ORDER BY total_gols DESC";
            try (Statement stmt = connection.createStatement();
                 ResultSet rs = stmt.executeQuery(sql)) {
                while (rs.next()) {
                    artilheiros.add(new String[]{
                        rs.getString("artilheiro_id"),
                        rs.getString("artilheiro_nome"),
                        rs.getString("time_nome"),
                        String.valueOf(rs.getInt("total_gols"))
                    });
                }
            }
            return artilheiros;
        }
    }
