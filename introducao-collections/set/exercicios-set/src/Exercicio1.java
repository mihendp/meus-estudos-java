import java.util.*;

public class Exercicio1 {
    public static void main(String[] args) {
        Set<String> arcoIris = new HashSet<>(Arrays.asList("Vermelho", "Laranja", "Amarelo", "Verde", "Azul", "Anil", "Violeta"));
        System.out.println("Exiba todas as cores uma abaixo da outra");
        for (String cor : arcoIris){
            System.out.println(cor);
        }

        System.out.println("Quantidade de cores que o arco-íris tem: " + arcoIris.size());

        System.out.println("Exiba todas as cores em ordem alfabética: ");
        Set<String> arcoIris1 = new TreeSet<>(arcoIris);
        System.out.println(arcoIris1);

        System.out.println("Exiba as cores na ordem inversa que foi informada: ");
        List<String> arcoIris2 = new ArrayList<>(arcoIris1);
        Collections.reverse(arcoIris2);
        System.out.println(arcoIris2);

        System.out.println("Exiba as cores que começam com a letra v: ");
        Set<String> arcoIris3 = new HashSet<>();
        Iterator<String> iterator = arcoIris.iterator();
        while (iterator.hasNext()){
            String next = iterator.next();
            if (next.charAt(0) == 'V'){
                arcoIris3.add(next);
            }
        }
        System.out.println(arcoIris3);

        Iterator<String> iterator1 = arcoIris1.iterator();
        System.out.println("Remova todas as cores que não começam com a letra v: ");
        while(iterator1.hasNext()){
            String next = iterator1.next();
            if (next.charAt(0) != 'V'){
                arcoIris.remove(next);
            }
        }
        System.out.println(arcoIris);

        System.out.println("Limpe o conjunto e confira se o conjunto está vazio: ");
        arcoIris.clear();
        System.out.println(arcoIris.isEmpty());
    }
}