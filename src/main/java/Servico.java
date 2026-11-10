public class Servico { // Joao Victor Queiroz de Lima Ra.: 2051524
	
//===================================
	//Atributos

    private String descricao;
    private double valor;
    private String status;
//===========================


    public Servico() { // Construtor 
        this.descricao = "";
        this.valor = 0;
        this.status = "";
    }

    // Sobrecarga do construtor
    public Servico(String descricao) {
        this();
        this.descricao = descricao;
    }

    // Sobrecarga do construtor
    public Servico(String descricao, double valor, String status) {
        this.descricao = descricao;
        this.valor = valor;
        this.status = status;
    }
	
//===========================

	//Getters 
	
    public String getDescricao() {
        return descricao;
    }
	
	    public double getValor() {
        return valor;
    }
    public String getStatus() {
        return status;
    }
	
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
	
//==================================

	//Setters

    public void setValor(double valor) throws ValorInvalidoException {
        if (valor <= 0) {
            throw new ValorInvalidoException();
        }
        this.valor = valor;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    //Sobrecarga
    public double calcularValor() {
        return valor;
    }

    //Sobrecarga
    public double calcularValor(double desconto) {
        return valor - desconto;
    }

    public String exibirDados() {
        return "Descricao: " + descricao
                + "\nValor: " + valor
                + "\nStatus: " + status;
    }
}
