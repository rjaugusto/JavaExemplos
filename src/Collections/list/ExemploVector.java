package Collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExemploVector {

    public static void main(String[] args) {

    List<String> esportes = new ArrayList<>();
    esportes.add("Futebol");
    esportes.add("Basquete");
    esportes.add("Tenis");
    esportes.add("Handebol");

    esportes.set(2,"Ping Pong");
    esportes.remove(3);
    esportes.remove("Handebol");

    Collections.sort(esportes);

    System.out.println(esportes.get(0));
        for (String esporte:esportes) {
            System.out.println(esporte);
        }
    }
}
