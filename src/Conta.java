public abstract class Conta {

    protected double saldo;
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

    public abstract void deposita(double valor);

    public void saca(double valor) throws SaldoInsuficienteException {
        if (!this.temSaldo(valor)) {
            throw new SaldoInsuficienteException(
                "Saldo: " + this.saldo
                + "\nValor: " + valor
                + "\nMensagem: saldo insuficiente!"
            );
        }

        this.saldo -= valor;
    }

    public void transfere(double valor, Conta contaDestino) throws SaldoInsuficienteException {
        this.saca(valor);
        contaDestino.saldo += valor;
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
