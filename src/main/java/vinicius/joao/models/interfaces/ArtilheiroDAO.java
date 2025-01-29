package vinicius.joao.models.interfaces;

import java.sql.SQLException;
import java.util.List;

import vinicius.joao.models.entities.Artilheiro;

public interface ArtilheiroDAO {
    void adicionarArtilheiro(Artilheiro artilheiro) throws SQLException;

    void editarArtilheiro(Artilheiro artilheiro) throws SQLException;

    void excluirArtilheiro(int id) throws SQLException;

    List<Artilheiro> listarArtilheiros() throws SQLException;
}
