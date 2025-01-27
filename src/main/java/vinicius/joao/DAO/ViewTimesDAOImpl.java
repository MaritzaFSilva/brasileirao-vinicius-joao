package vinicius.joao.DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import vinicius.joao.BD.FabricaConexoes;

public class ViewTimesDAOImpl {
    private Connection connection;

    public ViewTimesDAOImpl() throws SQLException {
        this.connection = FabricaConexoes.getInstance().getConnection();

    }

    public List<String[]> listarTimes() throws SQLException {
        List<String[]> times = new ArrayList<>();
        String sql = "SELECT * FROM ViewTimes ORDER BY time_nome";
        try (Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                times.add(new String[]{
                    rs.getString("time_id"),
                    rs.getString("time_nome"),
                    rs.getString("estadio_time"),
                    rs.getString("ano_fundacao"),
                    rs.getString("local_origem")
                });
            }
        }
        return times;
    }
}

