import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Capacitacion {
    private String tema;
    private LocalDate fecha;
    private Capacitador capacitador;
    private List<Voluntario> asistentes = new ArrayList<>();

    public Capacitacion(String tema, LocalDate fecha, Capacitador capacitador) {
        this.tema = tema;
        this.fecha = fecha;
        this.capacitador = capacitador;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Capacitador getCapacitador() {
        return capacitador;
    }

    public void setCapacitador(Capacitador capacitador) {
        this.capacitador = capacitador;
        capacitador.setCapacitacion(this);
    }

    public List<Voluntario> getAsistentes() {
        return asistentes;
    }

    public void setAsistentes(List<Voluntario> asistentes) {
        this.asistentes = asistentes;
    }

    public void addAsistente (Voluntario voluntario) {
        if (voluntario != null ) {
            this.asistentes.add(voluntario);
        }
    }

    public void mostrarAsistentes () {
        for (Voluntario a : asistentes) {
            System.out.println("Nombre: " + a.getNombre() + " DNI: " + a.getDni());
        }
    }

    @Override
    public String toString() {
        return "Capacitacion{" +
                "tema='" + tema + '\'' +
                ", fecha=" + fecha +
                ", capacitador=" + capacitador +
                ", asistentes=" + asistentes +
                '}';
    }
}
