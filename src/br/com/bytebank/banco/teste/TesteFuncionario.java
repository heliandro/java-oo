package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Autenticavel;
import br.com.bytebank.banco.modelo.Gerente;

public class TesteFuncionario {
    public static void main(String[] args) {
        
        Autenticavel referencia = new Gerente();
        referencia.setSenha(2222);
        System.out.println(referencia.autentica(2222));

        Gerente g1 = new Gerente();
        g1.setNome("Heliandro");
        g1.setCpf("22211155513");
        g1.setSalario(5000.0);

        System.out.println(g1.getNome());
        System.out.println(g1.getCpf());
        System.out.println(g1.getSalario());

        // g1.setSenha(2222);
        boolean autenticou = g1.autentica(2222);
        
        System.out.println(autenticou);
        System.out.println(g1.getBonificacao());
    }
}
