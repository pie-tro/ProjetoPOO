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

    public Consulta(int codigo, String data) {
        this.codigo = codigo;
        this.data = data;
        exames = new ArrayList<Exame>();
        medicacoes = new ArrayList<Medicacao>();
    }
    
    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setData(String data) {
        this.data = data;
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
    
}
