import java.util.Objects;

public class Carro {
    private int ano;
    private String marca;

    public Carro(int ano, String marca) {
        this.ano = ano;
        this.marca = marca;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Carro carro = (Carro) o;
        return ano == carro.ano && Objects.equals(marca, carro.marca);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ano, marca);
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "ano=" + ano +
                ", marca='" + marca + '\'' +
                '}';
    }
}
