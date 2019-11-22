/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelos.Cliente;
import modelos.Jogo;

/**
 *
 * @author Jamas
 */
public class ClienteDAO {

    private Connection conexao;

    public ClienteDAO() {
        conexao = SQLClasse.getConnection();

    }

    public List<Cliente> listar() {
        String sql = "select distinct nome_cliente from Cliente inner join Venda using (cpf_cliente) inner join Vendedor using (codigo_vend) where nome_vendedor = 'Lucas'";
        PreparedStatement ps = null;
        ResultSet rs = null;
        List<Cliente> cliente = new ArrayList();

        try {
            ps = conexao.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                Cliente c1 = new Cliente();
                c1.setNome_cliente(rs.getString("nome_cliente"));
                cliente.add(c1);

            }
        } catch (SQLException e) {
            System.out.println("erro : " +e);
        } finally {
            SQLClasse.closeConnection(conexao);
        }
        return cliente;
    }
}
