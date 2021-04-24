package MethodReference;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class Java8_MethodReference {

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
        integers.stream().forEach((i)-> System.out.println(i)); //Sem Method reference
        integers.stream().forEach(System.out::println); //Com Method Reference


        //Tipos de Method Reference
        // 1 - Com métodos estáticos
        integers.stream().map(n -> multipliquePorDois(n)).forEach(System.out::println);//Sem Method reference
        integers.stream().map(Java8_MethodReference::multipliquePorDois).forEach(System.out::println);//Com Method Reference

        // 2 - Com construtores
        integers.stream().map(n -> new BigDecimal(n)).forEach(System.out::println);//Sem Method reference
        integers.stream().map(BigDecimal::new).forEach(System.out::println);//Com Method reference

        // 3 - Várias Instâncias
        integers.stream().map(n -> n.doubleValue()).forEach(System.out::println);//Sem Method reference
        integers.stream().map(Integer::doubleValue).forEach(System.out::println);//Com Method reference

        // 4 - Com uma única Instância
        BigDecimal dois = new BigDecimal(2);
        integers.stream()
                .map(BigDecimal::new)
                .map((b)-> dois.multiply(b))
                  .forEach(System.out::println);//Sem Method reference

        integers.stream()
                .map(BigDecimal::new)
                .map(dois::multiply)
                .forEach(System.out::println);//Com Method reference
    }

    private static Integer multipliquePorDois(Integer i){
        return i*2;
    }
}
