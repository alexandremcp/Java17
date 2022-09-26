package BancoRasmooEncapsulamento;

public class TesteEncapsulamento {

    public static void main(String[] args) {
        // Cliente clientePedro = new Cliente();
        // clientePedro.nome = "Pedro";
        // clientePedro.cpf = "123.456.789-00";
        // clientePedro.profissao = "Programador";
        // clientePedro.salario = 1000.00;

        // Conta conta = new Conta();
        // conta.titular = clientePedro;

        // Cliente cliente = new Cliente();
        // cliente.setNome("Gustavo");
        // cliente.setCpf("123.456.789-00");
        // cliente.setProfissao("Programador");
        // cliente.setSalario(10000.00);
        
        Conta conta = new Conta();
        conta.depositar(1000);
        conta.sacar(1000);
        conta.setAgencia(10);

        conta.setTitular(new Cliente());
        conta.getTitular().setNome("Gustavo");
        conta.getTitular().setCpf("123.456.789-00");
        conta.getTitular().setProfissao("Desenvolvedor");
        conta.getTitular().setSalario(10000.00);

        System.out.println(conta.getTitular().getNome());
        System.out.println(conta.getTitular().getProfissao());
        System.out.println(conta.getTitular().getSalario());
        System.out.println(conta.getSaldo());
    }
    
}
