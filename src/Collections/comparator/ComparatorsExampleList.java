package Collections.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorsExampleList {

    public static void main(String[] args) {
        List<Estudante> estudantes = new ArrayList<>();

        estudantes.add(new Estudante("Pedro",19));
        estudantes.add(new Estudante("Carlos",23));
        estudantes.add(new Estudante("Mariana",21));
        estudantes.add(new Estudante("João",18));
        estudantes.add(new Estudante("Thiago",20));
        estudantes.add(new Estudante("George",22));
        estudantes.add(new Estudante("Larissa",21));

//        System.out.println("--ORDEM DE INSERÇÃO--");
//        System.out.println(estudantes);
//
//        System.out.println("--ORDEM NATURAL DOS NÚMEROS COM EXPRESSÃO LAMBDA--");
//        estudantes.sort((first,second)-> first.getIdade() -second.getIdade());
//        System.out.println(estudantes);
//
//        System.out.println("--ORDEM NATURAL INVERTIDA DOS NÚMEROS COM EXPRESSÃO LAMBDA--");
//        estudantes.sort((first,second)-> second.getIdade() - first.getIdade());
//        System.out.println(estudantes);

//        estudantes.sort(Comparator.comparingInt(Estudante::getIdade));
//        estudantes.sort(Comparator.comparingInt(Estudante::getIdade).reversed());


        Collections.sort(estudantes);
        System.out.println(estudantes);
        //Usando a implementação de comparação criada por nós mesmo
        Collections.sort(estudantes,new EstudanteOrdemIdadeReversaComparator());

    }
}
