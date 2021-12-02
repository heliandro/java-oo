public class App {
    public static void main(String[] args) throws Exception {
        
        Gerente heliandro = new Gerente();
        heliandro.setSenha(2222);

        Administrador daniel = new Administrador();
        daniel.setSenha(3333);

        SistemaInterno sistema = new SistemaInterno();

        sistema.autentica(heliandro);
        sistema.autentica(daniel);
    }
}
