package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.List;

public class TesteWrapperInteger {
    public static void main(String[] args) {

        Integer idadeRef = Integer.valueOf(29); // wrapper | autoboxing
        int valor = idadeRef.intValue(); // unboxing
        System.out.println(valor);
        
        List<Integer> numeros = new ArrayList<Integer>();
        numeros.add(29); //autoboxing => cria um objeto integer e guarda a ref.

        for(int numero : numeros) {
            System.out.println(numero);
        }
    }
}
