package mz.co.hossiman.discoplaydemo.model;

/**
 * Created by secreto on 2/13/18.
 */

public class Musica {

    private String cantor;
    private String titulo;
    private String duracao;

    public Musica() {
    }

    public Musica(String cantor, String titulo, String duracao) {
        this.cantor = cantor;
        this.titulo = titulo;
        this.duracao = duracao;
    }

    // Getter
    public String getCantor() {
        return cantor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDuracao() {
        return duracao;
    }

    // Setter
    public void setCantor(String cantor) {
        this.cantor = cantor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }
}
