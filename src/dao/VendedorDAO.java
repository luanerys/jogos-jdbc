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
import modelos.Venda;
import modelos.Vendedor;

/**
 *
 * @author Jamas
 */
public class VendedorDAO {

    private Connection conexao;

    public VendedorDAO() {
        conexao = SQLClasse.getConnection();

    }

    public List<Vendedor> listar() {

        String sql = "select nome_vendedor, codigo_vend from Vendedor where codigo_vend not in (select codigo_vend from Venda)";
        PreparedStatement ps = null;
        ResultSet rs = null;
        List<Vendedor> venda1 = new ArrayList();

        try {
            ps = conexao.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {

                Vendedor v1 = new Vendedor();
                v1.setNome_vendedor(rs.getString("nome_vendedor"));

                v1.setCodigo_vend(rs.getInt("codigo_vend"));

                venda1.add(v1);

            }
        } catch (SQLException e) {
            System.out.println("erro: "+e);
        } finally {
            SQLClasse.closeConnection(conexao);
        }
        return venda1;
    }
}
