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

    public void setNome(String nome) {
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
    public static boolean validarCPF(String cpf)
    {
     if(cpf.length()!=11)  {
         return false;
     } 
     if (cpf.chars().distinct().count() == 1) {
    return false;
} 
     int soma1 = 0;
    for (int i = 0; i < 9; i++) {
        int numero = cpf.charAt(i) - '0'; 
        soma1 += (numero * (i + 1));
    }
    
    int resto1 = soma1 % 11;
    int digito1 = (resto1 == 10) ? 0 : resto1;
     
    int soma2 = 0;
    int peso2 = 11;
    
    for (int i = 0; i < 9; i++) {
        int numero = cpf.charAt(i) - '0';
        soma2 += (numero * peso2);
        peso2--;
    }
    
    soma2 += (digito1 * 2);

    int resto2 = (soma2 * 10) % 11;
    int digito2 = (resto2 == 10) ? 0 : resto2;
    
    return (digito1 == (cpf.charAt(9) - '0')) && (digito2 == (cpf.charAt(10) - '0'));
        
    }
    
}
