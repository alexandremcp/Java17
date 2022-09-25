package OrientacaoObjetos;

public class TesteComposicao {

    public static void main(String[] args) {
        Cliente clientePedro = new Cliente();
        clientePedro.nome = "Pedro";
        clientePedro.cpf = "123.456.789-00";
        clientePedro.profissao = "Programador";
        clientePedro.salario = 1000.00;

        Conta conta = new Conta();
        conta.titular = clientePedro;
        System.out.println(conta.titular.nome);
        System.out.println(conta.titular.cpf);
        System.out.println(conta.titular.profissao);

    }
}
