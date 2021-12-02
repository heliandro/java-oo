// Gerente é um Funcionario e asssina um contrato Autenticavel
public class Gerente extends Funcionario implements Autenticavel {

    private int senha;

    public double getBonificacao() {
        System.out.println("chamou o metodo getBonificacao do gerente");
        return super.getSalario();
    }

    @Override
    public void setSenha(int senha) {
        this.senha = senha;
    }

    @Override
    public boolean autentica(int senha)  {
        if (this.senha == senha) {
            return true;
        }
        return false;
    }
}
