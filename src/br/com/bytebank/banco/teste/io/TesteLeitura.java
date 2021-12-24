package br.com.bytebank.banco.teste.io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class TesteLeitura {
    public static void main(String[] args) throws IOException {
        

        // fluxo de entrada com arquivo
        FileInputStream fis = new FileInputStream("lorem.txt");
        InputStreamReader isr = new InputStreamReader(fis); // transforma bytes em characteres
        BufferedReader br = new BufferedReader(isr); // transformando characters para buffer de caracteres

        String linha = br.readLine();

        while(linha != null) {
            System.out.println(linha);
            linha = br.readLine();
        }

        br.close();
    }
}
