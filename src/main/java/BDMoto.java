import java.util.ArrayList; // Joao Victor Queiroz de Lima Ra.: 2051524

public class BDMoto implements Cadastro<Moto> {

    private static BDMoto instancia;
    private ArrayList<Moto> bdMoto = new ArrayList<>();

    private BDMoto() {}

    // Sobrecarga do construtor
    private BDMoto(boolean iniciarVazio) {
        this();
        if (iniciarVazio) {
            this.bdMoto.clear();
        }
    }

    //MÉTODO SINGLETON
    public static BDMoto getInstancia() {
        if (instancia == null) {
            instancia = new BDMoto();
        }
        return instancia;
    }

    public ArrayList<Moto> getBdMoto() { return bdMoto; }

    public void inserir(Moto objeto) {
        bdMoto.add(objeto);
    }

    public Moto consultar(String chave) {
        for (Moto m : bdMoto) {
            if (m.getPlaca().equals(chave)) {
                return m;
            }
        }
        return null;
    }

    public void alterar(Moto objeto) {
        for (int i = 0; i < bdMoto.size(); i++) {
            if (bdMoto.get(i).getPlaca().equals(objeto.getPlaca())) {
                bdMoto.set(i, objeto);
                return;
            }
        }
    }

    public boolean excluir(String chave) {
        return bdMoto.removeIf(m -> m.getPlaca().equals(chave));
    }
}
