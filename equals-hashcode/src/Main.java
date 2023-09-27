import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Carro> listaCarros = new ArrayList<>();

        listaCarros.add(new Carro(2012, "Ford"));
        listaCarros.add(new Carro(2015, "Chevrolet"));
        listaCarros.add(new Carro(2012, "Volkswagen"));

        System.out.println(listaCarros.contains(new Carro(2012, "Ford")));
        System.out.println(new Carro(2012, "Ford").hashCode());
        System.out.println(new Carro(2012, "Ford").hashCode());

        Carro carro1 = new Carro(2012, "Ford");
        Carro carro2 = new Carro(2012, "Chevrolet");

        System.out.println(carro1.equals(carro2));
    }
}