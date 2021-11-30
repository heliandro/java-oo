public class App {
    public static void main(String[] args) throws Exception {
        
        Cliente heliandro = new Cliente("Heliandro Lavor", "555.444.222.77", "Tech Lead");
        Cliente kivia = new Cliente("Kivia Lavor", "111.333.888.55", "Designer");

        Conta contaDoHeliandro = new Conta(10000, heliandro);
        Conta contaDaKivia = new Conta(500, kivia);

        contaDoHeliandro.deposita(700);

    }
}
