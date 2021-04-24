package Collections.set;

import java.util.Set;
import java.util.TreeSet;

//implementação de arvore binária
public class ExemploTreeSet {

    public static void main(String[] args) {
        Set<String> capitais = new TreeSet<>();

        capitais.add("Porto Alegre");
        capitais.add("Florianópolis");
        capitais.add("Curitiba");
        capitais.add("São Paulo");
        capitais.add("Rio De Janeiro");

        System.out.println(capitais);

        System.out.println(capitais.stream().findFirst()); //Retorna o elemento do topo da arvore



    }
}
