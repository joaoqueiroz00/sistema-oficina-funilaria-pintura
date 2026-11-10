public class Moto extends Veiculo {// Joao Victor Queiroz de Lima Ra.: 2051524
	
	// Atributos 

    private int cilindradas;
    private String partida;


    public Moto() {// Construtor default
        super();
        this.cilindradas = 0;
        this.partida = "";
    }

    // Sobrecarga do construtor
    public Moto(String placa) {
        super(placa);
        this.cilindradas = 0;
        this.partida = "";
    }

    // Sobrecarga do construtor
    public Moto(String placa, String marca, String modelo, String cor, int cilindradas, String partida) {
        super(placa, marca, modelo, cor);
        this.cilindradas = cilindradas;
        this.partida = partida;
    }
	
//===============================

	// Getters

    public int getCilindradas() {
        return cilindradas;
    }
	
    public String getPartida() {
        return partida;
    }
	
//==============================

	//Setters

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    public void setPartida(String partida) {
        this.partida = partida;
    }

    //Sobrescrita

    public String exibirDados() {
        return super.exibirDados()
                + "\nCilindradas: " + cilindradas
                + "\nPartida: " + partida;
    }
}
