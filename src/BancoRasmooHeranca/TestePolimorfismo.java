public class TestePolimorfismo {

    public static void main(String[] args) {
        Cliente pedro = new Cliente("Pedro", "123.456.789-00");
        ContaCorrente cc = new ContaCorrente(5643, 10032, pedro);
        ContaPoupanca cp = new ContaPoupanca(5643, 8721, pedro);

        cc.depositar(1000);
        cp.depositar(10000);
        
        cc.sacar(100);
        cp.sacar(1000);

        cp.transferir(500, cc);
        cc.transferir(100, cp);

        System.out.println("Saldo CC: " + cc.getSaldo());
        System.out.println("Saldo CP: " + cp.getSaldo());

        System.out.println(cc);
        System.out.println(cp);

    }
}