package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Administrador;
import br.com.bytebank.banco.modelo.Autenticavel;
import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Gerente;
import br.com.bytebank.banco.modelo.SistemaInterno;

public class TesteSistema {
    public static void main(String[] args) {

        Autenticavel g1 = new Gerente();
        g1.setSenha(2222);

        Autenticavel adm = new Administrador();
        adm.setSenha(3333);

        Autenticavel cli = new Cliente("Heliandro", "22233311113", "Diretor");
        cli.setSenha(2222);

        SistemaInterno sistema = new SistemaInterno();
        sistema.autentica(g1);
        sistema.autentica(adm);
        sistema.autentica(cli);
    }
}
