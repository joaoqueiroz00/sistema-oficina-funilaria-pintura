public class ValorInvalidoException extends Exception {// Joao Victor Queiroz de Lima Ra.: 2051524

    public ValorInvalidoException() {
        super("Valor deve ser maior que zero.");
    }

    // Sobrecarga do construtor
    public ValorInvalidoException(String mensagem) {
        super(mensagem);
    }
}
