public class PrestacaoServico extends Servico { // Joao Victor Queiroz de Lima Ra.: 2051524
	
	// Atributos

    private double horas;
    private String tipoServico;

    public PrestacaoServico() {//Construtor
        super();
        this.horas = 0;
        this.tipoServico = "";
    }

    // Sobrecarga do construtor
    public PrestacaoServico(String descricao) {
        super(descricao);
        this.horas = 0;
        this.tipoServico = "";
    }

    // Sobrecarga do construtor
    public PrestacaoServico(String descricao, double valor, String status, double horas, String tipoServico) {
        super(descricao, valor, status);
        this.horas = horas;
        this.tipoServico = tipoServico;
    }

//=============================
	//getters

    public double getHoras() {
        return horas;
    }

    public String getTipoServico() {
        return tipoServico;
    }
	
//=============================

	//Setters

    public void setHoras(double horas) {
        this.horas = horas;
    }

    public void setTipoServico(String tipoServico) {
        this.tipoServico = tipoServico;
    }

    //Sobrescrita

    public String exibirDados() {
        return super.exibirDados()
                + "\nHoras: " + horas
                + "\nTipo de servico: " + tipoServico;
    }
}
