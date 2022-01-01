package br.com.bytebank.banco.teste.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteSerializacaoCliente2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException, FileNotFoundException {
        
        Cliente cliente = new Cliente("Heliandro");
        cliente.setProfissao("Desenvolvedor");

        ContaCorrente cc = new ContaCorrente(111, 222);
        cc.setTitular(cliente);
        cc.deposita(222.3);
        

        FileOutputStream novoArquivo = new FileOutputStream("cc.bin");
        ObjectOutputStream oos = new ObjectOutputStream(novoArquivo);

        oos.writeObject(cc);
        oos.close();
    }
}
