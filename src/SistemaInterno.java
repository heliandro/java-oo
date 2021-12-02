public class SistemaInterno {
    
    private int senha = 2222;

    public void autentica(Autenticavel pessoa) {
        boolean autenticou = pessoa.autentica(this.senha);
        if (autenticou) {
            System.out.println("Pode entrar no sitema!");
        } else {
            System.out.println("Não pode entrar no sistema!");
        }
    }
}
