public class Profissional extends Pessoa { // Joao Victor Queiroz de Lima Ra.: 2051524

//=================================
	
	//Atributos

    private String especialidade;
    private double salario;
	
//============================

    public Profissional() {// Constutor default
        super();
        this.especialidade = "";
        this.salario = 0;
    }

    // Sobrecarga do construtor
    public Profissional(String especialidade) {
        this();
        this.especialidade = especialidade;
    }

    // Sobrecarga do construtor
    public Profissional(String nome, String cpf, String telefone, Endereco endereco, String especialidade, double salario) {
        super(nome, cpf, telefone, endereco);
        this.especialidade = especialidade;
        this.salario = salario;
    }
	
// ===========================

	//Getters

    public String getEspecialidade() {
        return especialidade;
    }
	
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

//=====================

	//Setters
	
    public double getSalario() {
        return salario;
    }
	
    public void setSalario(double salario) throws ValorInvalidoException {
        if (salario <= 0) {
            throw new ValorInvalidoException();
        }
        this.salario = salario;
    }

    //Sobrescrita

    public String exibirDados() {
        return super.exibirDados()
                + "\nEspecialidade: " + especialidade
                + "\nSalario: " + salario;
    }
}
