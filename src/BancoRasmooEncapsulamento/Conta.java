package BancoRasmooEncapsulamento;

public class Conta {

    private int agencia;
    private int numero;
    private Cliente titular;
    private double saldo;

    public Conta(int agencia, int numero, Cliente titular) {
        this.agencia = agencia;
        this.numero = numero;
        this.titular = titular;
    }

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
        boolean conseguiuSacar = this.sacar(valor); // this faz referencia ao objeto que chamou o metodo

        if (conseguiuSacar) {
            destino.depositar(valor);
        }
    }

    public double getSaldo() {
        return saldo;
    }

    /*
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    --> Este método é desnecessário, pois, dá acesso direto a depósito inclusive de valores negativos
    --> Sendo assim nem sempre terei get e set para todos os atributos
    */

    public int getAgencia() {
        return agencia;
    }
    public void setAgencia(int agencia) {
        if(agencia>0){
            this.agencia = agencia;
        }
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public Cliente getTitular() {
        return titular;
    }
    public void setTitular(Cliente titular) {
        this.titular = titular;
    }
}
