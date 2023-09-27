public class ContaPoupanca extends Conta{
    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    public void imprimirInfos() {
        System.out.println("=== Informações Conta Poupança ===");
        imprimirInfosComuns();
    }
}
