import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //List<Conta> listaContas = new ArrayList<>();


        Cliente miguel = new Cliente();
        miguel.setNome("Miguel");

        Conta cc = new ContaCorrente(miguel);
        //listaContas.add(cc);

        Conta poupanca = new ContaPoupanca(miguel);
        //listaContas.add(poupanca);

        List<Conta> listaContas = Arrays.asList(cc, poupanca);

        cc.depositar(200);
        cc.transferir(50, poupanca);
        poupanca.sacar(25);
        cc.sacar(10);


        //cc.imprimirInfos();
        //poupanca.imprimirInfos();

        for (Conta i : listaContas){
            i.imprimirInfos();
        }

    }
}