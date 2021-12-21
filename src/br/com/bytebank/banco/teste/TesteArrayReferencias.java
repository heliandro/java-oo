package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayReferencias {
    public static void main(String[] args) {
        
        ContaCorrente[] contas = new ContaCorrente[5];
        
        for(int i = 0; i < contas.length; i++) {
            boolean isInit = i == 0;
            ContaCorrente cc = new ContaCorrente(22, isInit ? 10 : i * 10);    
            contas[i] = cc;
        }

        for(int i = 0; i < contas.length; i++) {
            System.out.println(contas[i].toString());
        }

        try {
            System.out.println( contas[7] );
        } catch (ArrayIndexOutOfBoundsException ex) {
            ex.printStackTrace();
        }
        
        try {
            contas[1] = null;
            System.out.println( contas[1].toString() );
        } catch (NullPointerException ex) {
            ex.printStackTrace();
        }
    }
}
