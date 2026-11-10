public class NomeInvalidoException extends Exception {// Joao Victor Queiroz de Lima Ra.: 2051524

    public NomeInvalidoException() {
        super("Nome nao pode ficar vazio.");
    }

    // Sobrecarga do construtor
    public NomeInvalidoException(String mensagem) {
        super(mensagem);
    }
}
