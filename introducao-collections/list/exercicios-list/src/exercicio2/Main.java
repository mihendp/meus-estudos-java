package exercicio2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<String> respostas = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Telefonou para a vítima? Y/N");
        respostas.add(sc.next());

        System.out.println("Esteve no local do crime? Y/N");
        respostas.add(sc.next());

        System.out.println("Mora perto da vítima? Y/N");
        respostas.add(sc.next());

        System.out.println("Devia para a vítima? Y/N");
        respostas.add(sc.next());

        System.out.println("Já trabalhou com a vítima? Y/N");
        respostas.add(sc.next());

        System.out.println(respostas);

        List<String> respostasNegativas = new ArrayList<>();
        List<String> respostasPositivas = new ArrayList<>();

        for (String resp : respostas){
            if (resp.equalsIgnoreCase("Y")){
                respostasPositivas.add(resp);
            } else if (resp.equalsIgnoreCase("N")){
                respostasNegativas.add(resp);
            }
        }

        if (respostasPositivas.size() == 2){
            System.out.println("Suspeita");
        } else if (respostasPositivas.size() >=3 && respostasPositivas.size() <= 4){
            System.out.println("Cúmplice");
        } else if (respostasPositivas.size() == 5){
            System.out.println("Assassina");
        } else {
            System.out.println("Inocente");
        }
    }
}
