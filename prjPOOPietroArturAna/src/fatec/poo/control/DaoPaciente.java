package fatec.poo.control;

import fatec.poo.model.Paciente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author pietro, ana, artur
 */
public class DaoPaciente {
    
    private Connection conn;
    
    public DaoPaciente(Connection conn) {
         this.conn = conn;
    }
    
    public void inserir(Paciente paciente) {
        PreparedStatement ps = null;
        String sql = "INSERT INTO tbPaciente (CPF, Nome, "
                + "Endereco, Telefone, DataNascimento, "
                + "Altura, Peso) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1, paciente.getCpf());
            ps.setString(2, paciente.getNome());
            ps.setString(3, paciente.getEndereço()); 
            ps.setString(4, paciente.getTelefone());
            
            
            ps.setString(5, paciente.getDataNascimento()); 
            
            ps.setDouble(6, paciente.getAltura());
            ps.setDouble(7, paciente.getPeso());
            
            ps.execute();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }

    public void alterar(Paciente paciente) {
        PreparedStatement ps = null;
        String sql = "UPDATE tbPaciente SET Nome = ?, "
                + "Endereco = ?, Telefone = ?, "
                + "DataNascimento = ?, Altura = ?, "
                + "Peso = ? WHERE CPF = ?";
        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1, paciente.getNome());
            ps.setString(2, paciente.getEndereço()); 
            ps.setString(3, paciente.getTelefone());
            
            
            ps.setString(4, paciente.getDataNascimento());
            
            ps.setDouble(5, paciente.getAltura());
            ps.setDouble(6, paciente.getPeso());
            ps.setString(7, paciente.getCpf());
            
            ps.execute();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }

    public Paciente consultar(String cpf) {
        Paciente p = null;
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("SELECT * FROM tbPaciente WHERE CPF = ?");
            ps.setString(1, cpf);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                
                String dataTexto = rs.getString("DataNascimento"); 
                
                DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                LocalDate dataConvertida = LocalDate.parse(dataTexto, formato);
                
              
                p = new Paciente(rs.getString("CPF"), rs.getString("Nome"), dataConvertida); 
                
                p.setEndereço(rs.getString("Endereco")); 
                p.setTelefone(rs.getString("Telefone"));
                p.setAltura(rs.getDouble("Altura"));
                p.setPeso(rs.getDouble("Peso"));
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return p;
    }

    public void excluir(Paciente paciente) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("DELETE FROM tbPaciente WHERE CPF = ?");
            ps.setString(1, paciente.getCpf());
            
            ps.execute();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
}