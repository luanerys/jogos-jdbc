package dao;

import java.util.ArrayList;
import modelos.Cliente;
import modelos.Jogo;
import modelos.Venda;
import modelos.Vendedor;

public class OracleTeste {
    
    public static void main(String[] args){
        
        listar5();
        
        
        
        
  
        
    }
    
    
    public static void listar()
    {
        VendaDAO vdao = new VendaDAO();
        
        for(Venda v: vdao.listar()){
            System.out.println("Nome: "+v.getVendedor().getNome_vendedor());
            System.out.println("Quantidade: "+v.getCliente().getCpf_cliente());
        }
    }
    
    
    public static void listar2(){
        JogoDAO jdao = new JogoDAO();
        
        for(Jogo j:jdao.listar()){
            System.out.println("Nome: "+j.getNome_jogo());
            System.out.println("Preço: "+j.getPreço());
        }
    }
    
    
    public static void listar3(){
        JogoDAO jdao = new JogoDAO();
        
        for(Jogo j:jdao.listar2()){
            System.out.println("Nome: "+j.getNome_jogo());
        }
    }
    
    
    public static void listar4(){
        
        ClienteDAO cdao = new ClienteDAO();
        
        for(Cliente c:cdao.listar())
        {
            System.out.println("Nome: "+c.getNome_cliente());
        }
    }
    
    
    public static void listar5()
    {
        VendedorDAO vdao = new VendedorDAO();
        
        for(Vendedor v: vdao.listar())
        {
            System.out.println("ID: "+v.getCodigo_vend());
            System.out.println("Nome: "+v.getNome_vendedor());
        }
    }
}
