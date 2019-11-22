package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelos.Cliente;
import modelos.Venda;
import modelos.Vendedor;

public class VendaDAO {

    private Connection conexao;

    public VendaDAO() {
        conexao = SQLClasse.getConnection();

    }

    public List<Venda> listar() {
        String sql = "select nome_vendedor, count (cpf_cliente) from Cliente inner join Venda using(cpf_cliente) inner join Vendedor using "
                + "(codigo_vend) group by nome_vendedor having count (cpf_cliente) > 2";
        PreparedStatement ps = null;
        ResultSet rs = null;
        List<Venda> venda1 = new ArrayList();

        try {
            ps = conexao.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {

                Venda venda = new Venda();
                Vendedor v1 = new Vendedor();
                v1.setNome_vendedor(rs.getString("nome_vendedor"));
                venda.setVendedor(v1);
                Cliente c1 = new Cliente();
                c1.setCpf_cliente(rs.getInt("count(cpf_cliente)"));
                venda.setCliente(c1);
                venda1.add(venda);

            }
        } catch (SQLException e) {
        } finally {
            SQLClasse.closeConnection(conexao);
        }
        return venda1;
    }

}
