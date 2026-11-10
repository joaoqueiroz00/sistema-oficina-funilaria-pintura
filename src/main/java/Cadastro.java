public interface Cadastro<T> {// Joao Victor Queiroz de Lima Ra.: 2051524
    public void inserir(T objeto);
    public T consultar(String chave);
    public void alterar(T objeto);
    public boolean excluir(String chave);
}
