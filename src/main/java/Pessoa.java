public class Pessoa {// Joao Victor Queiroz de Lima Ra.: 2051524
	
	// Atributos 

    private String nome;
    private String cpf;
    private String telefone;
    private Endereco endereco;

    public Pessoa() {//Construtor
        this.nome = "";
        this.cpf = "";
        this.telefone = "";
        this.endereco = new Endereco();
    }

    // Sobrecarga do construtor
    public Pessoa(String nome, String cpf) {
        this();
        this.nome = nome;
        this.cpf = cpf;
    }

    // Sobrecarga do construtor
    public Pessoa(String nome, String cpf, String telefone, Endereco endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.endereco = endereco;
    }
	
//=============================
	//getters

    public String getNome() {
        return nome;
    }
	
	public String getCpf() {
        return cpf;
    }

    public String getTelefone() {
        return telefone;
    }
	
    public Endereco getEndereco() {
        return endereco;
    }

//===============================
	//Setters

    public void setNome(String nome) throws NomeInvalidoException {
        if (nome == null || nome.trim().equals("")) {
            throw new NomeInvalidoException();
        }
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }


    public String exibirDados() {
        return "Nome: " + nome
                + "\nCPF: " + cpf
                + "\nTelefone: " + telefone
                + "\nRua: " + endereco.getRua()
                + "\nNumero: " + endereco.getNumero()
                + "\nBairro: " + endereco.getBairro()
                + "\nCidade: " + endereco.getCidade();
    }
}
