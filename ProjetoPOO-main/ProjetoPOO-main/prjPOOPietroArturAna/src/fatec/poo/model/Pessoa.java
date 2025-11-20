package fatec.poo.model;

/**
 *
 * @author pietro, ana, artur
 */
public class Pessoa {
    private String cpf;
    private String nome;
    private String endereço;
    private String telefone;
    
    public Pessoa(String cpf, String nome){
        this.cpf = cpf;
        this.nome = nome;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereço() {
        return endereço;
    }

    public String getTelefone() {
        return telefone;
    }
    
    
}
