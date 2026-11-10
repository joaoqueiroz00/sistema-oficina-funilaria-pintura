import java.util.ArrayList; // Joao Victor Queiroz de Lima Ra.: 2051524

public class BDMaterial implements Cadastro<Material> {

    private static BDMaterial instancia;
    private ArrayList<Material> bdMaterial = new ArrayList<>();

    private BDMaterial() {}

    // Sobrecarga do construtor
    private BDMaterial(boolean iniciarVazio) {
        this();
        if (iniciarVazio) {
            this.bdMaterial.clear();
        }
    }

    //MÉTODO SINGLETON
    public static BDMaterial getInstancia() {
        if (instancia == null) {
            instancia = new BDMaterial();
        }
        return instancia;
    }

    public ArrayList<Material> getBdMaterial() { return bdMaterial; }

    public void inserir(Material objeto) {
        bdMaterial.add(objeto);
    }

    public Material consultar(String chave) {
        for (Material m : bdMaterial) {
            if (m.getDescricao().equals(chave)) {
                return m;
            }
        }
        return null;
    }

    public void alterar(Material objeto) {
        for (int i = 0; i < bdMaterial.size(); i++) {
            if (bdMaterial.get(i).getDescricao().equals(objeto.getDescricao())) {
                bdMaterial.set(i, objeto);
                return;
            }
        }
    }

    public boolean excluir(String chave) {
        return bdMaterial.removeIf(m -> m.getDescricao().equals(chave));
    }
}
