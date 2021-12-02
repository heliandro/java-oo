public class TesteSistema {
    public static void main(String[] args) {
        Gerente g1 = new Gerente();
        // g1.setSenha(2222);

        Administrador adm = new Administrador();
        // adm.setSenha(3333);

        SistemaInterno sistema = new SistemaInterno();
        // sistema.autentica(g1);
        // sistema.autentica(adm);
    }
}
