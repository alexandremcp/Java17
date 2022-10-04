public class TesteHeranca {

    public static void main(String[] args) {
        Cliente pedro = new Cliente("Pedro", "123.456.789-00");
        ContaCorrente cc = new ContaCorrente(1298, 123456, pedro);

        cc.depositar(1000);
        cc.depositar(5000);

        ContaPoupanca cp = new ContaPoupanca(1298, 123456, pedro);

        cc.transferir(500, cp);
        System.out.println("O saldo da CC é: " + cc.getSaldo());
        System.out.println("O saldo da CP é: " + cp.getSaldo());
    }
    
}
