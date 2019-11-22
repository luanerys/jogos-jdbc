package modelos;

public class Cliente {

    private int cpf_cliente;
    private String nome_cliente;
    private int contato_cliente;

    public Cliente() {

    }

    public Cliente(int cpf_cliente, String nome_cliente, int contato_cliente) {
        this.cpf_cliente = cpf_cliente;
        this.nome_cliente = nome_cliente;
        this.contato_cliente = contato_cliente;
    }

    public int getCpf_cliente() {
        return cpf_cliente;
    }

    public void setCpf_cliente(int cpf_cliente) {
        this.cpf_cliente = cpf_cliente;
    }

    public String getNome_cliente() {
        return nome_cliente;
    }

    public void setNome_cliente(String nome_cliente) {
        this.nome_cliente = nome_cliente;
    }

    public int getContato_cliente() {
        return contato_cliente;
    }

    public void setContato_cliente(int contato_cliente) {
        this.contato_cliente = contato_cliente;
    }

}
