package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.GuardadorDeContas;

public class TesteGuardadorDeContas {
    public static void main(String[] args) {
        
        GuardadorDeContas guardador = new GuardadorDeContas();

        ContaCorrente cc1 = new ContaCorrente(22, 11);
        guardador.adiciona(cc1);

        ContaCorrente cc2 = new ContaCorrente(22, 22);
        guardador.adiciona(cc2);

        int tamanho = guardador.getQuantidadeDeElementos();
        System.out.println(tamanho);

        Conta conta = guardador.getReferencia(1);
        System.out.println(conta.toString());
    }
}
