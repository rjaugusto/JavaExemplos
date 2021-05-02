package Collections.comparator;

import java.util.*;

public class ComparaCarros {

    public static void main(String[] args) {


        List<Carro> carros = new ArrayList<Carro>();

        carros.addAll(Arrays.asList(new Carro(1000,"Astra"),new Carro(200,"ABmborguini"),new Carro(300, "Fiesta")));


      //  Collections.sort(carros);

        //System.out.println(carros);

       // carros.sort((f,s)-> f.getPreco()-s.getPreco());
        //Collections.sort(carros, Comparator.comparing(carro -> carro.getNome()));

        carros.sort(Comparator.comparingInt(carro -> carro.getPreco()));

        System.out.println(carros);
    }
}
