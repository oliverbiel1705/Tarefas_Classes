public class DadosDoFuncionario {

    /**
     *
     * @author Gabriel.Oliveira
     */

    /**
     *
     * @param args  pega o nome e endereço do funcionario e codigo e exibe na tela.
     */
    public static  void  main(String args[]){

    Funcionario funcionario = new Funcionario();
        funcionario.nomeDoFuncionario("Robson Rodrigues");
        System.out.println(funcionario.getNome());
        funcionario.setCodigo(05);
        System.out.println(funcionario.getCodigo());
        funcionario.cadastrarEndereçoF("Rua Dr Castros Camos,14");
        System.out.println(funcionario.getEndereço());
    }
}

