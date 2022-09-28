package BancoRasmooEncapsulamento;

public class TesteConstrutor {

    public static void main(String[] args) {
        
        Cliente pedro = new Cliente("Pedro", "123.456.789-00");
        Conta conta = new Conta(2370, 10025, pedro);

        System.out.println(conta.getAgencia());
        System.out.println(conta.getNumero());
        System.out.println(conta.getTitular().getNome());
        System.out.println(conta.getTitular().getCpf());
    }
    
}
