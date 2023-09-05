package candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;


public class ProcessoSeletivo {
    public static void main(String[] args) {
//        analisarCandidato(1900.0);
//        analisarCandidato(2200.0);
//        analisarCandidato(2000.0);

        //selecaoCandidato();
        //listaCandidatos();
        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO"};
        for (String candidato : candidatos){
            entrandoEmContato(candidato);
        }
    }

    static void entrandoEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do{
            atendeu = atender();
            continuarTentando = !atendeu;
            if (continuarTentando){
                tentativasRealizadas++;
            } else {
                System.out.println("Contato realizado com sucesso");
            }


        }while (continuarTentando && tentativasRealizadas < 3);
        if (atendeu){
            System.out.println("Conseguimos realizar contato com o candidato " + candidato + " na tentativa " + tentativasRealizadas);
        } else {
            System.out.println("Não conseguimos realizar contato com o candidato " + candidato + " tentamos " + tentativasRealizadas + " vezes");
        }
    }

    //método auxiliar
    static boolean atender(){
        return new Random().nextInt(3)==1;
    }

    static void listaCandidatos(){
        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO"};


        System.out.println("Imprimindo candidato por índice");
        for (int i = 0; i < candidatos.length; i++) {
            System.out.println("O candidato selecionado de índice " + (i+1) + " é " + candidatos[i]);
        }

        System.out.println("Forma abreviada utilizando o for each");
        for (String candidato : candidatos){
            System.out.println("O candidato " + candidato + " foi selecionado.");
        }
    }
    static void selecaoCandidato(){
        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};
        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;

        while(candidatosSelecionados < 5 && candidatoAtual < candidatos.length){
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " solicitou o salário: " + salarioPretendido);
            if (salarioBase >= salarioPretendido){
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if(salarioBase > salarioPretendido){
            System.out.println("Ligar para o candidato");
        } else if(salarioBase == salarioPretendido){
            System.out.println("Ligar para o candidato com contra proposta");
        } else{
            System.out.println("Aguardar resultado dos demais candidatos");
        }
    }
}