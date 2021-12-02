public class LiderTecnico extends Funcionario {
    
    public double getBonificacao() {
        System.out.println("chamou o metodo getBonificacao do lider tecnico");
        return super.getBonificacao() + 100;
    }

}
