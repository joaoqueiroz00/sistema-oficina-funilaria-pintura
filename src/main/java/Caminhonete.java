public class Caminhonete extends Veiculo {// Joao Victor Queiroz de Lima Ra.: 2051524
	
	// Atributos

    private double cargaMax;
    private int eixos;
	

    public Caminhonete() { //Construtor
        super();
        this.cargaMax = 0;
        this.eixos = 0;
    }

    // Sobrecarga do construtor
    public Caminhonete(String placa) {
        super(placa);
        this.cargaMax = 0;
        this.eixos = 0;
    }

    // Sobrecarga do construtor
    public Caminhonete(String placa, String marca, String modelo, String cor, double cargaMax, int eixos) {
        super(placa, marca, modelo, cor);
        this.cargaMax = cargaMax;
        this.eixos = eixos;
    }
	
//=============================

	//getters

    public double getCargaMax() {
        return cargaMax;
    }
	
	    public int getEixos() {
        return eixos;
    }

//=========================

	//Setters

    public void setCargaMax(double cargaMax) {
        this.cargaMax = cargaMax;
    }

    public void setEixos(int eixos) {
        this.eixos = eixos;
    }

    //Sobrescrita
	
    public String exibirDados() {
        return super.exibirDados()
                + "\nCarga maxima: " + cargaMax
                + "\nEixos: " + eixos;
    }
}
