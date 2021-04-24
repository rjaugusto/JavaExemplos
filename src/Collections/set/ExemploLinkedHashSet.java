package Collections.set;

import java.util.LinkedHashSet;
import java.util.Set;

// Mantem a ordem natural de inserção
public class ExemploLinkedHashSet {
    public static void main(String[] args) {
        Set<Integer> sequenciaNumerica = new LinkedHashSet<>();
        sequenciaNumerica.add(1);
        sequenciaNumerica.add(16);
        sequenciaNumerica.add(2);
        sequenciaNumerica.add(8);
        sequenciaNumerica.add(4);

        System.out.println(sequenciaNumerica);

        //Mantem sequencia

    }

}
