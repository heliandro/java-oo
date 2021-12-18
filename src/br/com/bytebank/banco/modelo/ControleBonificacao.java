package br.com.bytebank.banco.modelo;

public class ControleBonificacao {
    
    private double soma;

    public void registra(Funcionario funcionario) {
        double bonificacao = funcionario.getBonificacao();
        this.soma += bonificacao;
    }

    public double getSoma() {
        return this.soma;
    }
}
