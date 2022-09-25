package OrientacaoObjetos;

public class TestaConta {

    public static void main(String[] args) {

        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 1525.40;
        primeiraConta.agencia = 1;
        primeiraConta.numero = 100;
        primeiraConta.titular = "Pedro Henrique";

        System.out.println("O titular da primeira conta é: " + primeiraConta.titular);
        System.out.println("A agengia da primeira conta é: " + primeiraConta.agencia);
        System.out.println("O saldo da primeira conta é: " + primeiraConta.saldo);
    }
}
