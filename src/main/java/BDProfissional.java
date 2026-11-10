import java.util.ArrayList; // Joao Victor Queiroz de Lima Ra.: 2051524

public class BDProfissional implements Cadastro<Profissional> {

    private static BDProfissional instancia;
    private ArrayList<Profissional> bdProfissional = new ArrayList<>();

    private BDProfissional() {}

    // Sobrecarga do construtor
    private BDProfissional(boolean iniciarVazio) {
        this();
        if (iniciarVazio) {
            this.bdProfissional.clear();
        }
    }

    //MÉTODO SINGLETON
    public static BDProfissional getInstancia() {
        if (instancia == null) {
            instancia = new BDProfissional();
        }
        return instancia;
    }

    public ArrayList<Profissional> getBdProfissional() { return bdProfissional; }

    public void inserir(Profissional objeto) {
        bdProfissional.add(objeto);
    }

    public Profissional consultar(String chave) {
        for (Profissional p : bdProfissional) {
            if (p.getCpf().equals(chave)) {
                return p;
            }
        }
        return null;
    }

    public void alterar(Profissional objeto) {
        for (int i = 0; i < bdProfissional.size(); i++) {
            if (bdProfissional.get(i).getCpf().equals(objeto.getCpf())) {
                bdProfissional.set(i, objeto);
                return;
            }
        }
    }

    public boolean excluir(String chave) {
        return bdProfissional.removeIf(p -> p.getCpf().equals(chave));
    }
}
