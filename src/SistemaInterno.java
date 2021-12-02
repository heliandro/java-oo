public class SistemaInterno {
    
    private int senha = 2222;

    public void autentica(FuncionarioAutenticavel gerente) {
        boolean autenticou = gerente.autentica(this.senha);
        if (autenticou) {
            System.out.println("Pode entrar no sitema!");
        } else {
            System.out.println("Não pode entrar no sistema!");
        }
    }
}
