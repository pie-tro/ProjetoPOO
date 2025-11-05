package fatec.poo.model;

import java.time.LocalDate;

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
    
    
}
