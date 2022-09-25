package OrientacaoObjetos;

public class Conta {

        int agencia;
        int numero;
        String titular;
        double saldo;

        void depositar(double valor) {
            this.saldo += valor;
        }
}
