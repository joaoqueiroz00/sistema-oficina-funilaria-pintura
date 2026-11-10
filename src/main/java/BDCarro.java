import java.util.ArrayList; // Joao Victor Queiroz de Lima Ra.: 2051524

public class BDCarro implements Cadastro<Carro> {

    private static BDCarro instancia;
    private ArrayList<Carro> bdCarro = new ArrayList<>();

    private BDCarro() {}

    // Sobrecarga do construtor
    private BDCarro(boolean iniciarVazio) {
        this();
        if (iniciarVazio) {
            this.bdCarro.clear();
        }
    }

    //MÉTODO SINGLETON
    public static BDCarro getInstancia() {
        if (instancia == null) {
            instancia = new BDCarro();
        }
        return instancia;
    }

    public ArrayList<Carro> getBdCarro() { return bdCarro; }

    public void inserir(Carro objeto) {
        bdCarro.add(objeto);
    }

    public Carro consultar(String chave) {
        for (Carro c : bdCarro) {
            if (c.getPlaca().equals(chave)) {
                return c;
            }
        }
        return null;
    }

    public void alterar(Carro objeto) {
        for (int i = 0; i < bdCarro.size(); i++) {
            if (bdCarro.get(i).getPlaca().equals(objeto.getPlaca())) {
                bdCarro.set(i, objeto);
                return;
            }
        }
    }

    public boolean excluir(String chave) {
        return bdCarro.removeIf(c -> c.getPlaca().equals(chave));
    }
}
