import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class Cultivo {
    private String especie;
    private TipoCultivo tipo;
    private LocalDate fechaSiembra;
    private List<Cosecha> cosechas = new ArrayList<>();

    public Cultivo(String especie, TipoCultivo tipo) {
        this.especie = especie;
        this.tipo = tipo;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public TipoCultivo getTipo() {
        return tipo;
    }

    public void setTipo(TipoCultivo tipo) {
        this.tipo = tipo;
    }

    public LocalDate getFechaSiembra() {
        return fechaSiembra;
    }

    public void setFechaSiembra(LocalDate fechaSiembra) {
        this.fechaSiembra = fechaSiembra;
    }

    public List<Cosecha> getCosechas() {
        return cosechas;
    }

    public void setCosechas(List<Cosecha> cosechas) {
        this.cosechas = cosechas;
    }

    public void addCosecha (Cosecha cosecha) {
        if (cosecha != null) {
            this.cosechas.add(cosecha);
            cosecha.setCultivo(this);
        }
    }

    public void removerCosecha (Cosecha cosecha) {
        if (cosecha != null) {
            this.cosechas.remove(cosecha);
        }
    }

    @Override
    public String toString() {
        return "Cultivo{" +
                "especie='" + especie + '\'' +
                ", tipo=" + tipo +
                ", fechaSiembra=" + fechaSiembra +
                ", cosechas=" + cosechas +
                '}';
    }
}
