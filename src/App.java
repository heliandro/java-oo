public class App {
    public static void main(String[] args) throws Exception {
        
        Funcionario heliandro = new Funcionario();
        heliandro.setNome("Heliandro Lavor");
        heliandro.setCpf("223355646-9");
        heliandro.setSalario(5000.80);

        System.out.println(heliandro.getNome());
        System.out.println(heliandro.getBonificacao());
    }
}
