package br.com.bytebank.banco.teste.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TesteEscrita2 {
    public static void main(String[] args) throws IOException {
        
        FileWriter fw = new FileWriter("lorem2.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        
        bw.write("Testeeeee");
        bw.newLine();
        bw.newLine();
        bw.write("sadusudh asd ashduhasduhasuhd");

        bw.close();
    }
}
