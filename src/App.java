public class App {
    public static void main(String[] args) throws Exception {
        
        Cliente heliandro = new Cliente("Heliandro", "555.444.222.77", "Tech Lead");
        Cliente kivia = new Cliente("Kivia", "111.333.888.55", "Designer");

        Conta contaDoHeliandro = new Conta(1234, 77721, heliandro);
        Conta contaDaKivia = new Conta(1234, 45522, kivia);

        contaDoHeliandro.deposita(700);
        contaDaKivia.deposita(500);
        heliandro.setNome("Heliandro Lavor");

        System.out.println(contaDoHeliandro.getNumero());
        System.out.println(contaDoHeliandro.getTitular().getNome());
        contaDoHeliandro.getTitular().setProfissao("Dev Master");
        System.out.println(contaDoHeliandro.getTitular().getProfissao());
        System.out.println(Conta.getTotal());
    }
}
