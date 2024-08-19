public class Funcionario {

    private int Codigo;

    private String Nome;

    private String Endereço;

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int codigo) {
        Codigo = codigo;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getEndereço() {
        return Endereço;
    }

    public void setEndereço(String endereço) {
        Endereço = endereço;
    }

    /**
     *
     * @return retorna o nome e endereço do funcionario para a classe DadosDoFuncionario
     */
    public void cadastrarEndereçoF(String endereço) {
        setEndereço(endereço);

    }

    public void nomeDoFuncionario(String cliente) {
        setNome(cliente);

    }

}
