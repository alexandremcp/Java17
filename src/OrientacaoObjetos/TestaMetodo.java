package OrientacaoObjetos;

public class TestaMetodo {

    public static void main(String[] args) {

        Conta conta = new Conta();
        conta.depositar(100);
        conta.depositar(50);
        conta.depositar(200);
        System.out.println(conta.saldo);

    }
}
