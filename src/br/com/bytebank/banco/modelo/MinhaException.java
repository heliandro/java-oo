package br.com.bytebank.banco.modelo;

public class MinhaException extends Exception {
    
    MinhaException(String mensagem) {
        super(mensagem);
    }

    MinhaException(){}
}
