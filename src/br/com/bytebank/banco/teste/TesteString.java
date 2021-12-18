package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteString {
    public static void main(String[] args) {
        
        String nome = "Alura";

        String outro = nome.replace("lu", "haha");
        System.out.println(outro);

        ContaCorrente cc = new ContaCorrente(111, 222);
        ContaPoupanca cp = new ContaPoupanca(333, 444);
        
        System.out.println(cc);
        System.out.println(cp);
    }
}
