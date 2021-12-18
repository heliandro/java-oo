package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.CalculadorDeImposto;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.SeguroDeVida;

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
