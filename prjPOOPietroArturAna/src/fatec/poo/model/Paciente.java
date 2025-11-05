package fatec.poo.model;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

/**
 *
 * @author pietro
 */
public class Paciente {
    private LocalDate dataNascimento;
    private double altura;
    private double peso;

    
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
}
