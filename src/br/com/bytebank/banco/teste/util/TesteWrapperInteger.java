package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.List;

public class TesteWrapperInteger {
    public static void main(String[] args) {
        
        // primitivo
        int[] idades = new int[5];
        // referencia
        String[] nomes = new String[5];

        int idade = 29; //Integer
        Integer idadeRef = Integer.valueOf(29); // wrapper | autoboxing
        int valor = idadeRef.intValue(); // unboxing
        
        List<Integer> numeros = new ArrayList<Integer>();
        numeros.add(29); //autoboxing => cria um objeto integer e guarda a ref.

        for(int numero : numeros) {
            System.out.println(numero);
        }
    }
}
