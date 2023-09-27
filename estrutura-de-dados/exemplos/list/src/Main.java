import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Carro> listCarros = new ArrayList<>();

        listCarros.add(new Carro(2012, "Ford"));
        listCarros.add(new Carro(2013, "Chevrolet"));
        listCarros.add(new Carro(2011, "Fiat"));
        listCarros.add(new Carro(2010, "Peugeot"));

        System.out.println(listCarros.contains(new Carro(2012, "Ford")));

        System.out.println(listCarros.get(2));

        System.out.println(listCarros.indexOf(new Carro(2011, "Fiat")));

        System.out.println(listCarros.remove(2));
        System.out.println(listCarros);

    }
}