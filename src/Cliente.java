public class Cliente {

    String nome;
    String cpf;
    String profissao;

    Cliente(String nome, String cpf, String profissao) {
        this.nome = nome;
        this.cpf = cpf;
        this.profissao = profissao;
    }

    Cliente(String nome) {
        this.nome = nome;
    }
}