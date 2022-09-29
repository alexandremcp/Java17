package BancoRasmooEncapsulamento;

public class TesteStatic {

    public static void main(String[] args) {
        Cliente pedro = new Cliente("Pedro", "123.456.789-00");

        Conta conta1 = new Conta(400, 1001, pedro);
        Conta conta2 = new Conta(400, 1002, pedro);
        Conta conta3 = new Conta(400, 1003, pedro);

        System.out.println("O total de contas é: " + Conta.getTotal());
        
    }
    
}
