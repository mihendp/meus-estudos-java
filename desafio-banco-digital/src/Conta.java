public abstract class Conta implements IConta {
    //Atributos
    private static final int AGENCIA = 1;
    private static int sequencial = 1;

    protected int numero;
    protected int agencia;
    protected double saldo = 0;
    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.numero = sequencial++;
        this.agencia = AGENCIA;
        this.cliente = cliente;
    }

    public int getNumero() {
        return numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void sacar(double valor) {
        saldo -= valor;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    public void imprimirInfosComuns() {
        System.out.println(String.format("Titular: %s", cliente.getNome()));
        System.out.println(String.format("Agência: %d", agencia));
        System.out.println(String.format("Numero: %d", numero));
        System.out.println(String.format("Saldo: %.2f", saldo));
    }
}
