public class Cliente extends Pessoa {// Joao Victor Queiroz de Lima Ra.: 2051524
	
	// Atributos 

    private int codigo;
    private int qtdServicos;

    public Cliente() {// Construtor default
        super();
        this.codigo = 0;
        this.qtdServicos = 0;
    }

    // Sobrecarga do construtor
    public Cliente(int codigo) {
        this();
        this.codigo = codigo;
    }

    // Sobrecarga do construtor
    public Cliente(String nome, String cpf, String telefone, Endereco endereco, int codigo, int qtdServicos) {
        super(nome, cpf, telefone, endereco);
        this.codigo = codigo;
        this.qtdServicos = qtdServicos;
    }

// ===============================

	// Getters

    public int getCodigo() {
        return codigo;
    }
	
	    public int getQtdServicos() {
        return qtdServicos;
    }

//=========================

	//setters

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setQtdServicos(int qtdServicos) {
        this.qtdServicos = qtdServicos;
    }

    //Sobrescrita

    public String exibirDados() {
        return super.exibirDados()
                + "\nCodigo do cliente: " + codigo
                + "\nQuantidade de servicos: " + qtdServicos;
    }
}
