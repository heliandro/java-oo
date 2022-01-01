package br.com.bytebank.banco.teste.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import br.com.bytebank.banco.modelo.Cliente;

public class TesteSerializacaoCliente {
    public static void main(String[] args) throws IOException, ClassNotFoundException, FileNotFoundException {
        
        Cliente cliente = new Cliente("Heliandro");
        cliente.setProfissao("Desenvolvedor");
        

        FileOutputStream novoArquivo = new FileOutputStream("cliente.bin");
        ObjectOutputStream oos = new ObjectOutputStream(novoArquivo);

        oos.writeObject(cliente);
        oos.close();

        FileInputStream arquivo = new FileInputStream("cliente.bin");
        ObjectInputStream ois = new ObjectInputStream(arquivo);

        Cliente resultado = (Cliente) ois.readObject();
        ois.close();

        System.out.println(resultado.getNome());
    }
}