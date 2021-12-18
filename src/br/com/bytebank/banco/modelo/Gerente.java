package br.com.bytebank.banco.modelo;

// Gerente é um Funcionario e asssina um contrato Autenticavel
public class Gerente extends Funcionario implements Autenticavel {

    private AutenticacaoUtil autenticacaoUtil;

    public Gerente() {
        this.autenticacaoUtil = new AutenticacaoUtil();
    }

    public double getBonificacao() {
        System.out.println("chamou o metodo getBonificacao do gerente");
        return super.getSalario();
    }

    @Override
    public void setSenha(int senha) {
        this.autenticacaoUtil.setSenha(senha);
    }

    @Override
    public boolean autentica(int senha)  {
        return this.autenticacaoUtil.autentica(senha);
    }
}
