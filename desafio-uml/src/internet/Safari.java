package internet;

public class Safari extends NavegadorDeInternet{

    @Override
    public void exibirPagina(int pagina) {
        System.out.println("Exibindo a página: " + pagina);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando uma nova aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando a página atual");
    }
}
