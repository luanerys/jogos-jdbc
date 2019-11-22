package modelos;

public class Jogo {

    private int codigo_jogo;
    private String nome_jogo;
    private double preço;
    private int qntd_estoque;

    public Jogo() {
    }

    public Jogo(int codigo_jogo, String nome_jogo, double preço, int qntd_estoque) {
        this.codigo_jogo = codigo_jogo;
        this.nome_jogo = nome_jogo;
        this.preço = preço;
        this.qntd_estoque = qntd_estoque;
    }

    public int getCodigo_jogo() {
        return codigo_jogo;
    }

    public void setCodigo_jogo(int codigo_jogo) {
        this.codigo_jogo = codigo_jogo;
    }

    public String getNome_jogo() {
        return nome_jogo;
    }

    public void setNome_jogo(String nome_jogo) {
        this.nome_jogo = nome_jogo;
    }

    public double getPreço() {
        return preço;
    }

    public void setPreço(double preço) {
        this.preço = preço;
    }

    public int getQntd_estoque() {
        return qntd_estoque;
    }

    public void setQntd_estoque(int qntd_estoque) {
        this.qntd_estoque = qntd_estoque;
    }

}
