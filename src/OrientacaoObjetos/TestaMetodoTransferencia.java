package OrientacaoObjetos;

public class TestaMetodoTransferencia {

    public static void main(String[] args) {

        Conta primeiraConta = new Conta();
        Conta segundaConta = new Conta();

        primeiraConta.depositar(1000);

        primeiraConta.transferir(500, segundaConta);
        primeiraConta.transferir(250, segundaConta);

        System.out.println("Saldo da primeira conta: " + primeiraConta.saldo);
        System.out.println("Saldo da segunda conta: " + segundaConta.saldo);

    }
}