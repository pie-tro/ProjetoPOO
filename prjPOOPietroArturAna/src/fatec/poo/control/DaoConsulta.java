package fatec.poo.control;

import fatec.poo.model.Consulta;
import fatec.poo.model.Medico;
import fatec.poo.model.Paciente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author pietro, ana, artur
 */
public class DaoConsulta {
    
    private Connection conn;

    public DaoConsulta(Connection conn) {
        this.conn = conn;
    }

    public void inserir(Consulta consulta, Paciente paciente) { 
        PreparedStatement ps = null;
        String sql = "INSERT INTO tbConsulta (Codigo, Data, Valor, CPF_Medico, CPF_Paciente) VALUES (?, ?, ?, ?, ?)";
        try {
            ps = conn.prepareStatement(sql);
            ps.setInt(1, consulta.getCodigo());
            ps.setString(2, consulta.getData());
            ps.setDouble(3, consulta.getValor());
            ps.setString(4, consulta.getMedico().getCpf()); 
            ps.setString(5, paciente.getCpf());
            
            ps.execute(); 
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }

    public void alterar(Consulta consulta) {
        PreparedStatement ps = null;
        String sql = "UPDATE tbConsulta SET Data = ?, Valor = ? WHERE Codigo = ?"; 
        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1, consulta.getData());
            ps.setDouble(2, consulta.getValor());
            ps.setInt(3, consulta.getCodigo());
            ps.execute();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }

    public Consulta consultar(int codigo) {
       Consulta c = null;
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("SELECT * FROM tbConsulta WHERE Codigo = ?");
            ps.setInt(1, codigo);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                c = new Consulta(codigo, rs.getString("Data"));
                c.setValor(rs.getDouble("Valor"));
                
                
                String cpfMedico = rs.getString("CPF_Medico"); 
                
                
                DaoMedico daoMedico = new DaoMedico(conn);
                Medico m = daoMedico.consultar(cpfMedico);
                
                
                m.addConsulta(c);
                
                
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return c;
    }

   
    public Medico buscarMedicoDaConsulta(int codigo) {
        Medico m = null;
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("SELECT CPF_Medico FROM tbConsulta WHERE Codigo = ?");
            ps.setInt(1, codigo);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                String cpf = rs.getString("CPF_Medico");
                
                DaoMedico dao = new DaoMedico(conn);
                m = dao.consultar(cpf);
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return m;
    }

    
    public Paciente buscarPacienteDaConsulta(int codigo) {
        Paciente p = null;
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("SELECT CPF_Paciente FROM tbConsulta WHERE Codigo = ?");
            ps.setInt(1, codigo);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                String cpf = rs.getString("CPF_Paciente");
                DaoPaciente dao = new DaoPaciente(conn);
                p = dao.consultar(cpf);
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return p;
    }

    public void excluir(Consulta consulta) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("DELETE FROM tbConsulta WHERE Codigo = ?");
            ps.setInt(1, consulta.getCodigo());
            ps.execute();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
    
    
}
