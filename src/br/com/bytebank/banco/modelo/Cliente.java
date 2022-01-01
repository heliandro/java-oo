package br.com.bytebank.banco.modelo;

import java.io.Serializable;

/**
 * Classe que representa um cliente no Bytebank.
 * 
 * @author Heliandro
 * @version 0.1
 * 
 */
public class Cliente implements Autenticavel, Serializable {

    private static final long serialVersionUID = 1L;

    private String nome;
    private String cpf;
    private String profissao;
    private AutenticacaoUtil autenticacaoUtil;

    public Cliente(String nome, String cpf, String profissao) {
        this.nome = nome;
        this.cpf = cpf;
        this.profissao = profissao;
        this.autenticacaoUtil = new AutenticacaoUtil();
    }

    public Cliente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return this.cpf;
    }


    public String getProfissao() {
        return this.profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }
    
    @Override
    public void setSenha(int senha) {
        this.autenticacaoUtil.setSenha(senha);
    }

    @Override
    public boolean autentica(int senha)  {
        return this.autenticacaoUtil.autentica(senha);
    }
}