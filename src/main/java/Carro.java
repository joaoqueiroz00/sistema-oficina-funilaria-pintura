public class Carro extends Veiculo {// Joao Victor Queiroz de Lima Ra.: 2051524
	
	// Atributos

    private int portas;
    private String cambio;

    public Carro() {// Construtor 
        super();
        this.portas = 0;
        this.cambio = "";
    }

    // Sobrecarga do construtor
    public Carro(String placa) {
        super(placa);
        this.portas = 0;
        this.cambio = "";
    }

    // Sobrecarga do construtor
    public Carro(String placa, String marca, String modelo, String cor, int portas, String cambio) {
        super(placa, marca, modelo, cor);
        this.portas = portas;
        this.cambio = cambio;
    }
//====================

	//getters
	
	
    public int getPortas() {
        return portas;
    }
	
    public String getCambio() {
        return cambio;
    }
	
//====================================

	//setters

    public void setPortas(int portas) {
        this.portas = portas;
    }

    public void setCambio(String cambio) {
        this.cambio = cambio;
    }

    //Sobrescrita
	
    public String exibirDados() {
        return super.exibirDados()
                + "\nPortas: " + portas
                + "\nCambio: " + cambio;
    }
}
