package OperadorTernario;

import java.util.ArrayList;
import java.util.List;

//Operador ternário
//O operador ternário é um recurso para tomada de decisões com objetivo similar ao do if/else, mas que é codificado em apenas uma linha.
//(expressão booleana) ? código 1 : código 2;
public class ExemploOperadorTernario {

    public static void main(String[] args) {

        Boolean verdadeiro = false;
        System.out.println( verdadeiro ? "É verdadae":"É Falso");

        List<String> estudantes = new ArrayList<>();

        estudantes.add("Pedro");
        estudantes.add("Thayse");
        estudantes.add("Marcelo");
        estudantes.add("Carla");
        estudantes.add("Juliana");
        estudantes.add("Thiago");
        estudantes.add("Rafael");

        System.out.println(estudantes.stream().anyMatch(e-> e.contains("T")) ? "Contém" : "Não contém");

    }
}
