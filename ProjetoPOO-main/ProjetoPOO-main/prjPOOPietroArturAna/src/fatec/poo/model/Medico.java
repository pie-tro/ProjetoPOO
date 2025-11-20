package fatec.poo.model;

import java.util.ArrayList;

/**
 *
 * @author pietro, ana, artur
 */
public class Medico extends Pessoa{
    private String crm;
    private String especialidade;
    private ArrayList <Consulta> consultas;
    
    public Medico(String cpf, String nome, String crm, String especialidade) {
        super(cpf, nome);
        this.crm = crm;
        this.especialidade = especialidade;
        consultas = new ArrayList<Consulta>();
    }

    public String getCrm() {
        return crm;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public ArrayList<Consulta> getConsultas() {
        return consultas;
    }

    public void setConsultas(ArrayList<Consulta> consultas) {
        this.consultas = consultas;
    }
  
    public void addConsulta(Consulta c){
        consultas.add(c);
        c.setMedico(this);
    }
}
