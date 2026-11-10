public class Material extends Servico {// Joao Victor Queiroz de Lima Ra.: 2051524

	//Atributos 

    private int quantidade;
    private String marca;

    public Material() {// Construtor
        super();
        this.quantidade = 0;
        this.marca = "";
    }

    // Sobrecarga do construtor
    public Material(String descricao) {
        super(descricao);
        this.quantidade = 0;
        this.marca = "";
    }

    // Sobrecarga do construtor
    public Material(String descricao, double valor, String status, int quantidade, String marca) {
        super(descricao, valor, status);
        this.quantidade = quantidade;
        this.marca = marca;
    }

//==============================

	//getters

    public int getQuantidade() {
        return quantidade;
    }
	
	public String getMarca() {
        return marca;
    }
	
//===========================

	//setters

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    //Sobrescrita

    public String exibirDados() {
        return super.exibirDados()
                + "\nQuantidade: " + quantidade
                + "\nMarca: " + marca;
    }
}
