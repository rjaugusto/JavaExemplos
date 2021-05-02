package Collections.map;

import java.util.HashMap;
import java.util.Map;

public class ExemploHashMap {

    public static void main(String[] args) {

        Map<String,Integer> campeoesMundiaisFifa = new HashMap<>();

        campeoesMundiaisFifa.put("Brasil", 5);
        campeoesMundiaisFifa.put("Alemanha", 4);
        campeoesMundiaisFifa.put("Italia",4);
        campeoesMundiaisFifa.put("Uruaguai",2);
        campeoesMundiaisFifa.put("Argentina",2);
        campeoesMundiaisFifa.put("França",2);
        campeoesMundiaisFifa.put("Inglaterra",1);
        campeoesMundiaisFifa.put("Espanha",1);

        //System.out.println(campeoesMundiaisFifa.set(3));

        campeoesMundiaisFifa.put(null,6); // Atualiza o valor da chave

        System.out.println(campeoesMundiaisFifa);



        var argentina = campeoesMundiaisFifa.get("Argentina");// Busca pela chave retornando o valor
        System.out.println(argentina);
        var franca = campeoesMundiaisFifa.containsKey("França"); // verifica se existe uma chave
        System.out.println(franca);

        campeoesMundiaisFifa.remove("França"); // remove uma chave/valor

        var brasil = campeoesMundiaisFifa.containsValue("Brasil"); // Verifica se existe um valor
        System.out.println(brasil);

        var size = campeoesMundiaisFifa.size(); //retorna o tamanho do mapa
        System.out.println(size);

        //Navagar no Mapa utilizando o método enteySet

        for (Map.Entry<String,Integer> entry :campeoesMundiaisFifa.entrySet()) {
            System.out.println(entry.getKey() +"--"+ entry.getValue());
        }

        //Navagar no Mapa utilizando o método KeySet

        for (String key: campeoesMundiaisFifa.keySet()) {
            System.out.println(key + "-" + campeoesMundiaisFifa.get(key));
        }
        campeoesMundiaisFifa.clear(); // apaga todos os registros

        System.out.println(campeoesMundiaisFifa);
    }
}
