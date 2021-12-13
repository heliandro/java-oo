public class TesteSaca {
    public static void main(String[] args) {
        Conta conta = new ContaCorrente(1111, 2222);

        conta.deposita(200.0);

        try {
            conta.saca(210.0);
        } catch (SaldoInsuficienteException ex) {
            System.out.println("Ex: " + ex.getMessage());
        }

        System.out.println(conta.getSaldo());
    }
}
