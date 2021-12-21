package br.com.bytebank.banco.modelo;

/**
 * Classe que representa a moldura de uma conta
 * 
 * @author Heliandro
 * 
 */
public abstract class Conta {

    protected double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int total;

    /**
     * Construtor para inicializar o objeto Conta a partir da agencia e numero
     * 
     * @param agencia
     * @param numero
     */
    public Conta(int agencia, int numero) {
        Conta.total++;
        System.out.println("O total de contas é " + Conta.total);
        this.agencia = agencia;
        this.numero = numero;
    }

    public abstract void deposita(double valor);

    /**
     * Valor precisa ser maior do que o saldo.
     * 
     * @param valor
     * @throws SaldoInsuficienteException
     */
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

    @Override
    public boolean equals(Object ref) {
        
        Conta outra = (Conta) ref;

        if (this.agencia != outra.agencia || this.numero != outra.numero) {
            return false;
        }

        return true;
    }

    @Override
    public String toString() {
        return "Agencia: " + this.agencia + " | Numero: " + this.numero;
    }
}
