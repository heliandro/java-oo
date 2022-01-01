package br.com.bytebank.banco.teste.io;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class TesteUnicodeEconding {
    public static void main(String[] args) throws UnsupportedEncodingException {
        
        String c = "ç";
        System.out.println( c.codePointAt(0) );

        Charset charset = Charset.defaultCharset();
        System.out.println( charset.displayName() + "\n");

        byte[] bytes = c.getBytes("UTF-8");
        System.out.println( "Bytes: " + bytes.length + " | UTF-8");
        String cNovo = new String(bytes, StandardCharsets.UTF_8);
        System.out.println( cNovo + "\n");

        bytes = c.getBytes(StandardCharsets.UTF_16);
        System.out.println( "Bytes: " + bytes.length + " | UTF-16");
        cNovo = new String(bytes, StandardCharsets.UTF_16);
        System.out.println( cNovo + "\n");

        bytes = c.getBytes(StandardCharsets.US_ASCII);
        System.out.println( "Bytes: " + bytes.length + " | ASCII");
        cNovo = new String(bytes, StandardCharsets.US_ASCII);
        System.out.println( cNovo + "\n");
    }
}
