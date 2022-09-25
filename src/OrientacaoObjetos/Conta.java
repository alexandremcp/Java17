package OrientacaoObjetos;

public class Conta {

        int agencia;
        int numero;
        Cliente titular;
        double saldo;

        void depositar(double valor) {
            this.saldo += valor;
        }

        boolean sacar(double valor) {
            if (this.saldo >= valor) {
                this.saldo -= valor;
                return true;
            } else {
                return false;
            }
        }

        void transferir(double valor, Conta destino) {
            boolean conseguiuSacar = this.sacar(valor);     //this faz referencia ao objeto que chamou o metodo

            if (conseguiuSacar) {
                destino.depositar(valor);
            }
        }

}
