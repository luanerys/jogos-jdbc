package modelos;

public class Venda {
    
    private Vendedor vendedor;
    private Cliente cliente;
    private Jogo jogo;
    private int codigo_venda;
    
    public Venda(){
        
    }

    public Venda(Vendedor vendedor, Cliente cliente, Jogo jogo, int codigo_venda) {
        this.vendedor = vendedor;
        this.cliente = cliente;
        this.jogo = jogo;
        this.codigo_venda = codigo_venda;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Jogo getJogo() {
        return jogo;
    }

    public void setJogo(Jogo jogo) {
        this.jogo = jogo;
    }

    public int getCodigo_venda() {
        return codigo_venda;
    }

    public void setCodigo_venda(int codigo_venda) {
        this.codigo_venda = codigo_venda;
    }
    
    
    
    
}
