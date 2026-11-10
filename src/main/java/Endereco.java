public class Endereco {// Joao Victor Queiroz de Lima Ra.: 2051524
	
	// Atributos 

    private String rua;
    private int numero;
    private String bairro;
    private String cidade;

    public Endereco() {// Construtor 
        this.rua = "";
        this.numero = 0;
        this.bairro = "";
        this.cidade = "";
    }

    // Sobrecarga do construtor
    public Endereco(String cidade) {
        this();
        this.cidade = cidade;
    }

    // Sobrecarga do construtor
    public Endereco(String rua, int numero, String bairro, String cidade) {
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
    }
	
//==========================

    // Getters

    public String getRua() {
        return rua;
    }
	
	 public int getNumero() {
        return numero;
    }
	
    public String getBairro() {
        return bairro;
    }
	
    public String getCidade() {
        return cidade;
    }

//==================================

	//SEtters 

    public void setRua(String rua) {
        this.rua = rua;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
}
