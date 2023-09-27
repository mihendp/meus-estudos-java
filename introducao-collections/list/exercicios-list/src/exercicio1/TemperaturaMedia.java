package exercicio1;

public class TemperaturaMedia {
    private double temperatura;
    private String mes;

    public TemperaturaMedia(double temperatura, String mes) {
        this.temperatura = temperatura;
        this.mes = mes;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    @Override
    public String toString() {
        return "exercicio1.TemperaturaMedia{" +
                "temperatura=" + temperatura +
                ", mes='" + mes + '\'' +
                '}';
    }
}
