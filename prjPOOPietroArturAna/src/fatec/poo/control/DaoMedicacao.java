package fatec.poo.control;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.ResultSet;
import fatec.poo.model.Medicacao;
import fatec.poo.model.Consulta;

/**
 *
 * @author pietro, ana, artur
 */
public class DaoMedicacao {
    private Connection conn;

    public DaoMedicacao(Connection conn) {
        this.conn = conn;
    }

    public void inserir(Medicacao medicacao, Consulta consulta) {
        PreparedStatement ps = null;
        String sql = "INSERT INTO tbMedicacao "
                + "(Nome, Dosagem, QtdeDias, Codigo_Consulta) "
                + "VALUES (?, ?, ?, ?)";
        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1, medicacao.getNome());
            ps.setString(2, medicacao.getDosagem());
            ps.setInt(3, medicacao.getQtdeDias());
            ps.setInt(4, consulta.getCodigo()); 
            
            consulta.addMedicacao(medicacao); 
            
            ps.execute();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }

    public void alterar(Medicacao medicacao) {
        PreparedStatement ps = null;
        String sql = "UPDATE tbMedicacao SET Dosagem = ?, QtdeDias = ? WHERE Nome = ?";
        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1, medicacao.getDosagem());
            ps.setInt(2, medicacao.getQtdeDias());
            ps.setString(3, medicacao.getNome());
            ps.execute();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }

    public Medicacao consultar(String nome) {
        Medicacao medicacao = null;
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("SELECT * FROM tbMedicacao WHERE Nome = ?");
            ps.setString(1, nome);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                medicacao = new Medicacao(rs.getString("Nome")); 
                medicacao.setDosagem(rs.getString("Dosagem"));
                medicacao.setQtdeDias(rs.getInt("QtdeDias"));
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return medicacao;
    }

    public void excluir(Medicacao medicacao) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("DELETE FROM tbMedicacao WHERE Nome = ?");
            ps.setString(1, medicacao.getNome());
            ps.execute();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
    public Consulta buscarCodigoConsulta (String nomeMedicacao){
        Consulta consulta = null;
        PreparedStatement ps = null;
        String sql = "SELECT Codigo_Consulta FROM tbMedicacao WHERE Nome=?";
        try{
            ps = conn.prepareStatement(sql);
            ps.setString(1,nomeMedicacao);
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
               int codigo = rs.getInt("Codigo_Consulta");
               DaoConsulta daoConsulta = new DaoConsulta(conn);
               consulta= daoConsulta.consultar(codigo);
            }
        }
        catch(SQLException ex){
            System.out.println(ex.toString());
        }
        return consulta;
    }
}