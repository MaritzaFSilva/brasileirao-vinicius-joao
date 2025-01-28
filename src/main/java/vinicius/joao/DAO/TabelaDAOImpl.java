package vinicius.joao.DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import vinicius.joao.BD.FabricaConexoes;

public class TabelaDAOImpl {
    private Connection connection;

    public TabelaDAOImpl() throws SQLException {
        this.connection = FabricaConexoes.getInstance().getConnection();
    }

    public List<String[]> listarClassificacao() throws SQLException {
        List<String[]> classificacao = new ArrayList<>();
        String sql = "SELECT * FROM ViewTabela ORDER BY pontos DESC, vitorias DESC, gols_marcados DESC, gols_sofridos ASC";
        try (Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                classificacao.add(new String[]{
                    rs.getString("posicao"),
                    rs.getString("time_nome"),
                    String.valueOf(rs.getInt("pontos")),
                    String.valueOf(rs.getInt("jogos")),
                    String.valueOf(rs.getInt("vitorias")),
                    String.valueOf(rs.getInt("empates")),
                    String.valueOf(rs.getInt("derrotas"))
                });
            }
        }
        return classificacao;
    }
}

