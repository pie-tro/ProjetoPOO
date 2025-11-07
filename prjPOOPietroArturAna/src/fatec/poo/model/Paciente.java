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

    public Paciente(LocalDate dataNascimento, String cpf, String nome) {
        super(cpf, nome);
        this.dataNascimento = dataNascimento;
        consultas = new ArrayList<Consulta>();
    }
    
    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
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
        c.setPaciente(this);
    }
   
}
