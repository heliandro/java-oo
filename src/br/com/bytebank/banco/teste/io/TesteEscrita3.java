package br.com.bytebank.banco.teste.io;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class TesteEscrita3 {
    public static void main(String[] args) throws IOException {
        
        // PrintStream ps = new PrintStream("lorem2.txt");
        PrintWriter ps = new PrintWriter("lorem2.txt");
        
        ps.println("Testeeeee");
        ps.println();
        ps.println();
        ps.println("sadusudh asd ashduhasduhasuhd");

        ps.close();
    }
}
