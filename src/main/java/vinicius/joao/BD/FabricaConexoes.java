package vinicius.joao.BD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FabricaConexoes {

    private static int MAX_CONNECTIONS = 50;
    private final String USERNAME;
    private final String PASSWORD;
    private final String DATABASE_URL;


    private Connection[] conexoes;
    private static FabricaConexoes instance;

    private FabricaConexoes() {
        conexoes = new Connection[MAX_CONNECTIONS];

        USERNAME = "info22_vinicius";
        PASSWORD = "info22_vinicius";
        DATABASE_URL = "jdbc:mysql://wagnerweinert.com.br:3306/info22_vinicius";
    }

    public static FabricaConexoes getInstance() {
        if(instance != null) {
            return instance;
        }

        instance = new FabricaConexoes();
        return instance;
    }

    public Connection getConnection() throws SQLException {

        for (int i = 0; i < MAX_CONNECTIONS; i++) {

            if (instance.conexoes[i] == null || instance.conexoes[i].isClosed()) {
                instance.conexoes[i] = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
                return instance.conexoes[i];
            }
        }

        throw new SQLException("Máximo de conexões");
    }
}