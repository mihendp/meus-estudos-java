package iphone;

import internet.Safari;
import musica.IPod;
import telefonia.Telefone;

public class IPhone {
    public static void main(String[] args) {
        Telefone telefone = new Telefone();
        telefone.ligar("43990901010");
        telefone.atender();
        telefone.iniciarCorreioVoz();

        System.out.println("---------------------");

        IPod ipod = new IPod();
        ipod.selecionarMusica("Harry Styles - Matilda");
        ipod.tocar();
        ipod.pausar();

        System.out.println("---------------------");

        Safari safari = new Safari();
        safari.adicionarNovaAba();
        safari.exibirPagina(2);
        safari.atualizarPagina();
    }

}