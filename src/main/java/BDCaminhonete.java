import java.util.ArrayList; // Joao Victor Queiroz de Lima Ra.: 2051524

public class BDCaminhonete implements Cadastro<Caminhonete> {

    private static BDCaminhonete instancia;
    private ArrayList<Caminhonete> bdCaminhonete = new ArrayList<>();

    private BDCaminhonete() {}

    // Sobrecarga do construtor
    private BDCaminhonete(boolean iniciarVazio) {
        this();
        if (iniciarVazio) {
            this.bdCaminhonete.clear();
        }
    }

    //MÉTODO SINGLETON
    public static BDCaminhonete getInstancia() {
        if (instancia == null) {
            instancia = new BDCaminhonete();
        }
        return instancia;
    }

    public ArrayList<Caminhonete> getBdCaminhonete() { return bdCaminhonete; }

    public void inserir(Caminhonete objeto) {
        bdCaminhonete.add(objeto);
    }

    public Caminhonete consultar(String chave) {
        for (Caminhonete c : bdCaminhonete) {
            if (c.getPlaca().equals(chave)) {
                return c;
            }
        }
        return null;
    }

    public void alterar(Caminhonete objeto) {
        for (int i = 0; i < bdCaminhonete.size(); i++) {
            if (bdCaminhonete.get(i).getPlaca().equals(objeto.getPlaca())) {
                bdCaminhonete.set(i, objeto);
                return;
            }
        }
    }

    public boolean excluir(String chave) {
        return bdCaminhonete.removeIf(c -> c.getPlaca().equals(chave));
    }
}
