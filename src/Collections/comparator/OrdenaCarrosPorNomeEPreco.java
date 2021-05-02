package Collections.comparator;

import java.util.Comparator;

public class OrdenaCarrosPorNomeEPreco implements Comparator<Carro> {
    @Override
    public int compare(Carro o1, Carro o2) {
        return o2.getPreco() - o1.getPreco();
    }
}