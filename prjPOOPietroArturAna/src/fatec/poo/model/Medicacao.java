package fatec.poo.model;

/**
 *
 * @author pietro, ana, artur
 */
public class Medicacao {
    private String nome;
    private String dosagem;
    private int qtdeDias;
    private String descricao;
    

    public Medicacao(String descricao) {
        this.descricao = descricao;
    }
    
    public void setDosagem(String dosagem) {
        this.dosagem = dosagem;
    }

    public void setQtdeDias(int qtdeDias) {
        this.qtdeDias = qtdeDias;
    }

    public String getNome() {
        return nome;
    }

    public String getDosagem() {
        return dosagem;
    }

    public int getQtdeDias() {
        return qtdeDias;
    }


    
}
