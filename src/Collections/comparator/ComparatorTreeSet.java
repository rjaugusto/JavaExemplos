package Collections.comparator;

import java.util.Collections;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class ComparatorTreeSet {

    public static void main(String[] args) {
        Set<Estudante> estudantes = new TreeSet<Estudante>();

        estudantes.add(new Estudante("Pedro",19));
        estudantes.add(new Estudante("Carlos",23));
        estudantes.add(new Estudante("Mariana",21));
        estudantes.add(new Estudante("João",18));
        estudantes.add(new Estudante("Thiago",20));
        estudantes.add(new Estudante("George",22));
        estudantes.add(new Estudante("Larissa",21));

        System.out.println(estudantes);


    }
}
