package vinicius.joao.model.interfaces;

import java.util.List;

import vinicius.joao.model.entities.Artilheiro;

public interface ArtilheiroDAO {

    void adicionarArtilheiro(Artilheiro artilheiro);

    void atualizarArtilheiro(Artilheiro artilheiro);

    void removerArtilheiro(Long id);

    List<Artilheiro> listarArtilheiros();

    Artilheiro buscarArtilheiroPorId(Long id);
}
