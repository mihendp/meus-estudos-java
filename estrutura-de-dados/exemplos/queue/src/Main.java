import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Carro> queueCarros = new LinkedList<>();

        queueCarros.add(new Carro(2010, "Ford"));
        queueCarros.add(new Carro(2012, "Chevrolet"));
        queueCarros.add(new Carro(2009, "Fiat"));

        System.out.println(queueCarros.add(new Carro(2018, "Peugeot")));
        System.out.println(queueCarros);
        System.out.println();

        System.out.println(queueCarros.offer(new Carro(2017, "Renault")));
        System.out.println(queueCarros);
        System.out.println();

        System.out.println(queueCarros.peek());
        System.out.println(queueCarros);
        System.out.println();

        System.out.println(queueCarros.poll());
        System.out.println(queueCarros.poll());
        System.out.println(queueCarros);
        System.out.println();

        System.out.println(queueCarros.isEmpty());
        System.out.println(queueCarros.size());
    }
}