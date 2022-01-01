package br.com.bytebank.banco.teste.io;

import java.io.File;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeitura2 {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(new File("contas.csv"), "UTF-8");
        
        while( scanner.hasNextLine() ) {
            String linha = scanner.nextLine();
            System.out.println( linha );

            Scanner linhaScanner = new Scanner(linha);
            linhaScanner.useLocale(Locale.US);
            linhaScanner.useDelimiter(",");

            ArrayList<Object> lista = new ArrayList<>();
            lista.add(linhaScanner.next()); // tipo
            lista.add(linhaScanner.nextInt()); // agencia
            lista.add(linhaScanner.nextInt()); // conta
            lista.add(linhaScanner.next()); // titular
            lista.add(linhaScanner.nextDouble()); // saldo

            Locale localizacao = new Locale("pt", "BR");
            String valorFormatado = String.format(
                localizacao,
                "Tipo: %s | agencia: %04d conta: %08d | titular: %s | saldo: %08.2f",
                lista.toArray()
            );
            System.out.println( valorFormatado );
            linhaScanner.close();
        }

        scanner.close();
    }
}
