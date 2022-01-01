package br.com.bytebank.banco.teste.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TesteSerializacao {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        
        String nome = "Heliandro Lavor";

        // FileOutputStream novoArquivo = new FileOutputStream("objeto.bin");
        // ObjectOutputStream oos = new ObjectOutputStream(novoArquivo);

        // oos.writeObject(nome);
        // oos.close();

        FileInputStream arquivo = new FileInputStream("objeto.bin");
        ObjectInputStream ois = new ObjectInputStream(arquivo);

        String resultado = (String) ois.readObject();
        ois.close();

        System.out.println(resultado);
    }
}
