import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExemploOrdenacaoList {
/*Dadas as seguintes informações sobre gfatos, crie uma lista
e ordene essa lista exibindo:
(nome - idade - cor);

Gato 1 = nome: Jon, idade: 18, cor: preto
Gato 2 = nome: simba, idade : 6, cor: tigrado
Gato 3 = nome; Jon, idade 12, cor: amarelo
 */
    public static void main(String[] args) {
        List<Gato> listGatos = new ArrayList<>(){{
            add(new Gato("Jon", 18, "preto"));
            add(new Gato("Simba", 6, "tigrado"));
            add(new Gato("Jon", 12, "amarelo"));
        }};

        System.out.println("--\tOrdem de Inserção\t--");
        System.out.println(listGatos);

        System.out.println("--\tOrdem de aleatória\t--");
        Collections.shuffle(listGatos);
        System.out.println(listGatos);

        System.out.println("--\tOrdem Natual (Nome)\t--");
        Collections.sort(listGatos);
        System.out.println(listGatos);

        System.out.println("--\tOrdem Idade)\t--");
        listGatos.sort(new ComparatorIdade());
        System.out.println(listGatos);

        System.out.println("--\tOrdem Cor)\t--");
        listGatos.sort(new ComparatorCor());
        System.out.println(listGatos);

        System.out.println("--\tOrdem Nome/Cor/Idade)\t--");
        listGatos.sort(new ComparatorNomeCorIdade());
        System.out.println(listGatos);

    }
}

class Gato implements Comparable<Gato>{
    private String nome;
    private Integer idade;
    private String cor;

    public Gato(String nome, Integer idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getCor() {
        return cor;
    }

    @Override
    public String toString() {
        return "Gato{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cor='" + cor + '\'' +
                '}';
    }

    @Override
    public int compareTo(Gato gato) {
        return this.getNome().compareToIgnoreCase(gato.getNome());
    }
}

class ComparatorIdade implements Comparator<Gato> {
    @Override
    public int compare(Gato g1, Gato g2) {
        return Integer.compare(g1.getIdade(), g2.getIdade());
    }
}
    class ComparatorCor implements Comparator<Gato>{
    @Override
    public int compare(Gato g1, Gato g2) {
        return g1.getCor().compareToIgnoreCase(g2.getCor());
    }
}

class ComparatorNomeCorIdade implements Comparator<Gato>{

    @Override
    public int compare(Gato g1, Gato g2) {
        int nome = g1.getNome().compareToIgnoreCase(g2.getNome());
        if (nome != 0) return nome;

        int cor = g1.getCor().compareTo(g2.getCor());
        if (cor != 0) return cor;

        return Integer.compare(g1.getIdade(), g2.getIdade());
    }
}
