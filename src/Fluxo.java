public class Fluxo {
	public static void main(String args[]) {
		System.out.println("Ini do main");
        try {
            metodo1();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
		System.out.println("Fim do main");
	}
	
	public static void metodo1() throws MinhaException {
		System.out.println("Ini do metodo1");
		metodo2();
		System.out.println("Fim do metodo1");
	}
	
	public static void metodo2() throws MinhaException {
		System.out.println("Ini do metodo2");
        // for(int i = 1; i <= 5; i++) {
        //     System.out.println(i);
        //     int a = i / 0;
        // }
        throw new MinhaException("Deu erro!!");
		// System.out.println("Fim do metodo2");
	}
}