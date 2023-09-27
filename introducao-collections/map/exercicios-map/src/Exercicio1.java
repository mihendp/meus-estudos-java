import java.util.*;

public class Exercicio1 {
    public static void main(String[] args) {
        System.out.println("Crie um dicionário e relacione os estados e as populações");
        Map<String, Integer> nordeste = new HashMap<>(){{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
        }};
        Set<Map.Entry<String, Integer>> entries = nordeste.entrySet();
        for (Map.Entry<String, Integer> entry : entries){
            System.out.println("Estado: " + entry.getKey() + " - População: " + entry.getValue());
        }

        System.out.println("Substitua a população do estado RN por 3534165: ");
        nordeste.put("RN", 3534165);
        for (Map.Entry<String, Integer> entry : entries){
            System.out.println("Estado: " + entry.getKey() + " - População: " + entry.getValue());
        }

        System.out.println("Confira se o estado PB está adicionado, se não estiver adicione: ");
        System.out.println(nordeste.containsKey("PB"));
        nordeste.put("PB", 4039277);
        for (Map.Entry<String, Integer> entry : entries){
            System.out.println("Estado: " + entry.getKey() + " - População: " + entry.getValue());
        }

        System.out.println("Exiba a população de PE: " + nordeste.get("PE"));

        System.out.println("Exiba todos os estados na ordem em que foi informado: ");
        Map<String, Integer> nordeste1 = new LinkedHashMap<>(){{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
            put("PB", 4039277);
        }};
        for (Map.Entry<String, Integer> entry : nordeste1.entrySet()){
            System.out.println("Estado: " + entry.getKey() + " - População: " + entry.getValue());
        }

        System.out.println("Exiba o estado e as populações em ordem alfabética: ");
        Map<String, Integer> nordeste2 = new TreeMap<>(nordeste);

        for (Map.Entry<String, Integer> entry : nordeste2.entrySet()){
            System.out.println("Estado: " + entry.getKey() + " - População: " + entry.getValue());
        }

        System.out.println("Exiba o estado com menor população e sua quantidade: ");
        Integer menorPopulacao = Collections.min(nordeste2.values());
        String estadoMenorPopulacao = "";
        for (Map.Entry<String, Integer> entry : nordeste2.entrySet()){
            if (entry.getValue().equals(menorPopulacao)){
                estadoMenorPopulacao = entry.getKey();
                System.out.println("Estado: " + estadoMenorPopulacao + " - População: " + menorPopulacao);
            }
        }

        System.out.println("Exiba o estado com maior população e sua quantidade: ");
        Integer maiorPopulacao = Collections.max(nordeste2.values());
        String estadoMaiorPopulacao = "";
        for (Map.Entry<String, Integer> entry : nordeste2.entrySet()){
            if (entry.getValue().equals(maiorPopulacao)){
                estadoMaiorPopulacao = entry.getKey();
                System.out.println("Estado: " + estadoMaiorPopulacao + " - População: " + maiorPopulacao);
            }
        }

        Iterator<Integer> iterator = nordeste2.values().iterator();
        int soma = 0;
        while (iterator.hasNext()){
            soma += iterator.next();
        }
        System.out.println("Exiba a soma da população de todos os estados: " + soma);
        System.out.println("Exiba a média da população de todos os estados: " + soma/nordeste2.size());

        System.out.println("Remova os estados com a população menor que 4 milhões: ");
        Iterator<Integer> iterator1 = nordeste2.values().iterator();
        while (iterator1.hasNext()){
            Integer next = iterator1.next();
            if (next < 4000000){
                iterator1.remove();
            }
        }
        for (Map.Entry<String, Integer> entry : nordeste2.entrySet()){
            System.out.println("Estado: " + entry.getKey() + " - População: " + entry.getValue());
        }

        System.out.println("Apague o dicionário de estados: ");
        nordeste.clear();
        System.out.println(nordeste);
        System.out.println("Verifique se o dicionário está vazio: " + nordeste.isEmpty());


    }
}