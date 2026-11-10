import java.util.ArrayList; // Joao Victor Queiroz de Lima Ra.: 2051524

public class BDOS implements Cadastro<OrdemServico> {

    private static BDOS instancia;
    private ArrayList<OrdemServico> bdOS = new ArrayList<>();

    private BDOS() {}

    // Sobrecarga do construtor
    private BDOS(boolean iniciarVazio) {
        this();
        if (iniciarVazio) {
            this.bdOS.clear();
        }
    }

    //MÉTODO SINGLETON
    public static BDOS getInstancia() {
        if (instancia == null) {
            instancia = new BDOS();
        }
        return instancia;
    }

    public ArrayList<OrdemServico> getBdOS() { return bdOS; }

    public void inserir(OrdemServico objeto) {
        bdOS.add(objeto);
    }

    public OrdemServico consultar(String chave) {
        try {
            int numero = Integer.parseInt(chave);
            for (OrdemServico os : bdOS) {
                if (os.getNumeroOS() == numero) {
                    return os;
                }
            }
        } catch (NumberFormatException ex) {
            // chave invalida: nenhuma OS encontrada
        }
        return null;
    }

    public void alterar(OrdemServico objeto) {
        for (int i = 0; i < bdOS.size(); i++) {
            if (bdOS.get(i).getNumeroOS() == objeto.getNumeroOS()) {
                bdOS.set(i, objeto);
                return;
            }
        }
    }

    public boolean excluir(String chave) {
        try {
            int numero = Integer.parseInt(chave);
            return bdOS.removeIf(os -> os.getNumeroOS() == numero);
        } catch (NumberFormatException ex) {
            return false;
        }
    }
}
