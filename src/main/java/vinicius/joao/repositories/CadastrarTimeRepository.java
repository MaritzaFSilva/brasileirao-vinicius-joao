package vinicius.joao.repositories;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import vinicius.joao.models.entities.Time;

public class CadastrarTimeRepository {

    private static final String DB_URL = "jdbc:mysql://localhost:3306/seu_banco";
    private static final String DB_USER = "seu_usuario";
    private static final String DB_PASSWORD = "sua_senha";

    private Connection connection;

    public CadastrarTimeRepository() throws SQLException {
        connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
        System.out.println("Conexão com o banco de dados estabelecida.");
    }

    public void cadastrarTime(Time time) throws SQLException {
        String sql = "INSERT INTO times (nome, estadio, data_fundacao, local_origem) VALUES (?, ?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, time.getNome());
            stmt.setString(2, time.getEstadio());
            stmt.setDate(3, java.sql.Date.valueOf(time.getDataFundacao()));
            stmt.setString(4, time.getLocalOrigem());
            stmt.executeUpdate();
        }
    }
}
