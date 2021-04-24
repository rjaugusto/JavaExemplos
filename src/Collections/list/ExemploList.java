package Collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExemploList {

    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();

        nomes.add("Carlos"); // Adiciona um ítem na Lista
        nomes.add("Pedro");
        nomes.add("Juliana");
        nomes.add("Maria");
        nomes.add("João");
        nomes.add("Anderson");

        List<String> novosnomes = new ArrayList<>();

        novosnomes.add("Julio"); // Adiciona um ítem na Lista
        novosnomes.add("André");
        novosnomes.add("Francisco");
        novosnomes.add("Romualdo");

        nomes.addAll(novosnomes);

        System.out.println(nomes);

        Collections.sort(nomes); // Ordena a lista para ordem alfabética
        System.out.println(nomes);

        nomes.set(2,"Flora"); // Altera uma posição na lista
        System.out.println(nomes);

        nomes.remove(4);// Remove um elemento da lista por número de índice ou objeto
        nomes.remove("João");// Remove um elemento da lista por número de índice ou objeto
        System.out.println(nomes);

        String nome = nomes.get(1); // retorna um elemento do índice passado
        System.out.println(nome);

        int tamanho = nomes.size(); // retorna o tamanho da lista
        System.out.println(tamanho);

        var contem = nomes.contains("Flora"); // retorna true ou false na verificação se existe um objeto
        System.out.println(contem);

        var posicao = nomes.indexOf("Carlos");//retorna o índice do objeto pesquisado na lista, retonra -1 se bão encontrado

        // iteração via for
        for (String item: nomes) {
            System.out.println(item);
        }

        // iteração via Iterator
        var iterator = nomes.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println(nomes);
        nomes.clear(); // Limpa a lista
        System.out.println(contem);




    }
}
