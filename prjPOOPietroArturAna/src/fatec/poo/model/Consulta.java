package fatec.poo.model;

import java.util.ArrayList;

/**
 *
 * @author pietro, ana, artur
 */
public class Consulta {
    private int codigo;
    private String data;
    private double valor;
    private ArrayList <Exame> exames;
    private ArrayList <Medicacao> medicacoes;
    private Medico medico;
    private Paciente paciente;

    public Consulta(int codigo, String data) {
        this.codigo = codigo;
        this.data = data;
        exames = new ArrayList<Exame>();
        medicacoes = new ArrayList<Medicacao>();
    }
    
    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getData() {
        return data;
    }

    public double getValor() {
        return valor;
    }
    
    public void addExame(Exame e){
        exames.add(e);
        e.setConsulta(this);
    }
    
    public void addMedicacao(Medicacao m){
        medicacoes.add(m);
        m.setConsulta(this);
    }
    
    public double calcValorTotalPagar (){
        double total = 0;
        for(int cont = 0; cont < exames.size(); cont++){
            Exame exame = exames.get(cont);
            total += exame.getValor();
        }
        return total + getValor();
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
    
    
}
