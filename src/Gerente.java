public class Gerente extends Funcionario {

    public double getBonificacao() {
        System.out.println("chamou o metodo getBonificacao do gerente");
        return super.getSalario();
    }

}
