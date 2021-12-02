public class App {
    public static void main(String[] args) throws Exception {
        
        Funcionario heliandro = new Funcionario();
        heliandro.setNome("Heliandro Lavor");
        heliandro.setCpf("2233556469");
        heliandro.setSalario(5000.80);

        System.out.println(heliandro.getNome());
        System.out.println(heliandro.getBonificacao());

        Gerente ramon = new Gerente();
        ramon.setNome("Ramonzito");
        ramon.setCpf("55577744499");
        ramon.setSalario(9000);

        System.out.println(ramon.getNome());
        System.out.println(ramon.getBonificacao());

        ramon.setSenha(2222);

        boolean autenticou = ramon.autentica(2222);

        System.out.println(autenticou);
    }
}
