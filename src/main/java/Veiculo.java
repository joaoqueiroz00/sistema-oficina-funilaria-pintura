public class Veiculo { // Joao Victor Queiroz de Lima Ra.: 2051524
	
	// Atributos

    private String placa;
    private String marca;
    private String modelo;
    private String cor;

//================================

    public Veiculo() { // Construtor
        this.placa = "";
        this.marca = "";
        this.modelo = "";
        this.cor = "";
    }

    // Sobrecarga do construtor
    public Veiculo(String placa) {
        this();
        this.placa = placa;
    }

    // Sobrecarga do construtor
    public Veiculo(String placa, String marca, String modelo, String cor) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
    }
	
//=======================
	//Getters
	
    public String getPlaca() {
        return placa;
    }
	
    public String getMarca() {
        return marca;
    }
	
    public String getModelo() {
        return modelo;
    }
	
    public String getCor() {
        return cor;
    }
	
//========================

	//setters

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
	
// =======================


    public String exibirDados() {
        return "Placa: " + placa
                + "\nMarca: " + marca
                + "\nModelo: " + modelo
                + "\nCor: " + cor;
    }
}
