package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayListEquals {
    public static void main(String[] args) {

        // ArrayList + Generics (Tipagem)
        ArrayList<Conta> lista = new ArrayList<Conta>();

        ContaCorrente cc1 = new ContaCorrente(22, 11);
        lista.add(cc1);

        ContaCorrente cc2 = new ContaCorrente(22, 22);
        lista.add(cc2);

        ContaCorrente cc3 = new ContaCorrente(22, 22);
        boolean existe = lista.contains(cc3);

        System.out.println("Já existe? " + existe);

        for(Conta conta : lista) {
            System.out.println(conta);
        }
    }
}
