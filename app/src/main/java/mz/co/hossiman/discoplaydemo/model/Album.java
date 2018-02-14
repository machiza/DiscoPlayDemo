package mz.co.hossiman.discoplaydemo.model;

/**
 * Created by secreto on 2/14/18.
 */

public class Album {

    private String cantor;
    private String titulo;
    private int thumbnail;
    private int anoLancamento;
    private String categoria;
    private String descricao;

    public Album() {
    }

    public Album(String cantor, String titulo, int thumbnail, int anoLancamento, String categoria, String descricao) {
        this.cantor = cantor;
        this.titulo = titulo;
        this.thumbnail = thumbnail;
        this.anoLancamento = anoLancamento;
        this.categoria = categoria;
        this.descricao = descricao;
    }

    // Getter's
    public String getCantor() {
        return cantor;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getThumbnail() {
        return thumbnail;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getDescricao() {
        return descricao;
    }

    // Setter
    public void setCantor(String cantor) {
        this.cantor = cantor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setThumbnail(int thumbnail) {
        this.thumbnail = thumbnail;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
