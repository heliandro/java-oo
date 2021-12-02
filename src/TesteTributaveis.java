public class TesteTributaveis {
    public static void main(String[] args) {
        
        ContaCorrente cc = new ContaCorrente(111, 111);
        cc.deposita(100.0);

        SeguroDeVida seguro = new SeguroDeVida();

        CalculadorDeImposto calculadorDeImposto = new CalculadorDeImposto();
        calculadorDeImposto.registra(cc);
        calculadorDeImposto.registra(seguro);

        System.out.println(calculadorDeImposto.getTotalImposto());
    }
}
