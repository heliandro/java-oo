public class App {
    public static void main(String[] args) throws Exception {
        
        Conta contaDoHeliandro = new Conta(10000, "Heliandro");
        Conta contaDaKivia = new Conta(500, "Kivia");

        System.out.println("Conta do : " + contaDoHeliandro.titular
            + " | saldo: " + contaDoHeliandro.saldo);

        System.out.println("Conta do : " + contaDaKivia.titular
            + " | saldo: " + contaDaKivia.saldo);

        System.out.println();


        double valorParaSaque = 2500;
        boolean saqueEfetuado = contaDoHeliandro.saca(valorParaSaque);

        if (saqueEfetuado) {
            System.out.printf("Saque no valor de %f efetuado com sucesso! \n", valorParaSaque);
        } else {
            System.err.println("Saldo insuficiente!");
        }


        double valorParaTransferencia = 1250.0;
        boolean transferenciaConcluida = contaDoHeliandro.transfere(valorParaTransferencia, contaDaKivia);

        if (transferenciaConcluida) {
            System.out.println("Conta do " + contaDoHeliandro.titular + " transferiu para conta da " + contaDaKivia.titular
                + " o valor de R$: " + valorParaTransferencia);
            System.out.println("Conta do Heliandro | saldo: " + contaDoHeliandro.saldo);
            System.out.println("Conta do Kivia | saldo: " + contaDaKivia.saldo);
        } else {
            System.err.println("Ops! ocorreu um erro ao transferir os valors | Saldo insuficiente!");
        }
    }
}
