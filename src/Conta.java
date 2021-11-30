public class Conta {

    double saldo;
    int agencia;
    int numero;
    Cliente titular;

    Conta(double saldo, Cliente titular) {
        this.saldo = saldo;
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
}
