package br.com.bytebank.banco.modelo;

public class LiderTecnico extends Funcionario {
    
    public double getBonificacao() {
        System.out.println("chamou o metodo getBonificacao do lider tecnico");
        return 100;
    }

}
