public class Gerente extends Funcionario {
    
    private int senha;


    public boolean autentica(int senha) {
        if (this.senha == senha) {
            return true;
        }
        return false;
    }

    public double getBonificacao() {
        System.out.println("chamou o metodo getBonificacao do gerente");
        return super.getSalario();
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

}
