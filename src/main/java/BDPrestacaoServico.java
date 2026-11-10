import java.util.ArrayList; // Joao Victor Queiroz de Lima Ra.: 2051524

public class BDPrestacaoServico implements Cadastro<PrestacaoServico> {

    private static BDPrestacaoServico instancia;
    private ArrayList<PrestacaoServico> bdPrestacao = new ArrayList<>();

    private BDPrestacaoServico() {}

    // Sobrecarga do construtor
    private BDPrestacaoServico(boolean iniciarVazio) {
        this();
        if (iniciarVazio) {
            this.bdPrestacao.clear();
        }
    }

    //MÉTODO SINGLETON
    public static BDPrestacaoServico getInstancia() {
        if (instancia == null) {
            instancia = new BDPrestacaoServico();
        }
        return instancia;
    }

    public ArrayList<PrestacaoServico> getBdPrestacao() { return bdPrestacao; }

    public void inserir(PrestacaoServico objeto) {
        bdPrestacao.add(objeto);
    }

    public PrestacaoServico consultar(String chave) {
        for (PrestacaoServico p : bdPrestacao) {
            if (p.getDescricao().equals(chave)) {
                return p;
            }
        }
        return null;
    }

    public void alterar(PrestacaoServico objeto) {
        for (int i = 0; i < bdPrestacao.size(); i++) {
            if (bdPrestacao.get(i).getDescricao().equals(objeto.getDescricao())) {
                bdPrestacao.set(i, objeto);
                return;
            }
        }
    }

    public boolean excluir(String chave) {
        return bdPrestacao.removeIf(p -> p.getDescricao().equals(chave));
    }
}
