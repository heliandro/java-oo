public class Conta {

    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int total;

    public Conta(int agencia, int numero) {
        Conta.total++;
        System.out.println("O total de contas é " + Conta.total);
        this.agencia = agencia;
        this.numero = numero;
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

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public static int getTotal() {
        return Conta.total;
    }
}
