public class Cliente {

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
     * @return adiciona o nome e endereço do cliente.
     */
    public void cadastrarEndereçoC(String endereço) {
        setEndereço(endereço);

    }

    public void nomeDoCliente(String cliente) {
       setNome(cliente);

    }

}
