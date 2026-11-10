import java.util.ArrayList; // Joao Victor Queiroz de Lima Ra.: 2051524

public class BDCliente implements Cadastro<Cliente> {

    private static BDCliente instancia;
    private ArrayList<Cliente> bdCliente = new ArrayList<>();

    private BDCliente() {}

    // Sobrecarga do construtor
    private BDCliente(boolean iniciarVazio) {
        this();
        if (iniciarVazio) {
            this.bdCliente.clear();
        }
    }

    //MÉTODO SINGLETON
    public static BDCliente getInstancia() {
        if (instancia == null) {
            instancia = new BDCliente();
        }
        return instancia;
    }

    public ArrayList<Cliente> getBdCliente() { return bdCliente; }

    public void inserir(Cliente objeto) {
        bdCliente.add(objeto);
    }

    public Cliente consultar(String chave) {
        for (Cliente c : bdCliente) {
            if (c.getCpf().equals(chave)) {
                return c;
            }
        }
        return null;
    }

    public void alterar(Cliente objeto) {
        for (int i = 0; i < bdCliente.size(); i++) {
            if (bdCliente.get(i).getCpf().equals(objeto.getCpf())) {
                bdCliente.set(i, objeto);
                return;
            }
        }
    }

    public boolean excluir(String chave) {
        return bdCliente.removeIf(c -> c.getCpf().equals(chave));
    }
}
