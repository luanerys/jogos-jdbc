package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelos.Jogo;

public class JogoDAO {

    private Connection conexao;

    public JogoDAO() {
        conexao = SQLClasse.getConnection();

    }

    public List<Jogo> listar() {
        String sql = "select nome_jogo,preço from Jogo where codigo_jogo not in (select codigo_jogo from Venda)";
        PreparedStatement ps = null;
        ResultSet rs = null;
        List<Jogo> jogo1 = new ArrayList();

        try {
            ps = conexao.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                Jogo j1 = new Jogo();
                j1.setNome_jogo(rs.getString("nome_jogo"));
                j1.setPreço(rs.getDouble("preço"));

                jogo1.add(j1);

            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            SQLClasse.closeConnection(conexao);
        }
        return jogo1;
    }

    public List<Jogo> listar2() {
        String sql = "select distinct nome_jogo from Jogo inner join Venda using (codigo_jogo) where (preço) > (select AVG (preço) from Jogo)";
        PreparedStatement ps = null;
        ResultSet rs = null;
        List<Jogo> jogo1 = new ArrayList();

        try {
            ps = conexao.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                Jogo j1 = new Jogo();
                j1.setNome_jogo(rs.getString("nome_jogo"));
                jogo1.add(j1);

            }

        } catch (SQLException e) {
            System.out.println("erro: " + e);
        } finally {
            SQLClasse.closeConnection(conexao);
        }
        return jogo1;
    }

}
