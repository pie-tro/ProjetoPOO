package fatec.poo.model;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.ArrayList;

/**
 *
 * @author pietro, ana, artur
 */
public class Paciente extends Pessoa{
    private LocalDate dataNascimento;
    private double altura;
    private double peso;
    private ArrayList <Consulta> consultas;

    public Paciente(String cpf, String nome, LocalDate dataNascimento) {
        super(cpf, nome);
        this.dataNascimento = dataNascimento;
        consultas = new ArrayList<>();
    }    
    
    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getDataNascimento() {
       return String.format("%02d/%02d/%04d",
            dataNascimento.getDayOfMonth(),
            dataNascimento.getMonthValue(),
            dataNascimento.getYear());
    }

    public double getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }
    
    public double calcIMC(){
        double imc = peso/Math.pow(altura, 2);
        return imc;
    }
    
    public int calcIdade(){
        return Period.between(this.dataNascimento, LocalDate.now()).getYears();
    }
    
    public void addConsulta(Consulta c){
        consultas.add(c);
        
    }
   
}
