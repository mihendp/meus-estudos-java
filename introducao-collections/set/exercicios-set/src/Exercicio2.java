import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Exercicio2 {
    public static void main(String[] args) {
        Set<LinguagemFavorita> linguagens = new HashSet<>(){{
            add(new LinguagemFavorita("Java", 1991, "IntelliJ"));
            add(new LinguagemFavorita("JavaScript", 1995, "Visual Studio Code"));
            add(new LinguagemFavorita("Kotlin", 2011, "IntelliJ"));
        }};
        System.out.println("Ordem aleatória: ");
        System.out.println(linguagens);

        System.out.println("Ordem de inserção: ");
        Set<LinguagemFavorita> linguagens1 = new LinkedHashSet<>(){{
            add(new LinguagemFavorita("Java", 1991, "IntelliJ"));
            add(new LinguagemFavorita("JavaScript", 1995, "Visual Studio Code"));
            add(new LinguagemFavorita("Kotlin", 2011, "IntelliJ"));
        }};
        System.out.println(linguagens1);

        System.out.println("Ordem Natual (Nome): ");
        Set<LinguagemFavorita> linguagens2 = new TreeSet<>(linguagens1);
        System.out.println(linguagens2);

        System.out.println("Ordem natural (IDE): ");
        Set<LinguagemFavorita> linguagens3 = new TreeSet<>(new ComparatorIDE());
        linguagens3.addAll(linguagens1);
        System.out.println(linguagens3);

        System.out.println("Ordem Ano de criação e nome");
        Set<LinguagemFavorita> linguagens4 = new TreeSet<>(new ComparatorAnoCriacaoNome());
        linguagens4.addAll(linguagens1);
        System.out.println(linguagens4);

        System.out.println("Ordem Nome, Ano de criação e IDE");
        Set<LinguagemFavorita> linguagens5 = new TreeSet<>(new ComparatorNomeAnoIde());
        linguagens5.addAll(linguagens1);
        System.out.println(linguagens5);
    }
}
