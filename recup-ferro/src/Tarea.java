import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Tarea {
    private String descripcion;
    private LocalDate fecha;
    private Sector sector;
    private List<Voluntario> voluntarios = new ArrayList<>();

    public Tarea(String descripcion, LocalDate fecha, Sector sector) {
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.sector = sector;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Sector getSector() {
        return sector;
    }

    public void setSector(Sector sector) {
        this.sector = sector;
    }

    public void addVoluntario (Voluntario voluntario) {
        if (voluntario != null) {
            this.voluntarios.add(voluntario);
        }
    }

    @Override
    public String toString() {
        return "Tarea{" +
                "descripcion='" + descripcion + '\'' +
                ", fecha=" + fecha +
                ", sector=" + sector +
                '}';
    }
}
