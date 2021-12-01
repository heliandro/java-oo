public class App {
    public static void main(String[] args) throws Exception {
        
        Cliente heliandro = new Cliente("Heliandro", "555.444.222.77", "Tech Lead");
        Cliente kivia = new Cliente("Kivia", "111.333.888.55", "Designer");

        Conta contaDoHeliandro = new Conta(10000, heliandro);
        Conta contaDaKivia = new Conta(500, kivia);

        contaDoHeliandro.deposita(700);
        contaDoHeliandro.setNumero(1337);
        heliandro.setNome("Heliandro Lavor");

        System.out.println(contaDoHeliandro.getNumero());
        System.out.println(contaDoHeliandro.getTitular().getNome());
        contaDoHeliandro.getTitular().setProfissao("Dev Master");
        System.out.println(contaDoHeliandro.getTitular().getProfissao());
    }
}
