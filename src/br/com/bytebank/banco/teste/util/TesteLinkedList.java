package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.LinkedList;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteLinkedList {
    public static void main(String[] args) {

        LinkedList<Conta> lista = new LinkedList<Conta>();

        ContaCorrente cc1 = new ContaCorrente(22, 11);
        lista.add(cc1);

        ContaCorrente cc2 = new ContaCorrente(22, 22);
        lista.add(cc2);

        System.out.println("Tamanho: " + lista.size());

        Conta ref = lista.get(0);
        System.out.println(ref);

        lista.remove(0);
        System.out.println("Tamanho: " + lista.size());

        ContaCorrente cc3 = new ContaCorrente(33, 311);
        lista.add(cc3);
        ContaCorrente cc4 = new ContaCorrente(33, 322);
        lista.add(cc4);

        for(Conta oRef : lista) {
            System.out.println(oRef);
        }
    }
}
