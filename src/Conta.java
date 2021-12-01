public class Conta {

    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;

    public Conta(int agencia, int numero, Cliente titular) {
        this.agencia = agencia;
        this.numero = numero;
        this.titular = titular;
    }

    void deposita(double saldo) {
        this.saldo += saldo;
    }

    boolean saca(double valor) {
        if (!this.temSaldo(valor)) {
            return false;
        }
        this.saldo -= valor;
        return true;
    }

    boolean transfere(double valor, Conta contaDestino) {
        if (!this.saca(valor)) {
            return false;
        }
        contaDestino.saldo += valor;
        return true;
    }

    boolean temSaldo(double valor) {
        if (this.saldo >= valor) {
            return true;
        }
        return false;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public int getNumero() {
        return this.numero;
    }

    public int getAgencia() {
        return this.agencia;
    }

    public Cliente getTitular() {
        return this.titular;
    }
}
