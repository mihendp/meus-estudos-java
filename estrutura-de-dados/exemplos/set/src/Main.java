import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<Carro> hashSetCarros = new HashSet<>();

        hashSetCarros.add(new Carro(2011, "Ford"));
        hashSetCarros.add(new Carro(2021, "Fiat"));
        hashSetCarros.add(new Carro(2010, "Chevrolet"));
        hashSetCarros.add(new Carro(2013, "Zip"));
        hashSetCarros.add(new Carro(2019, "Alfa Romeo"));

        System.out.println(hashSetCarros);
        System.out.println();

        Set<Carro> treeSetCarros = new TreeSet<>();
        treeSetCarros.add(new Carro(2011, "Ford"));
        treeSetCarros.add(new Carro(2021, "Fiat"));
        treeSetCarros.add(new Carro(2010, "Chevrolet"));
        treeSetCarros.add(new Carro(2013, "Zip"));
        treeSetCarros.add(new Carro(2019, "Alfa Romeo"));

        System.out.println(treeSetCarros);
    }
}