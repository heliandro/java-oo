package br.com.bytebank.banco.teste.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteDeserializacaoCliente2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        
        FileInputStream arquivo = new FileInputStream("cc.bin");
        ObjectInputStream ois = new ObjectInputStream(arquivo);

        ContaCorrente resultado = (ContaCorrente) ois.readObject();
        ois.close();

        System.out.println(resultado.getTitular().getNome());
    }
}
