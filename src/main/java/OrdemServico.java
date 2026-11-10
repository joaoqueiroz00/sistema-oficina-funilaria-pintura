public class OrdemServico { // Joao Victor Queiroz de Lima Ra.: 2051524
	
	// atributos

    private int numeroOS;
    private String dataEntrada;
    private String previsao;
    private String observacao;
    private Cliente cliente;
    private Profissional profissional;
    private Veiculo veiculo;
    private Servico servico;

    public OrdemServico() {// Construtor Default
        this.numeroOS = 0;
        this.dataEntrada = "";
        this.previsao = "";
        this.observacao = "";
        this.cliente = new Cliente();
        this.profissional = new Profissional();
        this.veiculo = new Carro();
        this.servico = new PrestacaoServico();
    }

    // Sobrecarga do construtor
    public OrdemServico(int numeroOS) {
        this();
        this.numeroOS = numeroOS;
    }

    // Sobrecarga do construtor
    public OrdemServico(int numeroOS, String dataEntrada, String previsao, String observacao,
            Cliente cliente, Profissional profissional, Veiculo veiculo, Servico servico) {
        this.numeroOS = numeroOS;
        this.dataEntrada = dataEntrada;
        this.previsao = previsao;
        this.observacao = observacao;
        this.cliente = cliente;
        this.profissional = profissional;
        this.veiculo = veiculo;
        this.servico = servico;
    }
	
// ===================================

	//Getters 

    public int getNumeroOS() {
        return numeroOS;
    }
	
    public String getDataEntrada() {
        return dataEntrada;
    }
	
    public String getPrevisao() {
        return previsao;
    }
	
    public String getObservacao() {
        return observacao;
    }
	
    public Cliente getCliente() {
        return cliente;
    }
	
    public Profissional getProfissional() {
        return profissional;
    }
	
    public Veiculo getVeiculo() {
        return veiculo;
    }
	
    public Servico getServico() {
        return servico;
    }


//=================================

	//setters
	
    public void setNumeroOS(int numeroOS) {
        this.numeroOS = numeroOS;
    }
	
    public void setDataEntrada(String dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public void setPrevisao(String previsao) {
        this.previsao = previsao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setProfissional(Profissional profissional) {
        this.profissional = profissional;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }
	
    public void setServico(Servico servico) {
        this.servico = servico;
    }
	

    public String exibirOS() {
        return "Numero OS: " + numeroOS
                + "\nData de entrada: " + dataEntrada
                + "\nPrevisao: " + previsao
                + "\nObservacao: " + observacao
                + "\n\nCLIENTE\n" + cliente.exibirDados()
                + "\n\nPROFISSIONAL\n" + profissional.exibirDados()
                + "\n\nVEICULO\n" + veiculo.exibirDados()
                + "\n\nSERVICO\n" + servico.exibirDados();
    }
}
