package modelos;

public class Vendedor {
    
    private int codigo_vend;
    private String nome_vendedor;

    public Vendedor(){
    }
    
    
    public Vendedor(int codigo_vend, String nome_vendedor) {
        this.codigo_vend = codigo_vend;
        this.nome_vendedor = nome_vendedor;
    }

    public int getCodigo_vend() {
        return codigo_vend;
    }

    public void setCodigo_vend(int codigo_vend) {
        this.codigo_vend = codigo_vend;
    }

    public String getNome_vendedor() {
        return nome_vendedor;
    }

    public void setNome_vendedor(String nome_vendedor) {
        this.nome_vendedor = nome_vendedor;
    }
    
    
    
}
