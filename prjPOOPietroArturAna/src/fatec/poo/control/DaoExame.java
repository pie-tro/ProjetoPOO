package fatec.poo.control;

import fatec.poo.model.Consulta;
import fatec.poo.model.Exame;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author pietro, ana, artur
 */
public class DaoExame {
    private Connection conn;

    public DaoExame(Connection conn) {
        this.conn = conn;
    }

    public void inserir(Exame exame) {
        PreparedStatement ps = null;
        String sql = "INSERT INTO tbExame "
                + "(Codigo, Descricao, Data, "
                + "Horario, Valor, ConsultaCodigo) "
                + "VALUES (?, ?, ?, ?, ?, ?)";
        try {
            ps = conn.prepareStatement(sql);
            ps.setInt(1, exame.getCodigo());
            ps.setString(2, exame.getDescricao());
            ps.setString(3, exame.getData());
            ps.setString(4, exame.getHorario());
            ps.setDouble(5, exame.getValor());
            ps.setInt(6, exame.getConsulta().getCodigo());
            
            ps.execute();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }

    public void alterar(Exame exame) {
        PreparedStatement ps = null;
        String sql = "UPDATE tbExame SET Descricao = ?, "
                + "Data = ?, Horario = ?, Valor = ? WHERE Codigo = ?";
        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1, exame.getDescricao());
            ps.setString(2, exame.getData());
            ps.setString(3, exame.getHorario());
            ps.setDouble(4, exame.getValor());
            ps.setInt(5, exame.getCodigo());
            
            ps.execute();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }

    public Exame consultar(int codigo) {
        Exame exame = null;
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("SELECT * FROM tbExame WHERE Codigo = ?");
            ps.setInt(1, codigo);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                exame = new Exame(rs.getInt("Codigo"), rs.getString("Descricao"));
                exame.setData(rs.getString("Data"));
                exame.setHorario(rs.getString("Horario"));
                exame.setValor(rs.getDouble("Valor"));
                
                Consulta consulta = new Consulta(rs.getInt("ConsultaCodigo"), null);
                exame.setConsulta(consulta);
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return exame;
    }

    public void excluir(Exame exame) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("DELETE FROM tbExame WHERE Codigo = ?");
            ps.setInt(1, exame.getCodigo());
            
            ps.execute();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
}
