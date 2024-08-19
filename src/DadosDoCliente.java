public class DadosDoCliente {

    /**
     *
     * @author Gabriel.Oliveira
     */

    /**
     *
     * @param args  pega o nome e endereço do cliente e codigo e exibe na tela.
     */
    public static  void  main(String args[]){
        Cliente cliente = new Cliente();
        cliente.nomeDoCliente("Gabriel Oliveira");
        System.out.println(cliente.getNome());
        cliente.setCodigo(01);
        System.out.println(cliente.getCodigo());
        cliente.cadastrarEndereçoC("Rua taque velho,1914");
        System.out.println(cliente.getEndereço());

    }
}
