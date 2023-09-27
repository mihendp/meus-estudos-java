package exercicio1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<TemperaturaMedia> temperaturaMediaList = new ArrayList<>(){{
            add(new TemperaturaMedia(35.6, "Janeiro"));
            add(new TemperaturaMedia(32.6, "Fevereiro"));
            add(new TemperaturaMedia(30.9, "Março"));
            add(new TemperaturaMedia(27.8, "Abril"));
            add(new TemperaturaMedia(38d, "Maio"));
            add(new TemperaturaMedia(25.9, "Junho"));
        }};

        Iterator<TemperaturaMedia> iterator = temperaturaMediaList.iterator();
        double soma = 0d;
        while (iterator.hasNext()){
            double next = iterator.next().getTemperatura();
            soma += next;
        }

        System.out.println("Média de temperatura dos 6 meses: " + soma/temperaturaMediaList.size());
        System.out.println("Meses que tiveram sua média maior que a média de temperatura dos 6 meses: ");
        for (TemperaturaMedia temp : temperaturaMediaList){
            if (temp.getTemperatura() > (soma/temperaturaMediaList.size())){
                System.out.println(temp.getMes());
            }
        }
    }
}